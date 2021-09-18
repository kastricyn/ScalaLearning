package lectures.week1basics

import scala.annotation.tailrec

object Recursion {
  var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }
  // не используйте изменяемые переменные

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(3)) // выводит 6
  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }

    loop(n)
  }
}
