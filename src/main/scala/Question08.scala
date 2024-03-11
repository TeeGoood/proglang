object Question08 {
  def main(args: Array[String]): Unit = {
    var l1 = List()
    var l2 = List(1)
    var l3 = List(1,2)
    var l4 = List(1,2,3,4)
    var lists = List(l1,l2,l3)
    println(sumAll(lists))
  }
  def sumAll(lists:List[List[Int]]) :List[Int] = {
    if(lists.isEmpty) List()
    else merge(lists.head, sumAll(lists.tail))
  }

  def merge(l1:List[Int], l2:List[Int]): List[Int] = {
    if(l1.isEmpty && l2.isEmpty) List()
    else if(l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else l1.head + l2.head :: merge(l1.tail, l2.tail)
  }
}
