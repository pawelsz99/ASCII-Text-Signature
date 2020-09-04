import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = 0
    while (scanner.hasNext()) {
        val temp = scanner.nextInt()
        if (temp > max) max = temp
    }
    print(max)
}