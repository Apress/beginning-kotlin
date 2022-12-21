data class Employee(val name:String)  

fun main(args: Array<String>) {
  val e1 = Employee("John Doe")
  val e2 = Employee("John Doe")

  println(e1)        
  println(e1 == e2)  
}


