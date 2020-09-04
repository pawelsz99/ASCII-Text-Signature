import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val str = scanner.next()

    for (element in str) {
        repeat(2) { print(element) }
    }

}