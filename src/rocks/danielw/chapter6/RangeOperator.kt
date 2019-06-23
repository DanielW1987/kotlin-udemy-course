package rocks.danielw.chapter6

fun main() {

  /*********************************************************
   * The following syntax doesn't exist in Kotlin:
   *
   *   for (int i = 0; i < 10; i++) {
   *     // do something
   *   }
   *
   * The replacement for this is the range operator:
   *
   *   for (i in 0..9) {
   *     // do something
   *   }
   *********************************************************/


  /*********************************************************
   * Initialization
   * The start and end value of each range is inclusive.
   *********************************************************/
  val intRange = 1..5
  val charRange = 'a'..'z'
  val stringRange = "ABD".."XYZ"
  val backwardRange = 5.downTo(1)
  val stepRange = 3..15
  val stepThree = stepRange.step(3)
  val reversedAlphabet = charRange.reversed()


  /*********************************************************
   * Check whether a specified value is within a range or not
   *********************************************************/
  println(3 in intRange)            // prints true
  println('v' in charRange)         // prints true
  println("CCC" in stringRange)     // prints true
  println("CCCCCC" in stringRange)  // prints true
  println("ZZZZZZ" in stringRange)  // prints false
  println("ZZZZZZ" !in stringRange) // prints true
  println('a' in "Hello World")     // prints false
  println('e' in "Hello World")     // prints true
  println("ll" in "Hello World")    // prints true


  /*********************************************************
   * Looping through ranges with for
   *********************************************************/
  for (i in intRange) {
    print("$i ")
  }
  println()


  for (i in 1..10) {
    print("$i ")
  }
  println()


  for (i in 1..20 step 2) {
    print("$i ")
  }
  println()


  for (i in 100 downTo 1 step 10) {
    print("$i ")
  }
  println()

  // NOTE: The end of a range is always inclusive. That is different from Java.
  // If you want to work with exclusive end index you have to use until operator.
  for (i in 1 until 10) {
    print("$i ")
  }
  println()


  /*********************************************************
   * Looping through ranges with forEach method
   *********************************************************/
  stepThree.forEach { print("$it ") }
  println()


  charRange.forEach { print("$it ") }
  println()


  reversedAlphabet.forEach { print("$it ") }
  println()


  /*********************************************************
   * Looping through strings
   *********************************************************/
  val str = "Hello Word"
  for (c in str) {
    print("$c ")
  }


  /*********************************************************
   * Looping through arrays
   *********************************************************/
  val seasons = arrayOf("spring", "summer", "fall", "winter")

  for (season in seasons) {
    println(season)
  }

  for (index in seasons.indices) {
    println("${seasons[index]} is season number $index")
  }

  seasons.forEach { println(it) }
  seasons.forEachIndexed { index, value -> println("$value is season number $index") }

  println("whatever" in seasons) // prints false
  println("summer" in seasons)   // prints true

}
