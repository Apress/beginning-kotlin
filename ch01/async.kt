

import kotlinx.coroutines.*

suspend fun main() {                                // #1
  val start = System.currentTimeMillis()
  coroutineScope {                                // #2
    for (i in 1..10) {
      launch {                                // #3
        delay(3000L - i * 300)              // #4
        log(start, "Countdown: $i")
      }
    }
  }
  // #5

  log(start, "Liftoff!")
}

fun log(start: Long, msg: String) {
  println("$msg " +
      "(on ${Thread.currentThread().name}) " +
      "after ${(System.currentTimeMillis() - start)/1000F}s")
}


