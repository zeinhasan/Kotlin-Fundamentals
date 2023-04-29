fun main() {
    // Array in Kotlin is not dynamic, it's fixed size
    // Array in Kotlin only can store same type of data
    val number: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val char: Array<Char> = arrayOf('a', 'b', 'c', 'd', 'e')
    val string: Array<String> = arrayOf("Hello", "World", "Kotlin")
    // array in kotlin is zero based index
    // print from index
    println("Get value from index")
    println(number[0])
    println(char[0])
    println(string[0])
    // print all
    println("\nGet all value")
    println(number.contentToString())
    println(char.contentToString())
    println(string.contentToString())
    // print size
    println("\nGet size")
    println(number.size)
    println(char.size)
    println(string.size)
    // print index of
    println("\nGet index of")
    println(number.indexOf(1))
    println(char.indexOf('a'))
    println(string.indexOf("Hello"))
    // print last index of
    println("\nGet last index of")
    println(number.lastIndexOf(5))
    println(char.lastIndexOf('e'))
    println(string.lastIndexOf("Kotlin"))
    // print first
    println("\nGet first")
    println(number.first())
    println(char.first())
    println(string.first())
    // print last
    println("\nGet last")
    println(number.last())
    println(char.last())
    println(string.last())

    ////////////////////////////////////////////////// Array operation//////////////////////////////////////////////////
    // size -> get size of array
    // get(index) -> get value of array at index
    // set(index, value) -> set value of array at index
    // [index] -> get value of array at index
    // indexOf(value) -> get index of value
    // lastIndexOf(value) -> get last index of value
    // first() -> get first value of array
    // last() -> get last value of array
    // contentToString() -> get all value of array
    // copyOf() -> copy array
    // copyOfRange(from, to) -> copy array from index to index
    // fill(value) -> fill array with value
    // sort() -> sort array
    // reverse() -> reverse array
    // forEach { } -> loop array
    // forEachIndexed { index, value -> } -> loop array with index
    // filter { } -> filter array
    // map { } -> map array
    // any { } -> check if any value match
    // none { } -> check if none value match
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Array operation code
    val members: Array<String> = arrayOf("John", "Jane", "Jill", "Joe")
    val John: String = members[0]
    val Jane: String = members[1]
    val Jill: String = members.get(2)

    // set value of array at index
    members.set(3, "Jack")
    println(members[3])

    // Array nullable
    val nullableArray: Array<Int?> = arrayOfNulls(5)    // [null, null, null, null, null]
    println(nullableArray.contentToString())
}