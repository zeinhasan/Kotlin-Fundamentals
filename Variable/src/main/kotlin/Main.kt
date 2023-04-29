// constant variable
const val PI = 3.14 // const is like static final in Java, it can't be reassigned. Global variable, and must val
const val APP = "Kotlin Fundamentals"

fun main() {
    // immutable variable
    val name:String = "Kotlin" // val is like final in Java, it can't be reassigned
    val lastname = "Programming" // type inference
    println(name)
    println(lastname)

    // mutable variable
    var age:Int = 4 // var can be reassigned
    println(age)
    // in kotlin you can't change the type of variable
    // recommended to use val as much as possible if you don't need to reassign the variable

    // change the value of variable age
    age = 5
    println(age)

    // nullable variable
    var nullable: String? = null // ? means it can be null
    println(nullable)
    // println(nullable.length) // this will throw an error because nullable is null
    println(nullable?.length)

    // change the value of nullable variable
    nullable = "Kotlin"
    println(nullable)
    println(nullable.length) // this will not throw an error because nullable is not null

    // constant variable not available in local scope
    // print constant variable
    println(PI)
    println(APP)
    println(APP.length)
}