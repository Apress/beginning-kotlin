


fun main(args: Array<String>) {

  val nums = mutableSetOf("one", "two")   
  nums.add("two")                         
  nums.add("two")                         
  nums.add("three")                       

  println(nums) // prints [one, two, three]

  val numbers = (1..1000).toMutableSet()  
  numbers.add(6)
  numbers.removeIf { i -> i % 2 == 0 }    

  println(numbers)

}