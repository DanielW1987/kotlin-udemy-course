package rocks.danielw.udemy.model

data class Employee(val id: Int, val firstName: String, var lastName: String) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Employee

    if (id != other.id) return false
    if (firstName != other.firstName) return false
    return lastName == other.lastName
  }

  override fun hashCode(): Int {
    var result = id
    result = 31 * result + firstName.hashCode()
    result = 31 * result + lastName.hashCode()
    return result
  }

  override fun toString(): String {
    return "$firstName $lastName"
  }
}
