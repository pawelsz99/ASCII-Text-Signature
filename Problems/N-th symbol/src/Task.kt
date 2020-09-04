import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val string = scanner.nextLine()
    val number = scanner.nextInt()

    println("Symbol # $number of the string \"$string\" is \'${string[number - 1]}\'")
}