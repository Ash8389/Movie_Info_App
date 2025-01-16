package com.example.movierating.widget

import android.graphics.drawable.Icon
import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun favourite(modifier: Modifier = Modifier, icon: ImageVector = Icons.Outlined.Favorite) {
    Icon(
        imageVector = icon,
        contentDescription = "favourite",
        modifier = modifier,
        tint = Color.Red
    )
}