package com.example.bharattube.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun LibraryScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Library", style = MaterialTheme.typography.headlineMedium)
        Text("History, Watch Later, Liked Videos, Downloads")
        // History of watched Indian videos
    }
}