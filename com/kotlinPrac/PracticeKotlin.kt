package kotlinPrac

import javaPrac.Person
import java.lang.IllegalArgumentException

fun main() {
    val person = Person(null)
    startWith(person.name)
}

fun startWith(str: String): Boolean {
    return str.startsWith("A")
}