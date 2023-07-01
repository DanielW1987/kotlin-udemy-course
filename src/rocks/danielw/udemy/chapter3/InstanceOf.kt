package rocks.danielw.udemy.chapter3

import rocks.danielw.udemy.model.Employee

fun main() {
  val employee: Any = Employee(1, "John", "Doe")

  // like instanceOf in Java
  if (employee is Employee) {
    // Casting (no explicit cast is needed here because of kotlins smart casting feature, just for demo purpose)
    val newEmployee = employee as Employee
  }

  // is not instanceOf
  if (employee !is Employee) {
    // do something
  }
}