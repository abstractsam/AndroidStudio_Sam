package com.example.getting_started_with_jetpack_sam

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_with_jetpack_sam.ui.theme.Getting_started_with_jetpack_SamTheme

class Loginpage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun LoginInterface(){
    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    

    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
       Text(text = "Welcome back.Please Login", color= Color.White, fontSize = 15.sp)
        TextField(

            value = username,
            onValueChange = { username },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Username") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "usernameicon")}

        )

        Spacer(modifier = Modifier.height(10.dp))

       TextField(value = password,
            onValueChange = { password },
            label = { Text(text = "Password")},
            modifier = Modifier.fillMaxWidth(),
           leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "passwordicon")}
            )

        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()



            ) {
            Text(text = "LOGIN")
        }

    }
}
