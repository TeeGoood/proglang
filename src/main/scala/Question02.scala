object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
      if(l.isEmpty) List(x)
      else if(l.head < x) l.head :: insertInOrder(x, l.tail)
      else x :: l
  }

  def main(args: Array[String]): Unit = {
    var l = List(1,3,4,7)
    println(insertInOrder(2,l))
  }

}
