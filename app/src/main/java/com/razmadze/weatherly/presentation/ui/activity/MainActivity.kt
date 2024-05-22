package com.razmadze.weatherly.presentation.ui.activity

import android.graphics.Color.TRANSPARENT
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.razmadze.weatherly.R
import com.razmadze.weatherly.ui.theme.WeatherlyTheme
import com.razmadze.weatherly.ui.theme.grey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(TRANSPARENT))
        setContent {
            WeatherlyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.starry_mountain),
            contentDescription = "Starry Mountain / Background Image",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp, bottom = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Tbilisi",
                fontFamily = FontFamily.SansSerif,
                fontSize = 34.sp,
                color = Color.White
            )
            Text("19°", fontSize = 96.sp, color = Color.White)
            Text("Mostly Clear", fontSize = 20.sp, color = grey)
            Row {
                Text("H:24°", fontSize = 20.sp, color = Color.White)
                Spacer(modifier = Modifier.padding(8.dp))
                Text("L:18°", fontSize = 20.sp, color = Color.White)
            }
        }
        Image(
            modifier = Modifier
                .padding(bottom = 0.dp)
                .size(390.dp),
            painter = painterResource(id = R.drawable.house),
            contentDescription = "House Image"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherlyTheme {
        Greeting()
    }
}