package lectures.par1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  // VALS ARE IMMUTABLE
  val y = 10
  //TYPES ARE OPTIONAL, COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  // Basic Types
  val aBoolean: Boolean = true //or false
  val aChar: Char = 'a'
  val anInt: Int = x //4 bytes representation
  val aShort: Short = 4613 //2 bytes representation
  val aLong: Long = 312314131L //8 bytes representation
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // Variables
  var aVariable: Int = 4
  // variables are mutable
  aVariable = 5 // side effects
  // functional programming involve more working with vals than vars (side effects)
}
