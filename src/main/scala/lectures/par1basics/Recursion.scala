package lectures.par1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  // println(factorial(5000)) stack overflow

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x*accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }
  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = factHelper(2, 3 * 4 * ... * 10 * 1)
  =factHelper(1, 2 * 3 * 4 * ... * 10)
  = 1, 2 * 3 * 4 * ... * 10
  */
  // WHEN YOU NEED LOOPS, USE TAIL RECURSION
  // The trick to tail recursion is to use ACCUMULATORS!
  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
  */
  @tailrec
  def concanateStrings(str: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concanateStrings(str, n-1, str + accumulator)

  println(concanateStrings("Hello!",2, ""))

  def aPrimeTester(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int, stillPrime: Boolean): Boolean =
      if (!stillPrime) false
      else if (t <= 1) true
      else isPrimeUntil(t - 1, n % t !=0 && stillPrime)

    isPrimeUntil(n / 2, true)
  }

  println(aPrimeTester(2003))
  println(aPrimeTester(629))

  def aFibonnaciFunction(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, accumulator1: Int, accumulator2: Int): Int =
      if (i >= n) accumulator1
      else fiboTailrec(i + 1, accumulator1 + accumulator2, accumulator1)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  println(aFibonnaciFunction(8))
}
