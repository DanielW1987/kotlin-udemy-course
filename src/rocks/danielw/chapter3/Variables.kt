package rocks.danielw.chapter3

import rocks.danielw.model.Employee

fun main() {
  // variable 'number' is immutable (like final in Java)
  val number = 25 // type inference

  // variable 'number2' is mutable
  var number2: Int = 30 // explicit typing

  println(number)
  println(number2)

  val employee1 = Employee(1, "Lynn", "Jones")
  employee1.lastName = "Smith"

}
