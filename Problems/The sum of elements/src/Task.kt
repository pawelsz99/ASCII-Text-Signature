import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum = 0
    while (scanner.hasNext()) {
        val temp = scanner.nextInt()
        sum += temp
        if (temp == 0) break
    }
    print(sum)
}