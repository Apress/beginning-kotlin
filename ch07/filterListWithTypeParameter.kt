fun main(args: Array<String>) {
  val mlist = listOf(Programmer("Ted"), Tester("Steph"))     
  val mprogs = mlist.typeOf<Programmer>()                    

  mprogs.forEach {                                           
    println("${it.toString()} : ${it.javaClass.simpleName}")
  }
}

fun <T> List<*>.typeOf() : List<T> {                          

  val retlist = mutableListOf<T>()                            
  this.forEach {
    if (it is T) {                                            
      retlist.add(it)                                         
    }
  }
  return retlist                                              
}

open class Employee(val name:String) {
  override fun toString(): String {
    return name
  }
}
class Programmer(name:String) : Employee(name) {}
class Tester(name:String) : Employee(name) {}


