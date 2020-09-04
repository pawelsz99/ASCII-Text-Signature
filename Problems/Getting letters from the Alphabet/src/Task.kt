import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val character = input.next().toCharArray().first()
    printAlphabet(character, 'a')

}

fun printAlphabet(character: Char, start: Char) {
    if (character > start) {
        print(start)
        printAlphabet(character, start + 1)
    }
}
