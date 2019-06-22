package rocks.danielw.chapter3

import rocks.danielw.model.Employee

fun main() {
  val employee1 = Employee(1, "John", "Doe")
  val employee2 = Employee(2, "Jane", "Johnson")
  val employee3 = Employee(2, "Jane", "Johnson")
  val employee4 = employee1

  println(employee1 == employee2)  // false => as expected
  println(employee2 == employee3)  // true  => == works like equals in Java
  println(employee1 === employee4) // true  => use === to check for referential equality

}
