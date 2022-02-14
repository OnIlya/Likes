package ru.netology

import java.util.*

fun main() {

    var likes = 121
    val designationOfPeople = when (likes) {
        1, 21, 31, 41, 51, 61, 71, 81, 91, 101 -> "человеку"

        else -> "людям"
    }

    println("Понравилось $likes $designationOfPeople")
}


