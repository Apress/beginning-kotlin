fun main(args:Array<String>) {
  var str = "the quick brown fox the quick brown fox jumped over"

  var words = str.split(" ")
  var unique: MutableMap<String, Int> = mutableMapOf<String, Int>()

  words.forEach {
    word -> if (unique.containsKey(word)) {
      var temp: Int? = unique[word]
      temp = temp?.plus(1)!!
      unique[word] = temp
    }
    else {
      unique.put(word, 1)
    }
  }
  println(unique)
}

