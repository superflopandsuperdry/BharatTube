package com.example.bharattube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.bharattube.ui.theme.BharatTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BharatTubeTheme {
                // TODO: Add BottomNavigationScreen or HomeScreen here
                Greeting("BharatTube - Made for India")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // Placeholder
}