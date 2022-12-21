fun main(args:Array<String>) {
  var str = "the quick brown fox the quick brown fox jumped over"

  var words = str.split(" ")			//#1
  var unique = mutableMapOf<String, Int>()	//#2

  words.forEach {					//#3
    word -> if (unique.containsKey(word)) {	//#4
      var temp = unique[word]
      temp =+ 1
      unique[word] = temp				//#5
    }
    else {
      unique.put(word, 1)				//#6
    }
  }

  println(unique)					//#7
}


