fun main(args: Array<String>) {

  var dividend = Integer.parseInt(args[0])
  var divisor = Integer.parseInt(args[1])

  println("Quotient = ${divide(dividend, divisor)}");

}

fun divide(a:Int,b:Int): Int {
  return a/b
}


