fun main(args: Array<String>) {
    // mapOf(K, V)

    val values = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3
    )
    println(values["a"])
    println(values)

    val values1 = mutableMapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )
    println(values1)

    values1.put(4, "d")
    println(values1[1])
    println(values1)
}
