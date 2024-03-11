object partition {
  def main(args: Array[String]): Unit = {
    println(patition(List(2,2,1,2,1,2), (x:Int) => x == 2))
  }

  def patition(l:List[Int], f: Int => Boolean) = {
    def check(l:List[Int], l1:List[Int], l2:List[Int]):List[List[Int]] = {
      if(l.isEmpty) List(l1,l2)
      else if(f(l.head)) check(l.tail, l.head :: l1, l2)
      else check(l.tail, l1, l.head :: l2)
    }
    check(l, List(), List())
  }


}
