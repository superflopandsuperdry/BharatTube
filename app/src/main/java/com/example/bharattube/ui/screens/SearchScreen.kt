package com.example.bharattube.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun SearchScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Search", style = MaterialTheme.typography.headlineMedium)
        // Search bar with voice input for Hindi
        Text("Trending searches: IPL, Bhajan, Recipe in Hindi, JEE preparation")
    }
}