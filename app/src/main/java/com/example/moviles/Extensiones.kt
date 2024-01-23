package com.example.moviles

class Extensiones {
    fun String?.esVaciaONula(): Boolean {
        return this == null || this.isEmpty()
    }

    fun main() {
        val s1: String? = null
        val s2: String? = ""
        val s3: String? = "     "

        println(s1.esVaciaONula()==true)
        println(s2.esVaciaONula()==true)
        println(s3.esVaciaONula()==false)
    }
}