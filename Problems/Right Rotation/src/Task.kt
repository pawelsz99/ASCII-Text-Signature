import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val n = scanner.nextInt()
    val array = IntArray(n) { scanner.nextInt() }
    val rotation = scanner.nextInt() % n

    for (i in 1..rotation) {
        var temp = array[0]

        for (x in 0 until n) {
            if (x < n - 1) {
                array[x + 1] = temp.also { temp = array[x + 1] }
            } else if (x == n - 1) {
                array[0] = temp
            }
        }
    }
    for (i in array) print("$i ")
}