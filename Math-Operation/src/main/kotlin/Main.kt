fun main() {
    // Math operations in Kotlin
    // + (addition)
    // - (subtraction)
    // * (multiplication)
    // / (division)
    // % (modulus)
    // ++ (increment)
    // -- (decrement)

    // Addition
    val addition:Int = 1 + 1
    println("1 + 1 = $addition")

    // Subtraction
    val subtraction:Int = 2 - 1
    println("2 - 1 = $subtraction")

    // Multiplication
    val multiplication:Int = 2 * 2
    println("2 * 2 = $multiplication")

    // Division
    val division = 4.0 / 2.0
    println("4 / 2 = $division")

    // Modulus
    val modulus:Int = 5 % 2
    println("5 % 2 = $modulus")

    // Increment
    var increment:Int = 1
    increment++
    println("1++ = $increment")

    // Decrement
    var decrement:Int = 2
    decrement--
    println("2-- = $decrement")

    // Augmented assignment operators
    // += (addition)
    // -= (subtraction)
    // *= (multiplication)
    // /= (division)
    // %= (modulus)

    // Addition
    var augmentedAddition:Int = 1
    augmentedAddition += 1
    println("1 += 1 = $augmentedAddition")

    // Subtraction
    var augmentedSubtraction:Int = 2
    augmentedSubtraction -= 1
    println("2 -= 1 = $augmentedSubtraction")

    // Multiplication
    var augmentedMultiplication:Int = 2
    augmentedMultiplication *= 2
    println("2 *= 2 = $augmentedMultiplication")

    // Division
    var augmentedDivision:Double = 4.0
    augmentedDivision /= 2.0
    println("4 /= 2 = $augmentedDivision")

    // Modulus
    var augmentedModulus:Int = 5
    augmentedModulus %= 2
    println("5 %= 2 = $augmentedModulus")

    // Unary operators
    // + (positive)
    // - (negative)
    // ! (not)
    // ++ (increment)
    // -- (decrement)

    // Positive
    val positive:Int = +1
    println("+1 = $positive")

    // Negative
    val negative:Int = -1
    println("-1 = $negative")

    // Not
    val not:Boolean = !true
    println("!true = $not")

    // Increment
    var unaryIncrement:Int = 1
    unaryIncrement++
    println(unaryIncrement)

    // Decrement
    var unaryDecrement:Int = 2
    unaryDecrement--
    println(unaryDecrement)

}