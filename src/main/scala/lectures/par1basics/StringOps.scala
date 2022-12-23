package lectures.par1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString: String = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println('a' + aNumberString + 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators.

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turining ${age+1} years old"
  println(greeting)
  println(anotherGreeting)

  // F-interpolators - for formatted strings similar to printf
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute" //2.2f means 2 characters total, minimum 2 decimals precision
  println(myth)

  // raw-interpolator - ignores escaped characters in string (exception for injected vales)
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
