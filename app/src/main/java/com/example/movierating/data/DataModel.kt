package com.example.movierating.data

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.coroutines.flow.StateFlow
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieDetails(
    var id: String,
    var  title: String,
    var year: String,
    var genre: String,
    var director: String,
    var actors: List<String>,
    var plot : String,
    var poster: String,
    var images :List<String>,
    var rating: String,
    var isFavourite: Boolean = false
): Parcelable

@Parcelize
data class ActorsDetail(
    val name : String,
    val dob : String,
    val about: String,
    val profilePic: String,
    val movies : String,
    val awards: String,
    val images: List<String>,
) : Parcelable
