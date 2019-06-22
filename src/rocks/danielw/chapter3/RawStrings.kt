package rocks.danielw.chapter3

fun main() {

  // make a raw string literal with """
  val rawString = """This is a raw string literal"""
  println(rawString)

  // you don't have to escape the backslashes within a file path
  val filePath = """c:\somedir\somedi2r"""
  println(filePath)

  // raw string literal with line breaks
  val loremIpsum = """Lorem ipsum dolor sit amet, consetetur sadipscing elitr, 
    |sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
    |sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
    |Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. 
    |Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod 
    |tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
    |At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd 
    |gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.""".trimMargin()

  println(loremIpsum)

  // raw string literal with line breaks
  val loremIpsum2 = """Lorem ipsum dolor sit amet, consetetur sadipscing elitr, 
    *sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
    *sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum""".trimMargin("*")

  println(loremIpsum2)
}
