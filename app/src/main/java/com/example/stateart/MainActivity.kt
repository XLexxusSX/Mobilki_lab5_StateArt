package com.example.stateart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.stateart.ui.compose.StateArtApp
import com.example.stateart.ui.theme.StateArtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateArtTheme {
                StateArtApp()
            }
        }
    }
}
