package com.example.movierating

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.movierating.data.AppViewModel
import com.example.movierating.data.MovieDetails
import com.example.movierating.widget.favourite

@Composable
fun MovieCard(
    viewModel: AppViewModel,
    data : MovieDetails,
    itemClicked : (MovieDetails) -> Unit
) {
    var expand by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(top = 0.dp, bottom = 17.dp, start = 10.dp, end = 10.dp)
            .fillMaxSize(),
        shape = RoundedCornerShape(corner = CornerSize(15.dp)),
        elevation = cardElevation(5.dp),
        colors = cardColors(MaterialTheme.colorScheme.secondaryContainer),
        onClick = { itemClicked(data) }
    ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                MovieImage(imgUrl = data.poster)
                Spacer(modifier = Modifier.padding(5.dp))
                Box(modifier = Modifier.fillMaxWidth()) {

                    Column(Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End) {
                        favourite(
                            Modifier
                                .size(25.dp)
                                .clickable {
                                    if (!data.isFavourite) {
                                        viewModel.addToFavourite(movie = data)

                                    } else {
                                        viewModel.removeFromFavourite(movie = data)

                                    }
                                },
                            icon = if (data.isFavourite) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder
                        )
                    }
                    Column(modifier = Modifier,
                        verticalArrangement = Arrangement.Center) {

                        MovieName(name = data.title)

                        AnimatedVisibility(visible = expand) {
                            MovieDetail(desc = data.plot)
                        }

                        MovieRelease(data)
                        MovieDirector(data.director)

                        MovieRating(rating = data.rating)

                        Icon(
                            imageVector = if (expand)Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .clickable {
                                    expand = !expand
                                }
                        )
                    }
                }

            }
        }


    }
}

@Composable
private fun MovieRelease(data: MovieDetails) {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)) {
                append("Release: ")
            }
            withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                append(data.year)
            }
        }
    )
}

@Composable
private fun MovieDirector(director : String, modifier: Modifier = Modifier) {
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
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
private fun MovieDetail(
    modifier: Modifier = Modifier,
    desc: String,
) {

        Spacer(modifier = Modifier.padding(top = 5.dp))
        Text( buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)){
                append("Plot: ")
            }

            withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)){
                append(desc)
            }
        },
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
}

@Composable
private fun MovieName(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun MovieRating(
    modifier: Modifier = Modifier,
                rating: String
) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Rating",
                modifier = modifier.size(15.dp)
            )
            Spacer(Modifier.padding(2.dp))
            Text(text = "$rating/10")
        }

}

@Composable
fun MovieImage(imgUrl: String) {
    Surface(
        modifier = Modifier
            .size(100.dp, 100.dp),
        shape = CircleShape,
    ) {
        val request = ImageRequest.Builder(LocalContext.current)
            .data(imgUrl)
            .crossfade(true)
            .build()
        Image(
            painter = rememberAsyncImagePainter(model = request),
            contentDescription = "Spider man Poster",
            modifier = Modifier,
            contentScale = ContentScale.Crop
        )
//        AsyncImage(model = request, contentDescription = null, contentScale = ContentScale.Crop)
    }
}

@Composable
fun MovieList(
    viewModel: AppViewModel,
    data: List<MovieDetails>,
    onClicked: (MovieDetails) -> Unit = {},
    modifier: Modifier
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary
    ) {
        LazyColumn (
            modifier = Modifier,
            contentPadding = PaddingValues(top = 5.dp)
        ){
            items(data) { item ->
                MovieCard(
                    viewModel = viewModel,
                    item,
                    itemClicked = onClicked
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MovieRatingTheme {
//        val allMovie = AllMovie()
//        MovieRatingApp(allMovie.movies())
//    }
//}