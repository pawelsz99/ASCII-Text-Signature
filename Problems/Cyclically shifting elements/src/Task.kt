import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val n = scanner.nextInt()
    val array = IntArray(n)

    for (i in 1 until n) {
        array[i] = scanner.nextInt()
    }
    array[0] = scanner.nextInt()

    for (i in array) print("$i ")

}