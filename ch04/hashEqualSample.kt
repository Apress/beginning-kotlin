import java.util.*

class Employee(val name:String){
  override fun equals(obj:Any?):Boolean {  
    var retval = false
    if(obj is Employee) {  
      retval  = name == obj.name  
    }
    return retval
  }
  override fun hashCode(): Int {  
    return Objects.hash(name)
  }
}

fun main(args: Array<String>) {

  val e1 = Employee("John Doe")
  val e2 = Employee("John Doe")

  println(e1)           
  println(e1 == e2)     
}


