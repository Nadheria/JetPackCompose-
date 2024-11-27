package com.example.composeproject.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LargeQuoteList() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF), // White
                        Color(0xFFE3E3E3)  // Light gray
                    )
                )
            )
    ) {

        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            modifier = Modifier.padding(12.dp).
                size(width = 350.dp, height = 200.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(4.dp)


            ) {

            Column(Modifier.padding(16.dp,24.dp), verticalArrangement = Arrangement.Center) {

                Image(
                    imageVector = Icons.Default.FormatQuote,
                    contentDescription = "Profile Icon",
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color.White).
                    rotate(180f),
                    alignment = Alignment.TopStart,
                    colorFilter = ColorFilter.tint(Color.Black)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {


                    Text(
                        text = "Time is the most valuable thing a man can spend.",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp).
                        padding(top = 1.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp

                    )

                    Box(
                        modifier = Modifier
                            .background(Color(0xFFEEEEEE))
                            .fillMaxWidth(.4f)
                            .height(1.dp)

                    )

                    Text(
                        text = "Theophrastus",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Thin,
                        modifier = Modifier.padding(top = 4.dp)
                    )

                }
            }

        }

    }
}