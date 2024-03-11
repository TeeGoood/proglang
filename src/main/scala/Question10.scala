object Question10 {
  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5,6)
    var f1 = (x:Int, y:Int) => x+y
    var f2 = (x:Int, y:Int) => x-y
    println(alternate(f1,f2,l))
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    def recur(l:List[Int], total:Int, isEven:Boolean): Int = {
      if (list.isEmpty) total
      else if (isEven) recur(list.tail, f1(total, list.head), !isEven)
      else recur(list.tail, f2(total, list.head), !isEven)
    }
    recur(list.tail, list.head, true)
  }
}
