package com.example.movierating


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.movierating.ui.theme.MovieRatingTheme
import com.example.movierating.data.AppViewModel
import com.example.movierating.data.MovieDetails
import com.example.movierating.widget.favourite

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MovieRatingTheme {
                Surface(modifier = Modifier.systemBarsPadding()) {
                    MovieApp(viewModel = AppViewModel())

                }
            }
        }
    }
}

enum class ScreenName{
    ListScreen,
    DetailScreen,
    FavouriteScreen
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    navigateBack: Boolean = false,
) {
    TopAppBar(
        title = {
            Box(modifier = modifier
                .fillMaxWidth()
                .padding(end = 15.dp)){
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    if (navigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack
                            , contentDescription = null
                            , tint = MaterialTheme.colorScheme.onPrimary
                            , modifier = Modifier
                                .size(33.dp)
                                .clickable {
                                    navHostController.popBackStack()
                                }
                        )

                    } else {
                        Text(
                            text = stringResource(id = R.string.app_name),
                            style = MaterialTheme.typography.headlineLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            textDecoration = TextDecoration.LineThrough,
                        )
                    }
                    if(navHostController.currentBackStackEntry?.destination?.route != ScreenName.FavouriteScreen.name) {
                        favourite(
                            modifier = Modifier
                                .size(33.dp)
                                .clickable {
                                    navHostController.navigate(ScreenName.FavouriteScreen.name)
                                },
                        )
                    }
                }
                if(navHostController.currentBackStackEntry?.destination?.route == ScreenName.FavouriteScreen.name)
                Row(modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center) {
                    Text(
                        text = "Favourites",
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }


        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
    )
}

@Composable
fun MovieApp(
    modifier: Modifier = Modifier,
    viewModel: AppViewModel,
    navHostController: NavHostController = rememberNavController()
) {
    val movieList by viewModel.uiState.collectAsStateWithLifecycle()
    val favMovies by viewModel.favouriteMovie.collectAsState()

    val backEntry = navHostController.currentBackStackEntryAsState()


    Scaffold(
        topBar = {
            AppBar(
                navHostController = navHostController,
                navigateBack = backEntry.value?.destination?.route != ScreenName.ListScreen.name
            )
        },
        containerColor = MaterialTheme.colorScheme.primary
    ) { innerPadding ->
        NavHost(navController = navHostController, startDestination = ScreenName.ListScreen.name) {
            composable(route = ScreenName.ListScreen.name) {
                    MovieList(
                        viewModel = viewModel,
                        modifier = modifier.padding(innerPadding),
                        data = movieList,
                        onClicked = {
                        navHostController.currentBackStackEntry?.savedStateHandle?.set("movie", it.id)
                            navHostController.navigate(ScreenName.DetailScreen.name)
                        }
                    )
            }
            composable(
                route = ScreenName.DetailScreen.name,
            ) {
                val movie = navHostController.previousBackStackEntry?.savedStateHandle?.get<String>("movie")
                        if (movie != null) {
                            DetailScreen(
                                viewModel = viewModel,
                                modifier = modifier.padding(innerPadding),
                                movieId = movie,
                            )
                        }
            }
            composable(
                route = ScreenName.FavouriteScreen.name
            ) {
                FavMovies(
                    modifier = modifier.padding(innerPadding),
                    viewModel = viewModel,
                    itemClicked = {
                        navHostController.currentBackStackEntry?.savedStateHandle?.set("movie", it.id)
                        navHostController.navigate(ScreenName.DetailScreen.name)
                    },
                    favMovies = favMovies
                )
            }
        }
    }
}


//@Composable
//private fun DetailImage(
//    modifier: Modifier = Modifier,
//) {
//    val request = ImageRequest.Builder(LocalContext.current)
//        .data("https://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg")
//        .crossfade(true)
//        .build()
////    AsyncImage(model = request, contentDescription = null)
//    Surface(
//        modifier = modifier
//            .fillMaxWidth()
//            .height(350.dp),
//        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
//        shadowElevation = 5.dp,
//        color = Color(0xFFB0A178)
//    ) {
//        Image(
//            painter = rememberAsyncImagePainter(model = request),
//            contentDescription = "Spider man",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.padding(5.dp),
//        )
//    }
//}
//
//@Composable
//fun LoadImage() {
//
//    val request = ImageRequest.Builder(LocalContext.current)
//        .data("https://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg")
//        .listener(
//            onStart = { Log.d("Image", "Loading started") },
//            onSuccess = { _, _ -> Log.d("Image", "Loading successful") },
//            onError = { _, _ -> Log.d("Image", "Loading failed") }
//        )
//        .build()
//
//AsyncImage(
//    modifier = Modifier.size(280.dp),
//    model = request,
//    contentDescription = null
//    )
//
//    Image(
//        painter = rememberAsyncImagePainter(model = request),
//        contentDescription = "Spider man Poster",
//        modifier = Modifier,
//        contentScale = ContentScale.Crop
//    )
//}
