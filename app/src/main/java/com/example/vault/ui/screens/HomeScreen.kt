package com.example.vault.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vault.ui.theme.VaultTheme
import com.example.vault.ui.theme.BackgroundWhite
import com.example.vault.ui.theme.CyanPrimary
import com.example.vault.ui.theme.TextPrimary
import com.example.vault.ui.theme.TextSecondary

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { VaultHeader() },
        bottomBar = { VaultFooter() },
        containerColor = BackgroundWhite
    ) { paddingValues ->
        HomeContent(modifier = Modifier.padding(paddingValues))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VaultHeader(){

}

@Composable
fun HomeContent(modifier: Modifier) {

}

@Composable
fun VaultFooter() {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    VaultTheme {
        HomeScreen()
    }
}