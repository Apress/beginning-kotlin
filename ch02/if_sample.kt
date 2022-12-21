import java.util.*

fun main() {

  val theQuestion = "Doctor who"
  val answer = "Theta Sigma"
  val correctAnswer = ""

  if (answer == correctAnswer) {
    println("You are correct")
  }

  val d = Date()
  val c = Calendar.getInstance()
  val day = c.get(Calendar.DAY_OF_WEEK)

  if (day == 1) {
    println("Today is Sunday")
  }
  else if (day == 2) {
    println("Today is Monday")
  }
  else if ( day == 3) {
    println("Today is Tuesday")
  }


}

