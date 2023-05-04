fun main() {
    // If Expression in Kotlin
    """
    if (condition) {
        // code
    } else {
        // code
    }
    """
    val examValue: Int = 80
    if (examValue > 90) {
        println("A")
    } else if (examValue > 80) {
        println("B")
    } else if (examValue > 70) {
        println("C")
    } else if (examValue > 60) {
        println("D")
    } else {
        println("E")
    }
}
