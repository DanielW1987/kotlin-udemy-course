package rocks.danielw.chapter5

fun main() {
  /*
   * There are 4 Access modifier in Kotlin:
   *  - public
   *  - protected
   *  - private
   *  - internal (only visible within the module)
   *
   * The default modifier is public (is used if modifier is missing).
   * There exists no package private modifier like in java.
   *
   * KEEP IN MIND WHEN MIX KOTLIN AND JAVA!
   * Kotlins internal is compiled to public on the JVM
   * Kotlins private is compiled to package private on the JVM
   *
   * In Kotlin, the filename and the name of the public class do not
   * have to match. It is even possible to have more than one public class per file.
   * It's also possible to have a private class (not possible in Java)
   */

  val student = Student()

}

// visible to all classes and functions in the same file
private class Student {

}
