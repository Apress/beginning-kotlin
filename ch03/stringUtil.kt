fun main(args: Array<String>) {
  val msg = "My name is Maximus Decimus Meridius"

  val util = StringUtil()
  println(util.homerify(msg)) 
  println(util.chanthofy(msg))
  println(util.terminatorify(msg))
}

/*
  The StringUtil class consolidates our 3 methods as member functions.
  This is a very common Java practice
*/
class StringUtil {
  fun homerify(msg: String) = "$msg -- woohoo!"
  fun chanthofy(msg:String) = "Chan, $msg , tho"
  fun terminatorify(msg: String) = "$msg -- I'll be back"
}

