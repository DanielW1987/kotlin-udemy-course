package rocks.danielw.chapter3

fun main() {

  val hello1 = "Hello"
  val hello2 = "Hello"

  println("Are hello1 and hello2 referentially equal: ${hello1 === hello2}")
  println("Are hello1 and hello2 structurally equal: ${hello1 == hello2}")


  val value: Any = "The Any type is the root of the class hierarchy"
  // using smart cast
  if (value is String) {
    println(value)
  }

  // using explicit cast
  println((value as String).toUpperCase()) // explicit cast

}
