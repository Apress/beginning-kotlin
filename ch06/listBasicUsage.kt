fun main(args: Array<String>) {

  val fruits = mutableListOf<String>("Apple")  
  fruits.add("Orange")       
  fruits.add(1, "Banana")    
  fruits.add("Guava")

  println(fruits)  // prints [Apple, Banana, Orange, Guava]

  fruits.remove("Guava")     
  fruits.removeAt(2)         

  println(fruits.first() == "Strawberries")  
  println(fruits.last() == "Banana")         

  println(fruits) //  prints [Apple, Banana]
}


