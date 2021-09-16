package lectures.week1basics

/**
 * Примитивы https://proselyte.net/tutorials/scala/data-types/
 */
object TypesValuesVariables extends App {
  val aString = "Hello" //val - const,  иначе var
  val bString: String = "Hello"
  val aChar = 'C'

  val aInt = 11
  val aLong = 11L
  val bLong: Long = 11
  val aFloat = 2.0f
  val aDouble = 2.0

  val aBoolean = true

  println(bLong.getClass)
}
