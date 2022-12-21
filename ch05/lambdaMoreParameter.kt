fun main(args: Array<String>) {
  doer({ x,y -> println(x + y) })
}

fun doer(sum:(x:Int,y:Int) -> Unit) {
  sum(1,2)
}


