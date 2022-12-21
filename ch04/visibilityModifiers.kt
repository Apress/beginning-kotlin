internal open class Foo {
  internal fun boo() = println("boo")
  internal fun doo() = println("doo")
}

internal fun Foo.bar() {
  boo()
  doo()
}

fun main(args: Array<String>) {
  var fu = Foo()
  fu.bar()
}





