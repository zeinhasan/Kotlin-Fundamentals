fun main() {
    // Boolean operators in Kotlin
    // && -> AND
    // || -> OR
    // ! -> NOT
    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 75

    if (passFinalExam && passAttendant) {
        println("You are eligible to take the final exam")
    } else {
        println("You are not eligible to take the final exam")
    }
}