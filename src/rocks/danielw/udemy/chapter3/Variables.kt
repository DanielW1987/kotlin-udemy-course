package rocks.danielw.udemy.chapter3

import rocks.danielw.udemy.model.Employee

fun main() {
  // variable 'number' is immutable (like final in Java)
  val number = 25 // type inference
  // number = 20 // does not compile

  // variable 'number2' is mutable
  var number2: Int = 30 // explicit typing which is redundant
  number2 = 35

  println(number)
  println(number2)

  val employee1 = Employee(1, "Lynn", "Jones")
  employee1.lastName = "Smith"

}
