package lectures.par1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 5)
  //MATH EXPRESSIONS + - * / & | << >> >>> (right shift with zero extension)
  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE, TYPE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // loops are not usually use in SCALA
  var i =0
  while (i<10){
    println(i)
    i += 1
  }
  // AVOID LOOPS IN SCALA (IMPERATIVE PROGRAMMING)
  // EVERYTHING in SCALA is an Expression!
  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println, whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Goodbye"
  }// Code block is an Expression, the value of code block is the last expression defined (if in this case)

  // val anotherValue = z + 1
  // compiler error in above example as z is not accessible

  // 1. difference between "hello world" vs println("hello world")?
  // "hello world" is a val of type String, println is an expression (side effect in this content) which returns unit (void)
  // 2. what is the value of someValue?
  val someValue = {
    2 < 3 // boolean equals to True
  }
  // 3. what is the value of someOtherValue

  val someOtherValue = {
    if(someValue) 239 else 986
    42 //value of someOtherValue equals to 42
  }
}
