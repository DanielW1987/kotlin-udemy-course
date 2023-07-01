package rocks.danielw.udemy.chapter6

fun main() {

  println(getNumber("22"))
  println(getNumber("a"))

  // It's possible to use elvis operator, but this example seems not to be very useful
  println(getAnotherNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))
  println(getAnotherNumber("a") ?: "Can't print the result")

}

/*
 * Use try/catch as expression
 */
fun getNumber(str: String): Int {
  return try {
    Integer.parseInt(str) // value get's returned
  }
  catch (e: NumberFormatException) {
    0 // value get's also returned
  }
  finally {
    println("I'm in finally block")
    // can't return a value when try/catch used as expression
  }
}

/*
 * Returning nullable data type to use elvis operator at the calling side
 */
fun getAnotherNumber(str: String): Int? {
  return try {
    Integer.parseInt(str)
  }
  catch (e: NumberFormatException) {
    null
  }
}
