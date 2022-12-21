var foundGcf = false
var rem = 1
var a = 15
var b = 12

fun main() {
  while(!foundGcf) {
    rem = a % b
    if (rem !=  0) {
      a = b
      b = rem
    }
    else {
      foundGcf = true
    }
  }
  println(b)
}