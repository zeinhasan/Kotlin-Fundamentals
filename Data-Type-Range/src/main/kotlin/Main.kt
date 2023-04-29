fun main() {
    // Range in Kotlin is a sequence of values that has a start and an end value.
    // In Kotlin, we can create a range using the rangeTo() function or .. operator.
    // The rangeTo() function is defined for any comparable type, but the operator form is only defined for Int, Long, Char, and their respective nullable types.
    val range = 1..10 // 1 to 10
    val range2 = 1.rangeTo(10) // 1 to 10
    val range3 = 1 until 10 // 1 to 9
    println(range)
    println(range2)
    println(range3)

    // print 1 to 10
    for (i in range) {
        print("$i ")
    }

    // Range operator
    // count() function returns the number of elements in the range.
    println(range.count())

    // contains() function returns true if the specified value is in the range.
    println(range.contains(5))

    // first() function returns the first element in the range.
    println(range.first())

    // last() function returns the last element in the range.
    println(range.last())

    // step() function returns a progression of values of the range with the given step.
    println(range.step(2))

    // isEmpty() function returns true if the range is empty.
    println(range.isEmpty())

    // Range reversed
    val range4 = 10 downTo 0 step 2 // 10 to 0 with step 2
    println(range4)

    // print 10 to 0
    for (i in range4) {
        print("$i ")
    }

}