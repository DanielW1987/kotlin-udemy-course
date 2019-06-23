package rocks.danielw.chapter6

fun main() {

  /*
   * In Kotlin the ternary operator doesn't exist.
   *
   * However, this is not even necessary, since the
   * if statement in Kotlin can use as an expression.
   */
  val someCondition = 50 < 100
  val value = if (someCondition) "less than 100" else "greater or equals than 100"
  println(value)

  // even the following works
  val value2 = if (someCondition) {
    println("less than 100")
    50
  }
  else {
    println("greater or equals than 100")
    100
  }

  println("value2 is $value2")
}