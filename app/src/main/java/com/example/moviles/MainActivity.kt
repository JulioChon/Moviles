package com.example.moviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviles.ui.theme.MovilesTheme

class MainActivity : ComponentActivity() {
    fun main(args: Array<String>) {

        println(verificaCadena("nombre")) // true
        println(verificaCadena("_nombre")) // true
        println(verificaCadena("_12")) // true
        println(verificaCadena("")) // false
        println(verificaCadena("012")) // false
        println(verificaCadena("no$")) // false
    }
}
fun verificaCadena(texto: String): Boolean {

    if (texto.isEmpty()) {
        return false
    }


    val primerCaracter = texto[0]
    if (!primerCaracter.isLetter() && primerCaracter != '_') {
        return false
    }


    for (caracter in texto) {
        if (!caracter.isLetterOrDigit() && caracter != '_') {
            return false
        }
    }
    return true
}

