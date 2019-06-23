package rocks.danielw.chapter4

fun main() {
  /*
   * integers
   */

  val myShort: Short = 50 // Data type must be specified explicitly, since all integers are Int by default
  val myByte: Byte = 5    // Data type must be specified explicitly, since all integers are Int by default
  val myInt = 10          // Data type is Int
  var myLong = 20L        // Data type is Long

  /*
    It's not possible to put an Int value into an Long variable.
    This won't compile:
      myLong = myInt

    We have to use converter methods instead
   */
  myLong = myInt.toLong()
  
  
  /*
   * floating-point numbers
   */
  var myDouble = 12.3456
  val myFloat = 987.654F
  
  // no automatic widening, you have to use converter method
  myDouble = myFloat.toDouble()
  

  /*
   * characters
   */
  val myChar = 'a'
  
  // convert from Int to char works only with use of converter method
  val myIntToBeInterpretedAsChar = 65 // compiler assumes this is an Int
  // val myCharFromInt2: Char = 65 // This won't compile
  val myCharFromtInt3 = myIntToBeInterpretedAsChar.toChar()


  /*
   * Boolean
   * (nothing special)
   */
  val myBoolean1 = true
  val myBoolean2 = false


  /*
   * Any
   * Root of all Kotlin objects that defines function definitions for equals, hashCode and toString
   */
  val anything: Any = "Any data type"
}
