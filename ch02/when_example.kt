fun main(args: Array<String>) {

  print("What is the answer to life? ")
  var response:Int? = readLine()?.toInt()

  val message = when(response){
    42 -> "So long, and thanks for the all fish"
    43, 44, 45 -> "either 43,44 or 45"
    in 46 .. 100 ->  "forty six to one hundred"
    else -> "Not what I'm looking for"
  }

  println(message)
}

