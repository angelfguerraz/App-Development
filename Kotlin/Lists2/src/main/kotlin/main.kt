fun main(args: Array<String>) {

    val lottoNums = listOf(23, 56, 12, 26, 19, 45)

    println(lottoNums)
    println(lottoNums.reversed())
    println(lottoNums.shuffled())
    println(lottoNums.sorted())
    println(lottoNums.sortedDescending())

    val conditionedSort = lottoNums.sortedBy { n -> n < 50 }
    println(conditionedSort)

    // Map:
    println(lottoNums.map { n -> "${lottoNums.indexOf(n)} This is the Lotto-number: $n" })

    // Filter:
    println(lottoNums.filter { n -> n%5==0 })
}