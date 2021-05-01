fun main(args: Array<String>) {
    val myLambda : (String) -> Int = {
        str -> str.length
    }
    // prints function
    println(myLambda)

    //prints result
    println(myLambda("AFGZB"))

    val myList = listOf<String>("Hola", "Hi", "Ciao")
    println(myList.map { str -> myLambda(str) })

    // High order function
    val lenVal1 = superFunction(s1 = "Hello my name is Angel", block = {
        str -> str.length
    })

    println(lenVal1)

    val lambda: () -> String = superLambda(name = "Angel")
    val valueLambda = lambda()
    println(lambda) // return function
    println(valueLambda)    // returns value of a function
}

// High order function
fun superFunction (s1 : String, block : (String) -> Int) : Int {
    return block(s1)
}

// returns a function
fun superLambda (name : String) : () -> String {
    return {
        "Super lambda returns $name"
    }
}