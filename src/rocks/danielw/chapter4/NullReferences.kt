package rocks.danielw.chapter4

fun main() {

  /*
   * ? operator
   * String is a non-null data type by default, so the following won't compile:
   *
   *   val str: String = null
   *
   * If you want to do this you have to explicitly make the data type to a nullable data type with the ? operator
   */
  val str: String? = null


  /*
   * Kotlin enforces null checks for a nullable data type.
   * That's why the following line won't compile:
   *
   *   str.toUpperCase()
   *
   * You have to do an explicitly null check.
   */
  if (str != null) {
    println(str.toUpperCase())
  }


  /*
   * Null check is necessary even if the value is not null but data type is marked as nullable data type,
   */
  val str2: String? = "This is not null"
  // str2.toUpperCase() => won't compile


  /*
   * Safe call operator
   * Adds a null check under the hood.
   *
   * Shorthand for:
   * if (str2 == null) {
   *   null
   * }
   * else {
   *   str2.toUpperCase()
   * }
   */
  str2?.toUpperCase()


  /*
   * The safe call operator is very useful in scenarios where you have to check for null several times.
   * The following lines are at least 5 lines in Java!
   */
  // val countryCode: String = bankBranch?.address?.country?.countryCode


  /*
   * Elvis operator
   * You can assign a default value instead of null via the elvis operator ( ?: )
   */
  val str3 = str ?: "Default value"
  println("str3 is $str3")

  // val countryCode: String = bankBranch?.address?.country?.countryCode ?: "US"


  /*
   * Non-null asserted call operator
   * If you sure the variable is never null
   */
  str2!!.toUpperCase()


  /*
   * let function
   * Scenario: We have a nullable data type but method wants a non-null data type
   */
  val str5: String? = "My Text"
  // printText(str5) => won't compile'
  str5?.let { printText(it) } // does nothing if str5 is null


  /*
   * Safe cast operator
   * Used to prevent ClassCastException
   */
  val something: Any = arrayOf(1, 2, 3)
  // try to cast array to string; will not work and evaluates to null; we have to use String? or no data type because kotlin compiler infers to String?
  val str4: String? = something as? String
  println(str4) // prints null

}

fun printText(text: String) {
  println(text)
}