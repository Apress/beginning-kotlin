fun main(args: Array<String>) {
  val john = Person("John Doe")
  john.say("Hello World")
}

class Person(val name : String) {
  fun say(message: String) = println("$name is saying $message")
}
