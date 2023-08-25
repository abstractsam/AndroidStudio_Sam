package com.example.getting_started_with_jetpack_sam


//Assignment: Add background images to all files


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_sam.ui.theme.Getting_started_with_jetpack_SamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable

fun Home(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
        ,
        verticalArrangement = Arrangement.Center
        ,

        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxSize() //covers entire width and height of the panel

    )
    {
        Text(text = "Welcome to Jetpack", color = Color.Black, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.width(300.dp)



        ) {
            Text(text = "LOGIN")
        }


        var scroll = LocalContext.current

         Button(onClick = {
        scroll.startActivity(Intent(scroll,ScrollListview::class.java))

        },
         shape = RoundedCornerShape(5.dp),
         modifier = Modifier.width(300.dp)
         ){

          Text(text = "GO TO SCROLL", color = Color.White)

        }



    }





    //var login = LocalContext.current

       // Button(onClick = {
            //login.startActivity(Intent(login,Loginpage::class.java))

        //},
           // shape = RoundedCornerShape(5.dp),
           // modifier = Modifier.fillMaxWidth()
       // ){

          //  Text(text = "LOGIN", color = Color.Black)

        //}

}


