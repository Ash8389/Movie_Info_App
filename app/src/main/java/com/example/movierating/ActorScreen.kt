package com.example.movierating

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.movierating.data.ActorsDetail

//@Preview(showBackground = true)
@Composable
fun ActorScreen(
    actor: ActorsDetail,
    closeActorScreen: () -> Unit,
    modifier: Modifier = Modifier
) {
    var expand by remember {
        mutableStateOf(false)
    }
    Log.d("TAG", "ActorScreen: $expand")
    Dialog(
        onDismissRequest = { closeActorScreen() },
        properties = DialogProperties(
            dismissOnBackPress = true,
            dismissOnClickOutside = true,
            usePlatformDefaultWidth = false
        )
        ) {
        Box(modifier = modifier
            .background(color = Color.Black.copy(alpha = 0.8f))
            .width(350.dp)
        ) {
            Column(
                modifier = modifier.padding(10.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "close",
                    tint = Color.White,
                    modifier = modifier
                        .align(alignment = Alignment.End)
                        .clickable { closeActorScreen() }
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    ImageName( modifier, name= actor.name, actor.profilePic)
                    Spacer(modifier = Modifier.padding(5.dp))
                    About(modifier, expand, about = actor.about)

                }
                Spacer(modifier = Modifier.padding(5.dp))
                AnimatedVisibility(visible = expand) {
                    OtherDetails(movies = actor.movies, awards = actor.awards)
                }
                Column(
                    modifier=modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if(expand)
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowUp,
                            contentDescription = "Expand",
                            tint = Color.White,
                            modifier = Modifier.clickable { expand = !expand }
                        )
                    else
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowDown,
                            contentDescription = "Expand",
                            tint = Color.White,
                            modifier = Modifier.clickable { expand = !expand }
                        )
                }


            }
        }

    }
}

@Composable
private fun OtherDetails(movies: String, awards: String) {
    Column {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Movies ")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                    append("$movies")
                }
            },
            color = Color.White
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Awards ")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                    append("$awards")
                }
            },
            color = Color.White
        )
    }
}

@Composable
private fun About(modifier: Modifier, expanded: Boolean, about: String) {

    Column(modifier = modifier) {
            Text(
                text = about,
                maxLines = if(expanded) Int.MAX_VALUE else 5,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Justify,
                color = Color.White,
                modifier = modifier.animateContentSize()
            )

        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Born ")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
                    append("August 2, 1976")

                }
            },
            color = Color.White
        )
    }
}

@Composable
private fun ImageName(
    modifier: Modifier,
    name: String,
    imageUrl: String
) {
    val imageUrl = ImageRequest.Builder(LocalContext.current)
        .data(imageUrl)
        .crossfade(true)
        .build()
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(modifier = modifier.size(140.dp, 180.dp)) {
            Image(
                painter = rememberAsyncImagePainter(model = imageUrl),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = name,
            color = Color.White,
            textAlign = TextAlign.Center,
        )
    }
}