class Node<T:Number>(val item:T) {  
  fun getLeaf() : T {
    return item
  }
}

fun main(args: Array<String>) {
  val m = Node<Int>(1)            
  val n = Node(1.0F)              
  val o = Node<String>("World")   
  val p = Node(1.0)               
}


