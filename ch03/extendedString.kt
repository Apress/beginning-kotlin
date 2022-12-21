fun main(args: Array<String>) {
  val msg = "My name is Maximus Decimus Meridius"

  println(msg.homerify())
  println(msg.chanthofy())
  println(msg.terminatorify())

}

fun String.homerify() = "$this -- woohoo!"
fun String.chanthofy() = "Chan, $this , tho"
fun String.terminatorify() = "$this -- I'll be back"


