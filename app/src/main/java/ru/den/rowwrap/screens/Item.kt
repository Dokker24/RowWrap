package ru.den.rowwrap.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Item(number: Int) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.Cyan
        ),
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .height(250.dp)
            .padding(5.dp)
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text(number.toString(), color = Color.Black)
        }
    }
}