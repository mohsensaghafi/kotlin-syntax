import OOP.Employee
import OOP.Person
import OOP.Student

fun main(args: Array<String>) {
    println("primitive variables:")
    val name = "kotlin"
    var language: String = "java"
    var lang: String? = null
    println("Hello, 1+2 = ${1 + 2}") // Hellp, 1+2 = 3

    // Arrays
    println("define arrays:")
    val arr = arrayOf(1, 2, 3)
    println(arr[2]) // 3
    val ia: IntArray = intArrayOf(2, 4, 6, 8, 10)

    // Conditional
    println("Please tell us your age: ")
    // read from command line
    // val ageStr = readLine()
    // val age = Integer.valueOf(ageStr)
    val age = 21
    if (age >= 21) println("you are allowed to drink")
    else println("you are not allowed to drink")

    val result = if (age > 21) "you are allowed to drink" else "you are not allowed to drink"
    println("age= $age , result= $result")

    print("What day is today?")
    val day = "Friday" // readLine()
    when (day) {
        "Monday" -> println(1)
        "Friday" -> println(0)
        "Sunday" -> println(2)
        else -> println(3)
    }

    val num = when (day) {
        "Monday", "Wednesday" -> 1
        "Friday" -> 0
        "Sunday" -> 2
        else -> 3
    }
    println("num is $num") // 0

    val food = when {
        day == "Monday" -> "Chicken"
        day == "Friday" -> "Salmon"
        day == "Sunday" -> "Steak"
        else -> "Bacon"
    }

    println("selected Food is $food") // Salmon


    // Loops
    val list = listOf<String>("Kotlin", "Java", "Python", "C++")
    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python", 4 to "C++")
    println("**items in ia:")
    for (a in ia) {
        println(a)
    }
    println()

    println("**items in list")
    for (a in list) {
        println(a)
    }
    println()

    println("**items in map")
    for ((key, value) in map) {
        println("$key => $value")
    }
    println()

    // Range operator
    print("i in 1..9 => ")
    for (i in 1..9) {
        print(i) // 123456789
    }
    println()

    print("i in 1 until 9 step 2 => ")
    for (i in 1 until 9 step 2) {
        print(i) // 1357
    }
    println()

    print("i in 9 downTo 1 => ")
    for (i in 9 downTo 1) {
        print(i) // 987654321
    }
    println()


    // extension function
    fun String.getEmotion(): String {
        return when {
            last() == '!' -> "Exciting"
            last() == '?' -> "Curious"
            last() == '.' -> "Calm"
            else -> "unidentified"
        }
    }

    val s = "how are you?"
    println(s.getEmotion()) // Curious


    val p1 = Person()
    println("p1: my name is ${p1.firstName}  ${p1.lastName}, and I am ${p1.age} years old.")

    val p2 = Person(firstName = "Peter", lastName = "Jackson", age = 29)
    print("p2 full name:")
    println(p2.fullName) // Peter Jackson

    val p3 = Person(year = 3)
    println("p3: my name is ${p3.firstName}  ${p3.lastName}, and I am ${p3.age} years old.")
    println("  id: ${p3.id}") // John Smith19
    println()

    val e1 = Employee(company = "xyz")
    println("e1 is is ${e1.id}") //John Smithxyz19

    // cannot initialize PPerson as its abstract
    // val pp1 = PPerson() -> Cannot create an instance of an abstract class
    val s1 = Student(school = "ABCD")
    print("s1 id: ${s1.id}") // John SmithABCD19

    println()
    e1.wearClothes() // Employee wears suit and ties
    s1.wearClothes() // Student wears uniform
}