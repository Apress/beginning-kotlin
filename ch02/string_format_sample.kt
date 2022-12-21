

fun main() {

  var name = "John Doe"
  var email = "john.doe@gmail.com"
  var phone = "(01)777-1234"

  var concat = String.format("name: %s | email: %s | phone: %s", name, email, phone)
  println(concat)
// prints
// name: John Doe | email: john.doe@gmail.com | phone: (01)777-1234

}

