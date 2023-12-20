package com.example.totaldizimoseofertas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.totaldizimoseofertas.ui.theme.TotalDizimosEOfertasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TotalDizimosEOfertasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                    //color = com.example.totaldizimoseofertas.ui.theme.Purple80
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(modifier = Modifier.fillMaxWidth()) {

                            Column(modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally) {

                                Text( text = "Notas",
                                    fontSize =30.sp)

                            }

                            Column(modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally) {

                                Text( text = "Moedas",
                                    fontSize =30.sp)

                            }


                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TotalDizimosEOfertasTheme {
        Greeting("Android")
    }
}