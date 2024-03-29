package com.example.gdsccard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsccard.ui.theme.GDSCCARDTheme
import com.example.gdsccard.ui.theme.Purple1
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDSCCARDTheme {
               Myscreen()
            }
        }
    }
}
@Composable
fun Myscreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            backgroundColor = Purple1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)
        ) {
            Column() {
                Myrow1()
            }
        }
    }}

@Composable
fun Myrow1(){
      Row(
          modifier = Modifier
              .padding(8.dp)
              .fillMaxWidth()
      ) {
          Text(
              text = "Hii!/sSuraj kumbhar",
              fontWeight = FontWeight.Bold,
    color.White,
    fontsize = 25.sp
    )
}
}
@Composable
fun GreetingPreview() {
    GDSCCARDTheme {
    }
}
