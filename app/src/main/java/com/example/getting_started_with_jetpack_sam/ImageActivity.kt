package com.example.getting_started_with_jetpack_sam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePage(painterResource(id = R.drawable.img3), null)
        }
    }
}


@Preview(showBackground = true)
@Composable

fun ImagePage(painterResource: Painter, contentDescription: Nothing?) {

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top



    ){
        Image(painter = painterResource(R.drawable.img1),
            contentDescription =null,
            modifier = Modifier
                .fillMaxSize(),


                //.size(200.dp)
                //.border(3.dp, Color.Red)

        )
    }

}



