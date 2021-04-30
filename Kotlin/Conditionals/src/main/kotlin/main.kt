fun main(args: Array<String>) {
    println("Hello World!")

    val name = "Angel"

    if (name.isNotEmpty()) {
        println("Name has ${name.length} words")
    } else {
        println("Error! Empty Variable...")
    }

    val msg : String = if (name.length > 4){
        "$name Long name"
    } else if (name.isEmpty()){
        "Empty name"
    } else {
        "$name short name"
    }
    println(msg)

    val color = "red"
    when (color) {
        "Yellow", "yellow" -> println("I'm $color")
        "Red", "red" -> println("I'm $color")
        else -> println("Error wrong color")
    }

    val code = 199
    when (code) {
        in 200..299 -> println("Code number: $code")
        in 400..500 -> println("Code number: $code")
        else -> println("Some error detected!")
    }

    val grade = 5
    val n = when (grade) {
        5 -> println("Not approved")
        1 -> println("approved")
        else -> "No info"
    }
}