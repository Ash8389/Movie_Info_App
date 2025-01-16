package com.example.movierating.data

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class AppViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<List<MovieDetails>>(AllMovie().movies())
    val uiState: StateFlow<List<MovieDetails>> = _uiState.asStateFlow()


    private val _favouriteMovie = MutableStateFlow<List<MovieDetails>>(emptyList())
    val favouriteMovie: StateFlow<List<MovieDetails>> = _favouriteMovie.asStateFlow()

    fun addToFavourite(movie: MovieDetails) {
        _uiState.update { currentList ->
            currentList.map { if (it.id == movie.id) it.copy(isFavourite = true) else it }
        }
        _favouriteMovie.update { currentList ->
            if (currentList.none { it.id == movie.id }) {
                Log.d("Favourite", "Added")
                currentList + movie.copy(isFavourite = true)
            } else {
                currentList
            }
        }
    }

    fun removeFromFavourite(movie: MovieDetails) {
        _uiState.update { currentList ->
            currentList.map { if (it.id == movie.id) it.copy(isFavourite = false) else it }
        }
        _favouriteMovie.update { currentList ->
            currentList.filterNot { it.id == movie.id }

        }
    }

    fun getMovieById(id: String): StateFlow<MovieDetails?> {
        return _uiState.map { movieList -> movieList.find { it.id == id } }.stateIn(viewModelScope, SharingStarted.Lazily, null)
//        return _uiState.value.find { it.id == id }.asStateFlow()

    }
}