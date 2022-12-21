fun<T> manyParams(vararg va : T) {  
  for (i in va) {  
    println(i)
  }
}

fun main(args: Array<String>) {
  manyParams(1,2,3,4,5)  
  manyParams("From", "Gallifrey", "to", "Trenzalore")  
  manyParams(*args)  
  manyParams(*"Hello there".split(" ").toTypedArray()) 
}

