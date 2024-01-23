package com.example.moviles

class Cadena_fina {
    fun String.esFina(): Boolean {


        val condicion1 = !contains("bu") && !contains("ba") && !contains("be")


        val condicion2 = Regex("[aeiouAEIOU]").findAll(this).count() >= 3


        val condicion3 = windowed(2).any { it[0] == it[1] }


        return (condicion1 && condicion2) || (condicion1 && condicion3) || (condicion2 && condicion3)
    }

    fun main() {


        println("bac".esFina())
        println("aza".esFina())
        println("abaca".esFina())
        println("baaa".esFina())
        println("aaab".esFina())
    }
}