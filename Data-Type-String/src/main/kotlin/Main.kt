fun main(args: Array<String>) {
    var message : String = "Hello World" //"" is a string for one line
    var firstname : String = "John"
    var lastname : String = "Doe"
    var address: String = """   
        1234 Main Street
        Houston, TX 77002""".trimIndent() // """ is a string for multiple lines, trimIndent() is to remove the indent
    // print
    println(message)
    println(firstname)
    println(lastname)
    println(address)

    // add two strings
    var fullname : String = firstname + " " + lastname
    println("\nFullname: "+ fullname)

    // string template
    var fullname2 : String = "$firstname $lastname"
    var desc: String = "total length: ${fullname2.length}"
    println("\nFullname: $fullname2")
    println(desc)
}