package ru.netology

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val likes = scanner.nextInt()
    val designationOfPeople = if (likes == 1) "человеку" else "человекам"
    println("Понравилось $likes $designationOfPeople")
}


