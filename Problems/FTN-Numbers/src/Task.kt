import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()

    val fibo = intArrayOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val tria = intArrayOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val pow = intArrayOf(1, 10, 100, 1000, 10000, 100000)

    when (number) {
        in fibo -> print("F")
        in tria -> print("T")
        in pow -> print("P")
        else -> print("N")
    }
}

