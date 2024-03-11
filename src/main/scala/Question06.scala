object Question06 {
  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5)
    var f = (x:Int) => x * 2
    println(myMap(f)(l))
  }
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty) List()
    else f(list.head) :: myMap(f)(list.tail)
  }

}
