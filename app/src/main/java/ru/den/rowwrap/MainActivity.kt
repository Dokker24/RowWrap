package ru.den.rowwrap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.den.rowwrap.ui.theme.RowWrapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(1, 2, 3, 4, 5)

        setContent {
            RowWrapTheme {
                RowWrap {
                    OutlinedCard(
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .height(250.dp)
                            .padding(5.dp)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Icon(Icons.Default.Add, contentDescription = "", tint = Color.White)
                        }
                        list.forEach {
                            Item(it)
                        }
                    }
                }
            }
        }
    }
}

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
        Box(contentAlignment = Alignment.Center) {
            Text(number.toString(), color = Color.White)
        }
    }
}