package ru.den.rowwrap.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.flowOf
import ru.den.rowwrap.RowWrap

@Composable
fun MainScreen() {
    val list = flowOf(mutableListOf(1, 2, 3, 4, 5)).collectAsState(initial = emptyList())
    RowWrap(
        modifier = Modifier.verticalScroll(ScrollState(0))
    ) {
        OutlinedCard(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(250.dp)
                .padding(5.dp)
                .clickable {
                }
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Icon(Icons.Default.Add, contentDescription = "", tint = Color.White)
            }
        }
        list.value.forEach {
            Item(it)
        }
    }
}
