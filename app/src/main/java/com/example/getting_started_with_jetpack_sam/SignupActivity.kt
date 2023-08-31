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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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

//Firstname
//Lastname
//Phone Number
//Email
//Password


class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun SignupInterface(){
    var firstname by remember {
        mutableStateOf("")
    }

    var lastname by remember {
        mutableStateOf("")
    }

    var phonenumber by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Please Signup", color = Color.Green, fontSize = 20.sp)

        TextField(value = firstname,
            onValueChange = { firstname },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Firstname")},
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "firstnameicon") }

        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(value =lastname,
            onValueChange = { lastname },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Lastname")},
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "lastnameicon")}



        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = phonenumber,
            onValueChange = { phonenumber },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Phone Number")},
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription = "phonenumbericon")}

        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = email,
            onValueChange = { email },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Email")},
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "emailicon")}

        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = password,
            onValueChange = { password },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Password")},
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "passwordicon")}

        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()


        ) {
            Text(text = "SIGNUP")
        }

    }
}
