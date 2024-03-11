object Question09 {
  def main(args: Array[String]): Unit = {
    var tape = List('a','b','c','d')
    var f = (char: Char) => char.toUpper
    println(turingStep(f, tape, 0))
    println(turingStep(f, tape, 1))
    println(turingStep(f, tape, 2))
    println(turingStep(f, tape, 3))
    println(turingStep(f, tape, 4))
    println(turingStep(f, tape, 5))
  }
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if(n == 0 || tape.isEmpty) tape
    else f(tape.head) :: turingStep(f, tape.tail, n-1)
  }
}
