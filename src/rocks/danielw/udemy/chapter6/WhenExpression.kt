package rocks.danielw.udemy.chapter6

import rocks.danielw.udemy.model.Season
import java.math.BigDecimal

fun main() {

  /*
   * The when expression is essentially the same as the switch statement in Java
   * but much better (like new Java switch statement in Java 12).
   */
  val num = 200
  when(num) {
    100 -> println("100")
    200 -> println("200")
    300 -> println("300")
    else -> println("doesn't match anything")
  }

  /*
   * Multi-cases
   */
  val num2 = 150
  when(num2) {
    100, 150 -> println("100 or 150")
    200, 250 -> println("200 or 250")
    300 -> println("300")
    else -> println("doesn't match anything")
  }

  /*
   * Using ranges
   */
  val num3 = 150
  when(num3) {
    in 100..150 -> println("between 100 and 150")
    in 200..250 -> println("between 200 and 250")
    !in 100..150 -> println("not between 100 and 150")
    300 -> println("300")
    else -> println("doesn't match anything")
  }

  /*
   * Using expressions
   */
  val num4 = 10
  when(num4) {
    num4 + 90 -> println("100")
    num4 + 190 -> println("200")
    300 -> println("300")
    else -> println("doesn't match anything")
  }

  /*
   * Using is and Smart Cast feature
   */
  val obj1: Any = BigDecimal(25.5)
  val obj2: Any = obj1

  when(obj2) {
    is String -> println(obj2.uppercase())
    is BigDecimal -> println(obj2.remainder(BigDecimal(10.5)))
    is Int -> println("${obj2 - 4}")
  }

  /*
   * Assigning when expression to variable
   */
  val num5 = 200
  val whenExpression = when(num5) {
    100 -> {
      print("100")
      ", It is 100"
    }
    200 -> {
      print("200")
      ", It is 200"
    }
    300 -> {
      print("300")
      ", It is 300"
    }
    else -> {
      print("doesn't match anything")
      ". Don't know what it is"
    }
  }

  println(whenExpression)

  /*
   * Using enums
   */
  val timeOfYear = Season.WINTER
  val str = when (timeOfYear) {
    Season.SPRING -> "Flowers are blooming"
    Season.SUMMER -> "It's hot!"
    Season.FALL -> "It's getting cooler"
    Season.WINTER -> "I need a coat"
    // we don't need an else, because we use all enum values here
  }
  println(str)

  var num6 = 10
  val anotherTimeOfYear = Season.SPRING
  val str2 = when (anotherTimeOfYear) {
    Season.SPRING -> {
      num6 += 5
      "Flowers are blooming"
    }
    Season.SUMMER -> "It's hot!"
    Season.FALL -> "It's getting cooler"
    Season.WINTER -> {
      num6 += 10
      "I need a coat"
    }
  }
  println("$str2 $num6")

  /*
   * Shorthand for testing conditions
   */
  val number1 = 10
  val number2 = 20

  when {
    number1 > number2 -> println("number1 is greater than number2")
    number1 < number2 -> println("number1 is less than number2")
    else -> println("number1 is is equal to number2")
  }
}
