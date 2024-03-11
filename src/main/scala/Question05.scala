object Question05 {
  def main(args: Array[String]): Unit = {
    var l1 = List(1,2,3,2,1)
    var l2 = List(5,4,3,4,5)
    println(palindrome(l1))
    println(palindrome(l2))
  }
  def palindrome(l :List[Any]): Boolean ={
     var rl = reverse(l)
     check(l,rl)
  }

  def reverse(l:List[Any]): List[Any] = {
    if(l.isEmpty) List()
    else reverse(l.tail) ++ List(l.head)
  }

  def check(l1:List[Any], l2:List[Any]): Boolean = {
    if(l1.isEmpty) true
    else if (l1.head != l2.head) false
    else check(l1.tail, l2.tail)
  }



}
