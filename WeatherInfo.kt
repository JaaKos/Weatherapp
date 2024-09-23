package com.example.weatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeatherDescription() {
    var weatherStatus by remember { mutableIntStateOf(0) }
    var weatherText: String
    var weatherIcon: Int
    if (weatherStatus == 0) {
        weatherText = "Tänään on aurinkoista!"
        weatherIcon = R.drawable.sunny
    }
    else {
        weatherText = "Tänään sataa."
        weatherIcon = R.drawable.rainy
    }

    Column (Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = weatherIcon),
            contentDescription = "Sunny",
            modifier = Modifier.size(100.dp).align(Alignment.CenterHorizontally)
        )
    }

    Spacer(Modifier.height(10.dp))

    Text (
        text = weatherText,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun TemperatureAndWind() {
    var tuuli: Int = 4
    var lampoTila: Int = 15
    Column (Modifier.fillMaxWidth()) {
        Text(
            text = "Lämpötila: " + lampoTila.toString() + "°C",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Text (
            text = "Tuulen nopeus: " + tuuli.toString() + "m/s",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun RefreshButton() {
    Column (Modifier.fillMaxWidth()) {
        Button(onClick = { /* TODO */ }, Modifier.align(Alignment.CenterHorizontally)) {
            Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh")
        }
    }
}