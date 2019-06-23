package rocks.danielw.chapter4

import java.math.BigDecimal
import java.util.*

fun main() {

  /**************************************************************************
   * Initialize arrays
   **************************************************************************/
  val names = arrayOf("John", "Jane", "Joe", "Jill")
  val intValues = arrayOf(1, 2, 3, 4)
  val longValues1 = arrayOf(10L, 20L, 30L)
  val longValues2 = arrayOf<Long>(1, 2, 3, 4)

  // Array with 16 elements and a lambda as initializer
  val evenNumbers = Array(16) { i -> i * 2 }

  val lotsOfNumber = Array(1000000) { i -> i + 1 }
  val allZeros = Array(100) { 0 }

  // you have to specify the type if you initialize the array with another statement
  val intValues2: Array<Int>
  intValues2 = arrayOf(7, 8, 9)

  // array of type Any
  val mixedArray = arrayOf("Hello Word", 1, 1L, 4.1F, 4.13456, BigDecimal(10.5))

  // if you want to use the array as input of a java method you have to use intArray, doubleArray, longArray and so forth
  val javaCompatibleIntArray = intArrayOf(1, 2, 5, 10)

  // Array<Int> vs. IntArray (java equivalent of int[])
  val someIntArray2 = IntArray(5) // array is initialized with default value of used data type
  // val someIntArray1 = Array<Int>(5) -> won't compile


  /**************************************************************************
   * Get elements from array
   **************************************************************************/
  val value = names[1]
  println("Value is: $value")


  /**************************************************************************
   * Print array
   **************************************************************************/
  println(Arrays.toString(names))
  names.forEach { println(it) }

  for (number in evenNumbers) {
    print("$number ")
  }


  /**************************************************************************
   * Convert array to java equivalent
   **************************************************************************/
  val javaIntArray: IntArray = intValues.toIntArray()
  val kotlinIntArray: Array<Int> = javaIntArray.toTypedArray()


  /**************************************************************************
   * Null references
   **************************************************************************/
  val nullableInts1: Array<Int?> = arrayOf(null, null, null)
  val nullableInts2 = arrayOfNulls<Int>(3)

}
