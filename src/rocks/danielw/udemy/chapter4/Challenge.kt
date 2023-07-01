package rocks.danielw.udemy.chapter4

import rocks.danielw.udemy.chapter4.java.MyJavaClass

fun main() {

  /*
   * Declare a non-nullable float variable two ways,
   * and assign it the value -3847.384
   */
  val floatValue1 = -3847.384F
  val floatValue2: Float = -3847.384F


  /*
   * Now change one of those variable declaration into nullable variable
   */
  val floatValue4: Float? = -3847.384F


  /*
   * Now declare an array of type non-nullable Short. Make it size 5,
   * and assign it the values 1, 2, 3, 4, 5
   */
  val shortArray1: Array<Short> = arrayOf(1, 2, 3, 4, 5) // Java primitive short[]
  val shortArray2 = shortArrayOf(1, 2, 3, 4, 5) // Kotlin generic array type


  /*
   * Now declare an array of nullable Ints and initialize it with the values
   * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 etc., all the way up to 200
   */
  val intArray1: Array<Int?> = Array(40) { i -> i * 5 + 5 }
  val intArray2 = Array<Int?>(40) { i -> (i + 1) * 5 }

  intArray1.forEach { print("$it ") }
  println()
  intArray2.forEach { print("$it ") }
  println()


  /*
   * You jave to call a Java method with the following signature from Kotlin:
   * public void method1(char[] charArray). Declare an array that you could
   * pass to the method and initialize it with the values 'a', 'b' and 'c'.
   */
  val charArray = charArrayOf('a', 'b', 'c')
  val myJavaClass = MyJavaClass()
  myJavaClass.method1(charArray)


  /*
   * Given the following code:
   * val x: String? = "I AM AN UPPERCASE"
   *
   * Using one line of code, declare another string variable,
   * and assign it x.toLowerCase() when x isn't null,
   * and the string "I give up!" when x is null.
   */
  val x: String? = "I AM AN UPPERCASE"
  val anotherString = x?.toLowerCase() ?: "I give up!"


  /*
   * Now use the let function to (a) lowercase the string, and then
   * (b) replace "am" with "am not" in the result
   */
  val transformedString1 = x?.let { transformString(it) }
  val transformedString2 = x?.let { it.toLowerCase().replace("am", "am not") }


  /*
   * You're really, really confident that the variable myNonNullVariable can't contain null.
   * Change the following code to assert that myNonNullVariable isn't null (and shoot yourself
   * in the foot)
   */
  val myNonNullVariable: Int? = null
  myNonNullVariable!!.toDouble() // will produce KotlinNullPointerException

}

fun transformString(text: String): String {
  return text.toLowerCase().replace("am", "am not")
}
