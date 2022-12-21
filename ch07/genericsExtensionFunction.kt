fun <T> List<T>.getIt(index:Int): T {
  return this[index]
}

fun main(args: Array<String>) {

  val lfruits = listOf("Apples", "Bananas", "Oranges")
  val lnumbers = listOf(1,3,5)
  val lnumlist = (1..100).toList().filter { it % 5 == 0 }

  println(lnumlist.getIt(5))
  println(lfruits.getIt(1))
}

