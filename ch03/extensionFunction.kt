fun main(args: Array<String>) {
  val msg = "My name is Maximus Decimus Meridius"
  println(homerify(msg))
  println(chanthofy(msg))
  println(terminatorify(msg))

}

fun homerify(msg: String) = "$msg -- woohoo!"
fun chanthofy(msg: String) = "Chan, $msg , tho"
fun terminatorify(msg: String) = "$msg -- I'll be back"

