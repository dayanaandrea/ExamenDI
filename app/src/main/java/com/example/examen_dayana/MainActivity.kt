package com.example.examen_dayana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen_dayana.ui.theme.Examen_DayanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen_DayanaTheme {
                    pruebaExamen()
            }
        }
    }
}

@Composable
fun pruebaExamen() {
Column {
    Column (
        modifier = Modifier
            .background(color = Color.Gray)
            .fillMaxWidth(0.75f)
            .fillMaxSize(0.25f)

    ){
        Row (

        ){
            Column (
                modifier = Modifier
                    .background(color = Color.Red)

            ){

                Row {Text("HOLAA")}

            }

            Column (
                modifier = Modifier
                    .background(color = Color.Red)

            ){
                Row { Text("HOLAA")  }
                Row { Text("HOLAA") }
                Row {Text("HOLAA")}

            }



        }


    }
    Column (
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth(0.75f)
            .fillMaxSize(0.25f)

    ){Row (
        modifier = Modifier

            .align(alignment =  Alignment.CenterHorizontally)

        ){
            Text("Hello Android!")

        }
    }

    Column (
        modifier = Modifier
            .background(color = Color.Green)
            .fillMaxWidth(0.75f)


    ){
Row {

    Column (
    modifier = Modifier
        .background(color = Color.Red)
    )
    {
        Column (
            modifier = Modifier
                .background( color = Color.Blue)
                .fillMaxWidth(0.10f)
                .align(alignment =  Alignment.CenterHorizontally)
        ){
        Row { Text("1")  }
        Row { Text("2") }
        Row {Text("3") }
        }
} }
Row { Column (
    modifier = Modifier


){
    Row { Text("HOLAA")  }
    Row { Text("HOLAA") }
    Row (

    ){

        Text("HOLAA");
        Text("HOLAA")
    }
} }






     }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Examen_DayanaTheme {
        pruebaExamen()
    }
}