import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val numbers = Array(n) { scanner.nextInt() }
    var max = 0

    for (i in numbers) {
        if (i > max) max = i
    }

    print(numbers.indexOf(max))
}