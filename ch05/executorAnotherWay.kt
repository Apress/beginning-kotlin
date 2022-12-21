fun doThis() {  
  println ("action")
}

fun executor(action:() -> Unit) {
  action()
}

fun main(args: Array<String>) {
  executor(::doThis)  
}


