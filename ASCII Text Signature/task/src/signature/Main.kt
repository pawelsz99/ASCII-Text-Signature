package signature

import java.io.File
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter name and surname: ")
    val firstName = scanner.next()
    val lastName = scanner.next()

    print("Enter person's status: ")
    var status = scanner.next()
    while (scanner.hasNext()) {
        status += scanner.nextLine()
    }


    //map for text to be print out
    val text = mutableListOf("", "", "", "", "",
            "", "", "", "", "",
            "", "", "", "", "")
    // 0 - Border,  1-10 - Name, 11-13 - Status, 14 - Border


    // importing smaller font

    val smallerFont = mutableMapOf(" " to listOf(
            "     ", "     ", "     ", "     "))
    // "letter" to width, 1.line, 2.line, 3.line

    val listSF = mutableListOf<String>()
    File("C://font/medium.txt").useLines { lines -> listSF.addAll(lines) }

    for (i in 1 until listSF.lastIndex step 4) {
        smallerFont[listSF[i].filter { it.isLetter() }] = listOf(       // letter
                listSF[i].filter { it.isDigit() },                      // width
                listSF[i + 1],                                          // 1.line
                listSF[i + 2],                                          // 2.line
                listSF[i + 3])                                          // 3.line
    }


    // importing fancy font

    val fancyFont = mutableMapOf("test" to listOf(
            "testWidth", "test1", "test2", "test3"))
    // "letter" to width, 1.line, 2.line, 3.line.... 10.line

    val listFF = mutableListOf<String>()
    File("C://font/roman.txt").useLines { lines -> listFF.addAll(lines) }

    for (i in 1 until listFF.lastIndex step 11) {
        fancyFont[listFF[i].filter { it.isLetter() }] = listOf(       // letter
                listFF[i].filter { it.isDigit() },                    // width
                listFF[i + 1],                                        // 1.line
                listFF[i + 2],                                        // 2.line
                listFF[i + 3],                                        // 3.line
                listFF[i + 4],                                        // 4.line
                listFF[i + 5],                                        // 5.line
                listFF[i + 6],                                        // 6.line
                listFF[i + 7],                                        // 7.line
                listFF[i + 8],                                        // 8.line
                listFF[i + 9],                                        // 9.line
                listFF[i + 10])                                       // 10.line
    }

    // writing name with font

    for (i in 1..10) {  // line in text loop
        text[i] += "88  "   // start border
        for (x in firstName) {  // char in name loop
            text[i] += fancyFont[x.toString()]?.get(i).toString()
        }
        text[i] += "          "  // add 10 spaces between first and last name
        for (x in lastName) {  // char in name loop
            text[i] += fancyFont[x.toString()]?.get(i).toString()
        }
        text[i] += "  88"   // end border
        // println(text[i])
    }


    // writing status with font

    for (i in 11..13) {  // line in text loop
        text[i] += "88  "   // start border
        for (x in status) {  // char in status loop
            text[i] += smallerFont[x.toString()]?.get(i - 10).toString()
        }
        text[i] += "  88"   // end border
    }


    // making equal name and status length

    if (text[1].length > text[11].length) {   // name > status
        while (text[1].length - 1 > text[11].length) {
            for (i in 11..13) {
                text[i] = text[i].insertAt(" ", text[i].lastIndex - 2)
                text[i] = text[i].insertAt(" ", 2)
            }
        }
        if (text[1].length > text[11].length) {
            for (i in 11..13) {
                text[i] = text[i].insertAt(" ", text[i].lastIndex - 2)
            }
        }
    } else if (text[1].length < text[11].length) {   // name < status
        while (text[1].length < text[11].length - 1) {
            for (i in 1..10) {
                text[i] = text[i].insertAt(" ", text[i].lastIndex - 2)
                text[i] = text[i].insertAt(" ", 2)
            }
        }
        if (text[1].length < text[11].length) {
            for (i in 1..10) {
                text[i] = text[i].insertAt(" ", text[i].lastIndex - 2)
            }
        }
    }

    // upper and lower border

    while (text[0].length < text[1].length) text[0] += "8"
    while (text[14].length < text[1].length) text[14] += "8"


    // print the solution

    for (i in 0..14) {
        println(text[i])
    }

}


fun String.insertAt(newText: String, index: Int): String {

    var result = ""

    for (i in 0 until this.length) {

        if (i == index) {

            result += newText
        }

        result += this[i]
    }

    return result
}
