fun main(args: Array<String>) {

  var emptyArray = arrayOfNulls<String>(2)
  emptyArray[0] = "Hello"
  emptyArray[1] = "World"

  for (i in emptyArray.indices) println(emptyArray[i])

  for (i in emptyArray) println(i)

  var arrayOfInts = arrayOf(1,2,3,4,5,6)
  arrayOfInts.forEach { e -> println(e) }

  var arrayWords = "The quick brown fox".split(" ").toTypedArray()
  arrayWords.forEach { item -> println(item) }

}

