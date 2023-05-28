package com.example.mahdi1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize() .background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = com.example.mahdi1.R.drawable.ico_tvu),
            contentDescription = "Logo Image"
        )
        TextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "name") },
        )
        TextField(
            value = age,
            onValueChange = {age=it},
            label = { Text(text = "tarikh tavaload") },
        )
        val context= LocalContext.current
        Button(
            onClick = {

                navController.navigate("Second/$username/$age")


                /*
                1 - add two variable with state mode : username and password
                2 - complete value and onValueChange for TextField with variables
                3 - in onClick method check username = tvu and password = 111111 or not?
                4 - Toast OK or WRONG in Toast  */ },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF0000FF)
            )
        ) {
            Text(
                text = "ورود",
                color = Color(0xFFEDEFEE)
            )
        }

    }

    fun LoginScreen(){

    }
}