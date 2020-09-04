import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()
    var counterOnce = 0

    for (element in word) {
        var i = 0
        for (x in 0 until word.length) {
            if (element == word[x]) i++

            if (i == 1 && x == word.length - 1) counterOnce++
        }
    }
    print(counterOnce)
}