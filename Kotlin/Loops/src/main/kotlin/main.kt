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
    val nums = listOf(1,2,3,4,5)
    for (f in fruits) {
        println(" ${fruits.indexOf(f)} Fruit: $f")
    }

    nums.forEach { n -> println("Number: $n") }

    val mapN = nums.map { n -> n*5 }
    println("$mapN")

    val filterN = nums.filter { n -> n%2 != 0 }
    print("$filterN")

}