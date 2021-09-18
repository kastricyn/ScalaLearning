package lectures.week1basics

object Expressions extends App {
  val aVal = 1 + 2 * 3
  val aNumber: Int = if ("string".length == 6 & 1 < 2 & ('1' +: "23" :+ '4').toInt == 1234) 24 else 123
  println(aNumber)

  val someVal: Unit = print("It is just a value")
  print(someVal)
}
