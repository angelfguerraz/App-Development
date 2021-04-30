fun main(args: Array<String>) {

    // While
    var counter = (0..10).random()
    println("Start: $counter")
    while(counter >= 0){
        println("Counter value: $counter")
        counter--
    }

    //For
    val fruits = listOf("Apple", "Pear", "Cherry", "Pineapple")
    for (f in fruits) {
        println("List: $f")
    }
}