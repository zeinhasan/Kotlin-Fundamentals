fun main() {
    // Integer number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000 // Short is the default data type
    var balance: Long = 10000000000L
    // Print
    println(age)
    println(height)
    println(distance)
    println(balance)

    // Example
    var myAge = 30
    var myHeight = 170
    var myDistance = 2000 // Int is the default data type
    var myBalance = 10000000000L // L is required to indicate that it is a long
    // Print
    println("\n") // print empty space
    println(myAge)
    println(myHeight)
    println(myDistance)
    println(myBalance)

    // Floating point number
    var myWeight2: Float = 65.5F // F is required to indicate that it is a float
    var myHeight2: Double = 170.5556658
    // Print
    println("\n") // print empty space
    println(myWeight2)
    println(myHeight2)

    // literal
    var decimalLiteral : Int = 100
    var hexadecimalLiteral : Int = 0xFF // Ox is required to indicate that it is a hexadecimal => 255
    var binaryLiteral : Int = 0b0001 // 0b is required to indicate that it is a binary => 1
    // Print
    println("\n") // print empty space
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // Underscore in numeric literals to improve readability
    var oneMillion = 1_000_000
    var creditCardNumber = 1234_5678_9012_3456L
    var socialSecurityNumber = 999_99_9999L
    var hexBytes = 0xFF_EC_DE_5E
    var bytes = 0b11010010_01101001_10010100_10010010
    // Print statement
    println("\n") // print empty space
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    // Type conversion
    var number: Int = 100
    // conversion
    var byte: Byte = number.toByte() // toByte() is a function to convert to byte
    var short: Short = number.toShort() // toShort() is a function to convert to short
    var long: Long = number.toLong() // toLong() is a function to convert to long
    var float: Float = number.toFloat() // toFloat() is a function to convert to float
    var double: Double = number.toDouble() // toDouble() is a function to convert to double
    // Print
    println("\n") // print empty space
    println(byte)
    println(short)
    println(long)
    println(float)
    println(double)
}