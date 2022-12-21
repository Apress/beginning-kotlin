import java.io.FileReader  

fun main(args: Array<String>) {

  var fileReader = FileReader("README.txt")  

  var content = fileReader.read()  
  println(content)

}


