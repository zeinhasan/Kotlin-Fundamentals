fun main() {
    // When Expression in Kotlin
    """
        When Expression in Kotlin
        =========================
        1. When Expression is like Switch Case in Java
        2. When Expression is more powerful than Switch Case
        3. When Expression can be used as a statement or as an expression
        4. When Expression can be used with or without argument
        5. When Expression can be used with or without else
        
        Syntax:
        =======
        when (variable) {
            value1 -> statement1
            value2 -> statement2
            value3 -> statement3
            else -> statement4
        }
        
    """.trimIndent()
    val FinalExam: Char = 'A'
    when (FinalExam) {
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Fair")
        'D' -> println("Poor")
        else -> println("Fail")
    }
    """
        When Expression Multiple Options
        ================================
        Syntax:
        =======
        when (variable) {
            value1, value2 -> statement1
            value3, value4 -> statement2
            value5, value6 -> statement3
            else -> statement4
        }
    """.trimIndent()
    val FinalExam2: Char = 'E'
    when (FinalExam2) {
        'A', 'B' -> println("Excellent")
        'C', 'D' -> println("Good")
        'E', 'F' -> println("Fair")
        else -> println("Fail")
    }
    """
        When Expression in Range
        ========================
        Syntax:
        =======
        when (variable) {
            in range1 -> statement1
            in range2 -> statement2
            in range3 -> statement3
            else -> statement4
        }
    """.trimIndent()
    val FinalExam3: Int = 80
    when (FinalExam3) {
        in 80..100 -> println("Excellent")
        in 70..79 -> println("Good")
        in 60..69 -> println("Fair")
        in 50..59 -> println("Poor")
        else -> println("Fail")
    }
    """
        When Expression in
        ========================
        Syntax:
        =======
        when (variable) {
            in type1 -> statement1
            !is type2 -> statement2
        }
    """.trimIndent()
    val FinalExam4: Any = 80
    val PassValue = arrayOf(80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)
    when (FinalExam4) {
        in PassValue -> println("Pass")
        !in PassValue -> println("Not Pass")
    }
    """
        When Expression in is
        ========================
        Syntax:
        =======
        when (variable) {
            is type1 -> statement1
            is type2 -> statement2
        }
    """
    val FinalExam5: Any = 80
    when (FinalExam5) {
        is String -> println("String")
        is Int -> println("Integer")
        is Double -> println("Double")
        is Float -> println("Float")
        is Char -> println("Char")
        is Boolean -> println("Boolean")
        else -> println("Not Match")
    }
}