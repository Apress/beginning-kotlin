
data class Event(val title:String) {
  var date = Date()
  var time = ""
  var attendees = mutableListOf<String>()

  fun create() {
    print(this)
  }
}

 fun main(args: Array<String>) {

  val mtg = Event("Management meeting")

  mtg.apply {             
    date = Date()         
    time = "0900H"
    attendees.add("Ted")
  }.create()              
}
