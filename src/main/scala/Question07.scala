object Question07 {
  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5,6)
    var f = (x:Int) => x < 5
    println(myFilter(f)(l))
  }
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) List()
    else if (!f(list.head)) myFilter(f)(list.tail)
    else list.head :: myFilter(f)(list.tail)
  }




}
