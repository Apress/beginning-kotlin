val dict = hashMapOf("foo" to 1)   
dict["bar"] = 2                    

val snapshot: MutableMap<String, Int> = dict  
snapshot["baz"] = 3                           

println(snapshot)                  
println(dict)                      
println(snapshot["bar"]) // prints 2    


