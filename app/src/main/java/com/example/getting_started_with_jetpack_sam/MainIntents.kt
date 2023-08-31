package com.example.getting_started_with_jetpack_sam

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.core.content.ContextCompat.startActivity
import com.example.getting_started_with_jetpack_sam.ui.theme.Getting_started_with_jetpack_SamTheme



class MainIntents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()
        }
    }
}

//LAUNCH CAMERA
//LAUNCH EMAIL
//LAUNCH CALL
//LAUNCH SIM TOOLKIT



@Preview(showBackground = true)
@Composable

fun MyIntents(){

    Column(

        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .padding(15.dp)

    ) {

        Spacer(modifier = Modifier.height(10.dp))

        val sms = LocalContext.current

        Button(onClick = {
            val phoneNumber = "0708926951"
            val messageText = "Hello its been a while"
            val uri = Uri.parse("smsto:$phoneNumber")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", messageText)

            sms.startActivity(intent)


        },

            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()

            ) {

            Text(text ="Send SMS")

        }
    }

Spacer(modifier = Modifier.height(20.dp))

    val takepic = LocalContext.current

    Button(onClick = {
        val takepictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        takepic.startActivity(takepictureIntent)

    }) {

        Text(text = "Launch camera")

    }



    Spacer(modifier = Modifier.height(30.dp))

    val emaillaunch = LocalContext.current

    Button(onClick = {
        val email_intent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:kanyorokumarx@gmail.com")
        putExtra(Intent.EXTRA_SUBJECT, "Subject")
        putExtra(Intent.EXTRA_TEXT, "Body")
    }
        val chooserIntent = Intent.createChooser(email_intent,"send email..")
        emaillaunch.startActivity(chooserIntent)
    },

        shape= RoundedCornerShape(20.dp),
        modifier = Modifier.fillMaxWidth()


    ){
        Text(text = "Launch email")
    }


    
    Spacer(modifier = Modifier.height(30.dp))

    Button(onClick = { },

        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth(),


        ){
        Text(text = "Launch call")
    }



    Spacer(modifier = Modifier.height(30.dp))

    Button(onClick = {  },

        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth(),


        ){
        Text(text = "Sim Toolkit")
    }

    }
