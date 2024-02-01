package ru.den.rowwrap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.den.rowwrap.screens.MainScreen
import ru.den.rowwrap.ui.theme.RowWrapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RowWrapTheme {
                MainScreen()
            }
        }
    }
}