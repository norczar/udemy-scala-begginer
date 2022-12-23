package lectures.par1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
    @tailrec
    def tailRecFactorial(n: Int, acc: Int = 1): Int =
      if (n <= 1) acc
      else tailRecFactorial(n-1, n*acc)

    val fact10 = tailRecFactorial(10)

    def savePicture(format: String = "jpg", width: Int, height: Int): Unit = println("saving picture")
    savePicture(width=800, height = 600)
    savePicture(height=1080, width=1920)
    /*
    1.pass in every leading argument
    2. name the arguments
     */
}
