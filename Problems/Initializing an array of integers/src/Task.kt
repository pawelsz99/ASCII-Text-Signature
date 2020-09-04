fun main(args: Array<String>) {
    val numbers = intArrayOf(12, 17, 8, 101, 33)

    numbers[0]= numbers[numbers.lastIndex].also { numbers[numbers.lastIndex] = numbers[0] }


    println(numbers.joinToString())
}