package rocks.danielw.chapter3

import rocks.danielw.model.Employee

fun main() {
  // print variables without string concatenation
  val firstName = "John"
  val lastName = "Doe"
  println("The name is $firstName $lastName")

  // escape $ with \
  val change = 4.22
  println("To show the value of change, we use \$change")

  // do inline calculation
  val numerator = 10.99
  val denominator = 20.00
  println("The value of $numerator divided by $denominator is ${numerator / denominator}")

  // print member from a variable
  val employee = Employee(1, "John", "Doe")
  println("Id of employee is ${employee.id}")

}
