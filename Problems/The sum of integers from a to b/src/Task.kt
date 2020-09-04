import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    var sum = 0
    while (n1 <= n2) {
        sum += n1
        n1++
    }
    print(sum)
}
