package com.example.totaldizimoseofertas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.totaldizimoseofertas.ui.theme.TotalDizimosEOfertasTheme
import kotlin.math.round

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var nota2 by rememberSaveable { mutableStateOf("") }
            var nota5 by rememberSaveable { mutableStateOf("") }
            var nota10 by rememberSaveable { mutableStateOf("") }
            var nota20 by rememberSaveable { mutableStateOf("") }
            var nota50 by rememberSaveable { mutableStateOf("") }
            var nota100 by rememberSaveable { mutableStateOf("") }
            var nota200 by rememberSaveable { mutableStateOf("") }

            var moeda5 by rememberSaveable { mutableStateOf("") }
            var moeda10 by rememberSaveable { mutableStateOf("") }
            var moeda25 by rememberSaveable { mutableStateOf("") }
            var moeda50 by rememberSaveable { mutableStateOf("") }
            var moeda1real by rememberSaveable { mutableStateOf("") }

            var tamanhoTitulo = 30
            var espaco = 16
            var espacoMeio = 5
            var tamanhoBotao = 24

            var total by rememberSaveable { mutableStateOf(0.0) }


            TotalDizimosEOfertasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                    //color = com.example.totaldizimoseofertas.ui.theme.Purple80
                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                           horizontalAlignment = Alignment.CenterHorizontally) {

                        Row(modifier = Modifier.fillMaxWidth()) {

                            Column(modifier = Modifier.weight(1f)
                                                      .padding(end = espacoMeio.dp),
                                horizontalAlignment = Alignment.CenterHorizontally) {

                                Text( text = "Notas",
                                    fontSize =tamanhoTitulo.sp)

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota2,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota2 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$2,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota5,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota5 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$5,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota10,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota10 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$10,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota20,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota20 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$20,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota50,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota50 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$50,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota100,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota100 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$100,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    nota200,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        nota200 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Notas de R$200,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )



                            }

                            Column(modifier = Modifier.weight(1f)
                                                      .padding(start = espacoMeio.dp),
                                horizontalAlignment = Alignment.CenterHorizontally) {

                                Text( text = "Moedas",
                                    fontSize =tamanhoTitulo.sp)

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    moeda5,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        moeda5 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Moedas de R$0,05") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    moeda10,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        moeda10 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Moedas de R$0,10") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    moeda25,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        moeda25 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Moedas de R$0,25") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    moeda50,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        moeda50 = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Moedas de R$0,50") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                TextField(
                                    moeda1real,
                                    { newValue ->
                                        // Aqui você pode incluir uma lógica para validar a entrada como numérica
                                        moeda1real = newValue.filter { it.isDigit() }
                                    },
                                    label = { Text("Moedas de R$1,00") },
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )

                                Spacer(modifier = Modifier.height(espaco.dp))

                                Button(onClick = {
                                    total = 0.0

                                    if (nota200 != "") {total += 200*nota200.toInt()}
                                    if (nota100 != "") {total += 100*nota100.toInt()}
                                    if (nota50  != "") {total += 50*nota50.toInt()}
                                    if (nota20  != "") {total += 20*nota20.toInt()}
                                    if (nota10  != "") {total += 10*nota10.toInt()}
                                    if (nota5   != "") {total += 5*nota5.toInt()}
                                    if (nota2   != "") {total += 2*nota2.toInt()}

                                    if (moeda1real != "") {total += 1*moeda1real.toInt()}
                                    if (moeda50    != "") {total += 0.5*moeda50.toInt()}
                                    if (moeda25    != "") {total += 0.25*moeda25.toInt()}
                                    if (moeda10    != "") {total += 0.10*moeda10.toInt()}
                                    if (moeda5     != "") {total += 0.05*moeda5.toInt()}

                                    total = round(total*100)/100

                                    //total = 200*nota200.toInt() + 100*nota100 + 50*nota50 +
                                },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green) // Define a cor do botão para vermelho
                                ) {
                                    Text(text = "Somar",
                                        style = TextStyle(fontSize = tamanhoBotao.sp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(espaco.dp))

                                Button(onClick = {
                                    nota200 = ""
                                    nota100 = ""
                                    nota50 = ""
                                    nota20 = ""
                                    nota10 = ""
                                    nota5 = ""
                                    nota2 = ""

                                    moeda1real = ""
                                    moeda50 = ""
                                    moeda25 = ""
                                    moeda10 = ""
                                    moeda5 = ""

                                    total = 0.0
                                },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red) // Define a cor do botão para vermelho
                                ) {
                                    Text(text = "Reset",
                                        style = TextStyle(fontSize = tamanhoBotao.sp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height((3*espaco).dp))

                        Text(text = "Total: R$" + String.format("%.2f", total),
                            fontSize = (1.5*tamanhoTitulo).sp)

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