package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherappTheme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        WeatherappTheme {
                App()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun App() {
    Column (Modifier.fillMaxWidth()) {
        InfoBox()
        Spacer(Modifier.height(20.dp))
        WeatherDescription()
        Spacer(Modifier.height(10.dp))
        TemperatureAndWind()
        Spacer(Modifier.height(10.dp))
        RefreshButton()
    }
}

@Composable
fun InfoBox() {
    Text (
        text = "Sääsovellus",
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(vertical = 10.dp)
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
    )
}