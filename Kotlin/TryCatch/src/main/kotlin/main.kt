fun main(args: Array<String>) {
    var name : String? = null
    // Elvis operator ?: returns the given default value
    val lenName : Int = name?.length ?: 0
    println(lenName)
    /*try {
        throw NullPointerException("Error found")
    } catch (e : NullPointerException) {
        println("Error found!")
    } finally {
        println("Exiting...")
    }*/
}