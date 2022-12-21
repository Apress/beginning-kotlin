fun main(args: Array<String>) {
  executor({ println("Hello $it") })
}

fun executor(display:(msg:String) -> Unit) {
  display("World")
}


