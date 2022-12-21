class Employee(var name: String) {

  infix operator  fun plus(emp: Employee) : Employee {
    this.name += "\n${emp.name}" //
    return this
  }
}


fun main() {
  var e1 = Employee("John Doe")
  var e2 = Employee("Jane Doe")

  var e3 = e1 plus e2
  println(e3)
}
