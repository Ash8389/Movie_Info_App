package com.example.movierating

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.movierating.data.ActorsDetail
import com.example.movierating.data.AppViewModel
import com.example.movierating.data.MovieDetails
import com.example.movierating.data.getActor
import com.example.movierating.ui.theme.MovieRatingTheme
import com.example.movierating.widget.favourite
import kotlinx.coroutines.flow.StateFlow


@SuppressLint("SuspiciousIndentation")
@Composable
fun DetailScreen(
    viewModel: AppViewModel,
    modifier: Modifier = Modifier,
    movieId: String,
){
    val data by viewModel.getMovieById(movieId).collectAsStateWithLifecycle()
    val movie = if(data != null) data!! else return


    var openActorScreen by remember {
        mutableStateOf(false)
    }
    var expandDescriptionText by remember {
        mutableStateOf(false)
    }

    var selectActor by remember {
        mutableStateOf<ActorsDetail?>(null)
    }
        Surface(
            modifier = modifier
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.primary
        ){
            LazyColumn{
                item {
                    Column(modifier = Modifier.padding(3.dp)) {
                        DetailImage(imgUrl =  movie.poster)
                        Spacer(modifier = Modifier.padding(10.dp))
                        MovieName(
                            name = movie.title,
                            isFav = movie.isFavourite,
                            changeFav = {
                                if (!movie.isFavourite) {
                                    viewModel.addToFavourite(movie = movie)

                                } else {
                                    viewModel.removeFromFavourite(movie = movie)

                                }
                            }
                        )
                        MovieRelease(movie.year)
                        MovieRating(modifier = Modifier.size(25.dp), rating = movie.rating)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)){
                                    append("Genre: ")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)){
                                    append(movie.genre)
                                }
                            },
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Director(director = movie.director)
                        Spacer(modifier = Modifier.padding(5.dp))
                        MoviePlot(movie.plot,
                            expandText = expandDescriptionText,
                            onClick = { expandDescriptionText = !expandDescriptionText }
                        )
                    }
                    StarCastList(
                        movie.actors,
                        openActorScreen = {
                            Log.d("Actor", "Actor3")
                            openActorScreen = true
                            selectActor = it
                        }
                    )
                    Spacer(modifier = Modifier.padding(bottom = 5.dp))
                }

            }
        }
    if(openActorScreen)
        selectActor?.let {
            ActorScreen(
            closeActorScreen = {
                openActorScreen = !openActorScreen
                selectActor = null
            },
            actor = it
        )
        }
}

@Composable
private fun MovieName(
    name: String,
    isFav : Boolean,
    changeFav : () -> Unit,
    modifier: Modifier = Modifier
    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(2.dp))
        favourite(
            icon =  if(isFav) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder,
            modifier = Modifier
                .size(25.dp)
                .clickable { changeFav() }
        )
    }
}

@Composable
private fun MovieRelease(
    release: String
) {
    Row(
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
//            painter = painterResource(id = R.drawable.calendar_regular),
            imageVector = Icons.Filled.DateRange,
            contentDescription = "Release Date",
            modifier = Modifier.size(25.dp)
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(text = release)
    }
}

@Composable
fun Director(director : String, modifier: Modifier = Modifier) {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)) {
                append("Director: ")
            }
            withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                append(director)
            }
        },
        modifier = modifier,
        fontSize = 20.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

//@Preview(showBackground = true)
@Composable
private fun StarCast(
    modifier: Modifier = Modifier,
    name: String,
    openActorScreen : (ActorsDetail) -> Unit
) {

    val actor = getActor(name)
    val actorImage = ImageRequest.Builder(LocalContext.current)
        .data(actor?.profilePic)
        .crossfade(true)
        .build()

    Column(
        modifier = modifier
            .padding(horizontal = 5.dp)
            .width(130.dp)
            .clickable {
                Log.d("Actor", "Actor1")
                openActorScreen(actor!!)
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.size(70.dp),
            shape = CircleShape,
            color = Color.LightGray,
            tonalElevation = 5.dp,
            shadowElevation = 5.dp
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = actorImage),
                contentDescription = "starCast",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
private fun StarCastList(
    data: List<String>,
    openActorScreen: (ActorsDetail) -> Unit
) {
    Column {
        Text(modifier = Modifier.padding(bottom = 2.dp),
            text = "Actors: ",
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.padding(5.dp))
        LazyRow {
            items(data) {item->
                StarCast(
                    name = item,
                    openActorScreen = openActorScreen
                )
            }
        }
    }

}

@Composable
private fun MoviePlot(
    desc: String,
    expandText : Boolean,
    onClick : () -> Unit = {}
) {

        Box(modifier = Modifier
            .clickable { onClick() }
//            .let { if (expandText) it.fillMaxHeight() else it.height(80.dp) }
        ){
            Column {
                Text(
                    text = "Storyline: ",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 23.sp
                )
                Spacer(modifier = Modifier.padding(2.5.dp))
                Text(
                    text = desc,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 18.sp,
                    lineHeight = 25.sp,
                    textAlign = TextAlign.Justify,
                    overflow = if(expandText)TextOverflow.Visible else TextOverflow.Ellipsis
                )
            }

        }
}

@Composable
private fun DetailImage(
    modifier: Modifier = Modifier,
    imgUrl : String
) {
    val request = ImageRequest.Builder(LocalContext.current)
        .data(imgUrl)
        .crossfade(true)
        .build()
//    AsyncImage(model = request, contentDescription = null)
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(350.dp),
        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        shadowElevation = 5.dp,
        color = MaterialTheme.colorScheme.primary
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = request),
            contentDescription = "Spider man",
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(5.dp),
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MovieRatingTheme {
////            StarCastList()
//        DetailScreen(movie = MovieDetails(
//            id = "tt0499549",
//            title = "Avatar",
//            year = "2009",
//            genre = "Action, Adventure, Fantasy",
//            director = "James Cameron",
//            actors = listOf("Sam Worthington", "Zoe Saldana", "Sigourney Weaver", "Stephen Lang"),
//            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
//            poster = "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
//            images = listOf(
//                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
//                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
//            ),
//            rating = "7.9"
//        ),)
//    }
//}