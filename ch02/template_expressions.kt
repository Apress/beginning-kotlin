fun main(args:Array<String>) {
  var name = "John Doe"

  println("Hello $name")
  println("The name '$name' is ${name.length} characters long")
  println("Hello ${foo()}")
}

fun foo(): String {
  return "Boo"
}

