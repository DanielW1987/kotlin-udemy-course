package rocks.danielw.youtube

fun main() {
    val max = getMax(5, 9)
    println("Max: $max")

    val min = getMin(5, 9)
    println("Min: $min")

    sendMessage("Hello World")
    sendAnotherMessage(name = "Johanna Doe")

    val sum = sum(5, 6, 7, 8, 9, 10)
    println("Sum is $sum")
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/*
 * Single expression function
 * Is a function where a single expression is assigned to the function, and the expression’s evaluated value is
 * returned when this function is called.
 */
fun getMin(a: Int, b: Int) = if (a < b) a else b


/*
 * Default arguments
 */
fun sendMessage(message: String, name: String = "John Doe") {
    println("Send $message to $name")
}

/*
 * Named arguments
 */
fun sendAnotherMessage(message: String = "Hello World", name: String = sampleName()) {
    println("Send $message to $name")
}

fun sampleName() = "John Doe"

/*
 * Varargs
 */
fun sum(vararg numbers: Int) = numbers.sum()
