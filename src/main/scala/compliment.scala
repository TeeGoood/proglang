object compliment {
  def main(args: Array[String]): Unit = {
    println(compliment((x:Int)=> x+1))(2))
  }

  def compliment(f:Int => Int): Int => Int = {
    (x:Int) => f(x) * -1
  }
}
