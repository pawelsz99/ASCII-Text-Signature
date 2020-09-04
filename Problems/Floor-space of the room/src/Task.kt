import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.next()) {
        "triangle" -> triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
        "rectangle" -> rectangle(scanner.nextDouble(), scanner.nextDouble())
        "circle" -> circle(scanner.nextDouble())
    }

}

fun circle(c: Double) = println(3.14 * c * c)

fun rectangle(a: Double, b: Double) = println(a * b)

fun triangle(a: Double, b: Double, c: Double) {
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    println(area)
}
