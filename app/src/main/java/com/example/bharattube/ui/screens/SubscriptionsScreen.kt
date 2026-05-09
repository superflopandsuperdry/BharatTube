package com.example.bharattube.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun SubscriptionsScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Subscriptions", style = MaterialTheme.typography.headlineMedium)
        Text("Follow your favorite Indian creators - Bollywood, Cricket, Devotional")
        // Add list of subscribed channels here
    }
}