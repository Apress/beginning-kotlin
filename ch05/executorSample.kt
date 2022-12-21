val doThis:() -> Unit  = {  
  println("action")
}

fun executor(action:() -> Unit) {  
  action()  
  action.invoke()  
}

fun main(args: Array<String>) {
  executor(doThis)  
}
