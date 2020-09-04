import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val str = scanner.next()

    if (str.length % 2 == 0) {
        print(str.removeRange(str.length / 2 - 1, str.length / 2 + 1))
    } else {
        print(str.removeRange(str.length / 2, str.length / 2 + 1))
    }
}