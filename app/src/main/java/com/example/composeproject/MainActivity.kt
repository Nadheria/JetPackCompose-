package com.example.composeproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Text(
        text = "Hello Exe",
        fontSize = 30.sp,
        color = Color.Green,
        fontStyle = FontStyle.Italic,


        )
}

@Composable
fun RenderImage() {

    Image(painter = painterResource(id = R.drawable.user_profile_ic), contentDescription = "")
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreiviewFuncation() {

    Column {
        ListViewItems(R.drawable.user_profile_ic,"Jhone Doe","Dev")
        ListViewItems(R.drawable.user_profile_ic,"James","Designer")
        ListViewItems(R.drawable.user_profile_ic,"Annie","Lead")
    }
}


@Composable
fun ListViewItems(listImageView:Int,name:String,occupation:String ){
    Row( modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),) {
        Image(
            painter = painterResource(id = listImageView),
            contentDescription = "",
            Modifier.size(48.dp),



            )
        Spacer(modifier = Modifier.width(8.dp))
        Column(Modifier.padding(start = 8.dp)) {
            Text(
                text = name,
                fontSize = 20.sp,
                color = Color.Black,
                fontStyle = FontStyle.Italic,

                )

            Text(
                text = occupation,
                fontSize = 20.sp,
                color = Color.Gray,
                fontStyle = FontStyle.Italic,

                )
        }


    }
}
