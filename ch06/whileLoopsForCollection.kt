fun main() {
  val basket = listOf("apple", "banana", "orange")
  var iter = basket.iterator()
  while (iter.hasNext()) {
    println(iter.next())
  }

  for (i in basket) {
    println(i)
  }

}

