package com.example.getting_started_with_jetpack_sam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_sam.ui.theme.Getting_started_with_jetpack_SamTheme

class MpesaListview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mpesalist()

        }
    }
}

private val MpesaList = mutableListOf("Send Money", "Withdraw cash", "Buy Airtime", "Loans and Savings", "Lipa na Mpesa", "My Account")
private  val listModifier = Modifier
    .fillMaxSize()
    .background(Color.White)
    .padding(13.dp)

private  val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 40.sp, color= Color.Green)



@Preview(showBackground = true)
@Composable

fun Mpesalist(){

    LazyColumn(modifier = listModifier){
        items(MpesaList){
                list ->
            Text(text = list, style = textStyle)

        }
    }

}


