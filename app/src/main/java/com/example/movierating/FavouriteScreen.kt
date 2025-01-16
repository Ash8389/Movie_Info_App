package com.example.movierating

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movierating.data.AppViewModel
import com.example.movierating.data.MovieDetails

@Composable
fun FavMovies(
    modifier : Modifier = Modifier,
    viewModel: AppViewModel,
    favMovies: List<MovieDetails>,
    itemClicked : (MovieDetails) -> Unit
){
    LazyColumn(modifier = modifier) {
        items(favMovies){item ->
            MovieCard(viewModel = viewModel, data = item, itemClicked = itemClicked )
        }
    }
}