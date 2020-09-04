import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val ships = IntArray(6) { input.nextInt() }
    // ship X,Y  ship1 [0][1]  ship2 [2][3]  ship3 [4][5]
    val rows = Array(5) { false }
    val columns = Array(5) { false }
    val battlefield = arrayOf(rows, columns)

    for (i in rows.indices){
        print(rows[i])
    }

    // placing ships in battlefield
    battlefield[ships[0]][ships[1]] = true
    battlefield[ships[2]][ships[3]] = true
    battlefield[ships[4]][ships[5]] = true


    for (y in battlefield.indices){
        for (x in battlefield.indices){
            print(battlefield[x][y])
        }
        println()

    }

    // checking for free columns
    for (x in 0..4) {
        for (y in 0..4) {
            if (battlefield[x][y]) break
            else if (y == 4) print("${x + 1} ")
        }
    }

    println()

    // checking for free rows
    for (y in 0..4) {
        for (x in 0..4) {
            if (battlefield[x][y]) break
            else if (x == 4) print("${y + 1} ")
        }
    }


}