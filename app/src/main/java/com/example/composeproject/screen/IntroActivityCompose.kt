package com.example.composeproject.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeproject.R

class IntroActivityCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingPreview()
        }
    }
}

@Composable
fun CenterImageView() {

    Box(
        modifier = Modifier
            .fillMaxSize() // Makes the Box take the full screen
            .wrapContentSize(Alignment.Center)
            .offset(y = (-120).dp)// Ensures everything inside is centered
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.group_395),
            contentDescription = "Centered Image",
            modifier = Modifier.size(224.dp)
        )

            Text(
                text = "Install Apps Complete Simple Tasks To Earn Some Quick Money",
                fontStyle = FontStyle(R.font.poppins_medium),
                fontSize = 18.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 2.dp , top = 10.dp, end = 2.dp),

            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier.padding(12.dp).
                size(width = 500.dp, height = 50.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Green),
                shape = RoundedCornerShape(4.dp)


            ) {



            }
    }



    }


}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CenterImageView()


}