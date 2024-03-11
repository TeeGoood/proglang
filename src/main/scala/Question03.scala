object Question03 {
 
  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if(l1.isEmpty) true
    else if (find(l1.head, l2)) subList(l1.tail, l2)
    else false
  }

  def find(x: Any, l:List[Any]): Boolean = {
    if(l.isEmpty) false
    else if (l.head == x) true
    else find(x, l.tail)
  }

  def main(args: Array[String]): Unit = {
    var l1 =  List(1,1,2,3)
    var l2 = List(1,2,3,4,5)
    println(subList(l1, l2))
  }
}
