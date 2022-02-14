package ru.netology

fun main() {

    var likes = 1001
    val designationOfPeople = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $designationOfPeople")
}


