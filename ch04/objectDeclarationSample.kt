object Util {
  var name = ""
    set(value) {
      field = value
    }

  init {
    println("Initializing Util")
  }

  fun foo() = println(name)
}

fun main(args: Array<String>) {
  Util.name = "Bar"
  Util.foo() // prints "Bar"
}


