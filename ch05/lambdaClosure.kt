fun main(args: Array<String>) {
  executor(listOf(1..1000).flatten())  
}

fun executor(numbers:List<Int>) {
 var sum = 0;
 numbers.forEach {       
   if ( it % 2 == 0 ) {
     sum += it           
   }
 }
  println("Sum of all even numbers = $sum")
}
