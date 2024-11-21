package com.example.composeproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreiviewFuncation()
        }
    }

}




@Composable
fun PrintText() {
    Text(text = "Hello Govind",
        fontSize = 30.sp,
        color = Color.Green,
        fontStyle = FontStyle.Italic,


    )
}

@Composable
fun RenderImage() {

    Image(painter = painterResource(id = R.drawable.home_icon), contentDescription = "")
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreiviewFuncation(){
    Column {
        PrintText()
        RenderImage()
    }

}

