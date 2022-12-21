fun bigSmall(a: Int, b:Int) : Pair<Int, Int> {  

  if(a > b) return Pair(a,b)  
  else {
    return Pair(b,a)  
  }
}

fun main(args: Array<String>) {
  var (x,y) = bigSmall(5,3)  

  println(x)
  println(y)
}


