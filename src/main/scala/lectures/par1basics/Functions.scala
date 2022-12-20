package lectures.par1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  } // can be in parentheses or not

  println(aFunction("Hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  //println(aParameterLessFunction) only valid in SCALA 2 not in 3 anymore

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))
  // WHEN YOU NEED LOOPS, USE RECURSION (APPLICABLE IN FUNCTIONAL PROGRAMMING). NO IMPERATIVE CODE WITH SCALA SYNTAX!!!

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int  = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  /*
  Exercises:
  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old.
  2. Factorial function 1 * 2 * 3 * .. * n
  3. A Fibonacci function
    f(1) = 1
    f(2) = 1
    f(n) = f(n-1) + f(n-2)
  4. Tests if a number is prime.
  */
  def aGreetingFunction(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old."
  println(aGreetingFunction("Norbert", 27))
  def aFactorialFunction(n: Int): Int =
    if (n <= 0) 1
    else n * aFactorialFunction(n - 1)

  println(aFactorialFunction(4))

  def aFibonnaciFunction(n: Int): Int =
    if (n <= 2) 1
    else aFibonnaciFunction(n-1) + aFibonnaciFunction(n-2)

  println(aFibonnaciFunction(8))
  def aPrimeTester(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(aPrimeTester(37))
  println(aPrimeTester(2003))
  println(aPrimeTester(17*4))
}
