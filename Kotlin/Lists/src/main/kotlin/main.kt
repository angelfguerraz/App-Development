fun main(args: Array<String>) {
    val nums = listOf(1,2,3,4,5)
    println("Unmutable list: $nums")

    val mutList = mutableListOf<Int>()
    println("Mutable list: $mutList")

    mutList.add(6)
    mutList.add(7)
    mutList.add(8)
    println("Mutable list: $mutList")
    println(mutList[0])

    println(nums.first())
    println(nums.first { n -> n%2==0 })

    mutList.removeIf { n -> n % 2 == 0 }
    println("Mutable list: $mutList")

    val a = arrayOf(1,2,3,4,5)
    println(a)
}