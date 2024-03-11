object Question04 {

  def main(args: Array[String]): Unit = {
    var l = List(9,8,6,6,5,4,3,2,1)
    println(mergesort(l))
  }
  def mergesort(l: List[Int]):List[Int] ={
    if(l.length == 1) l
    else {
      var mid  = l.length/2
      merge(mergesort(first(l,mid)), mergesort(second(l,mid)))
    }
  }

  def first(l:List[Int], n: Int):List[Int] = {
    if(n == 0) List()
    else l.head :: first(l.tail, n-1)
  }

  def second(l:List[Int], n: Int):List[Int] = {
    if(n == 0) l
    else second(l.tail, n-1)
  }

  def merge(l1:List[Int], l2:List[Int]):List[Int] = {
      if(l1.isEmpty && l2.isEmpty) List()
      else if(l1.isEmpty) l2
      else if(l2.isEmpty) l1
      else if(l2.head > l1.head) l1.head :: merge(l1.tail, l2)
      else l2.head :: merge(l1, l2.tail)
  }
}
