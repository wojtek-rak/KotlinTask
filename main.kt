data class Person(val name: String, val surname: String, val age: Int)
{
    fun getPerson() = "$name $surname, age $age"
}

fun main() {
    val person = Person("John", "Doe", 21)
    println(person.getPerson())
}
