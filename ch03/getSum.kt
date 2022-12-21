fun main(args: Array<String>) {
  println(getSum(listOf(1,2,3,4,5,6)))
}

fun getSum(values: List<Int>) : Int { // return type is Int
  var total = 0;
  for (i in values)  total += i
  return total                        // return value
}


