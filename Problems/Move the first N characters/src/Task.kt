import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val s = scanner.next()
    val n = scanner.nextInt()

    if (n > s.length) print(s)
    else {
        print(s.substring(n))
        print(s.substring(0, n))
    }

}
