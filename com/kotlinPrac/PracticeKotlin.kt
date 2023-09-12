package kotlinPrac

import javaPrac.Person

fun main() {
    val name = "111"
    println("이름 : ${name}")
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}