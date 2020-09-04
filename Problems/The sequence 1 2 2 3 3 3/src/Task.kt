import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var i = 0   //counts how many number already printed
    var x = 1
    var j = 0
    while (i <= n - 1) {
        if (j < x) {
            print("$x ")
            i++
            j++
        } else {
            j = 0
            x++
        }
    }
}