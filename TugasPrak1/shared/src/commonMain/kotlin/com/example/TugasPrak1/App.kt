package com.example.TugasPrak1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color


@Composable
@Preview
fun App() {
    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFEAF7ED ))
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Halo, Nafisya Ghalia!",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFA775C9)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "NIM: 124140100",
                fontSize = 16.sp,
                color = Color(0xFFA775C9)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Platform: ${getPlatform().name}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}
