fun main(args: Array<String>) {
    val str = "This is Some Random TEXT!!"
    val name = "Angel"
    val surname = "Zambrano"
    println(str)

    println(str.toSomeCase())

    printName(name, surname)
}

fun printName(name: String, surname: String){
    println("My name is: $name $surname")
}

fun String.toSomeCase() : String{
    val ran = (0..99).random()

    return if (ran%2 == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}