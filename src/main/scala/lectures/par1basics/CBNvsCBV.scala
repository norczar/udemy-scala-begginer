package lectures.par1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    // calledByValue(7358784693954) input parameter is evaluated on call of function
    println("by value: " + x) // println("by value: " + 7358784693954)
    println("by value: " + x) // println("by value: " + 7358784693954)
  }
  def calledByName(x: => Long): Unit = { // => parameter called by name, paramter evaluated when used
    println("by name: " + x) // println("by value: " + System.nanoTime())
    println("by name: " + x) // println("by value: " + System.nanoTime())
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x) // => delays evaluation until it is used

//  printFirst(infinite(), 34)  -> stack overflow error
  printFirst(34, infinite()) //not a problem, as infinite function is not used, therefore infinite will not be valuated
}
