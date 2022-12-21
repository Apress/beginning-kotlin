class Node<T>(val item:T) {    
  fun getLeaf() : T {          
    return item
  }
}

fun main(args: Array<String>) {
  val m = Node<Int>(1)            
  val n = Node(1)                 
  val o = Node<String>("World")   
}


