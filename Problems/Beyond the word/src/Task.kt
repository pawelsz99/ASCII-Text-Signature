import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val word = input.next().toCharArray()

    for (x in 'a'..'z') {
        if (x in word) {
            continue
        } else {
            print(x)
        }
    }

}