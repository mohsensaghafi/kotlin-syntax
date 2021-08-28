package OOP

/* Classic way of define a class
class Person {
    var firstName: String = "John"
    var lastName: String = "Smith"
    var age: Int = 19
}
*/

/* Same class with default constructor
class Person constructor(var firstName: String = "John", var lastName: String = "Smith", var age: Int = 19){
}
*/


// add open to be able to inherit and change for attributes
// in case of abstract doesn't need to use open
open class Person(var firstName: String = "John", var lastName: String = "Smith", var age: Int = 19){
    val fullName: String
        get() = "$firstName $lastName"

    constructor(year: Int): this() {
        age += year
    }

    // part of primary constructor which run before all other constructors
    open val id: String
    init {
        id = fullName + age
    }

}

class Employee(company: String) : Person(), PersonActions {
    override val id = fullName + company + age
    override fun wearClothes() {
        println("Employee wears suit and ties")
    }
}

abstract class PPerson(var firstName: String = "John", var lastName: String = "Smith", var age: Int = 19){
    val fullName: String
        get() = "$firstName $lastName"

    constructor(year: Int): this() {
        age += year
    }

    abstract val id: String
}

class Student (school: String) : Person(), PersonActions {
    override val id = fullName + school + age
    override fun wearClothes() {
        println("Student wears uniform")
    }
}


interface PersonActions {
    fun wearClothes()
}