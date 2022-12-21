class Employee {
  var name: String = ""    
    get() {   
      Log("Getting lastname")  
      return field   
    }
    set(value) {   
      Log("Setting value of lastname")
      field = value  
    }
}

fun Log(msg:String) {
  println(msg)
}

fun main(args: Array<String>) {
  var emp = Employee()
  emp.name = "John Doe"   
  println(emp.name)  
}

