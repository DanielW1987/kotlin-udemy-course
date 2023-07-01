package rocks.danielw.udemy.chapter3

import rocks.danielw.udemy.model.Employee

// Kotlin has also built-in typealias for java class, for example StringBuilder
typealias EmployeeSet = MutableSet<Employee>

fun main() {
  val employees: EmployeeSet = HashSet()
  employees.add(Employee(1,"John", "Doe"))
  employees.add(Employee(2,"Maria", "Thompson"))

  println(employees)
}
