package AdventOfCode

fun main() {
    val info: List<Pair<String, Int>> = depthInput()

    println(day2Puzzle1(info))



}

fun day2Puzzle1(info: List<Pair<String, Int>>): Int {
    // horizontal position and depth both start at 0.
    // horizontal = 0 -> changes with forward
    // depth = 0 -> changes with up (decrease) and down (increase)
    // multiply horizontal and depth -> answer

    // TO DO:
    // filter forward
    // add value, horizontal total (sum)
    val hor = info
        .filter { it.first == "forward" }
        .sumOf { it.second } // works :D
    // filter forward out
    // add value (down = increase, up = decrease), depth total
    val depth = info
        .filter { it.first == "down" }
        .sumOf { it.second }
        .minus(
            info
                .filter { it.first == "up" }
                .sumOf { it.second }
        )

    return hor.times(depth)

    // possible in 1 line
//    return (info
//        .filter { it.first == "forward" }
//        .sumOf { it.second }.times(
//            info
//                .filter { it.first == "down" }
//                .sumOf { it.second }
//                .minus(
//                    info
//                        .filter { it.first == "up" }
//                        .sumOf { it.second }
//                )
//        )
//    )
}

fun testInput(): List<Pair<String, Int>> {
    return listOf(
        Pair("forward", 5),
        Pair("down", 5),
        Pair("forward", 8),
        Pair("up", 3),
        Pair("down", 8),
        Pair("forward", 2)
    )
}

fun depthInput(): List<Pair<String, Int>> {
    return listOf(
        Pair("forward", 9),
        Pair("forward", 7),
        Pair("down", 7),
        Pair("down", 3),
        Pair("forward", 2),
        Pair("forward", 3),
        Pair("forward", 7),
        Pair("down", 6),
        Pair("forward", 7),
        Pair("down", 7),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("up", 2),
        Pair("down", 5),
        Pair("up", 1),
        Pair("forward", 5),
        Pair("forward", 6),
        Pair("up", 4),
        Pair("down", 3),
        Pair("down", 4),
        Pair("down", 5),
        Pair("up", 6),
        Pair("down", 3),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("down", 4),
        Pair("forward", 5),
        Pair("down", 2),
        Pair("up", 1),
        Pair("up", 8),
        Pair("down", 1),
        Pair("down", 6),
        Pair("forward", 8),
        Pair("down", 4),
        Pair("forward", 8),
        Pair("forward", 6),
        Pair("forward", 2),
        Pair("forward", 2),
        Pair("forward", 3),
        Pair("forward", 8),
        Pair("up", 9),
        Pair("up", 2),
        Pair("down", 3),
        Pair("up", 3),
        Pair("forward", 5),
        Pair("forward", 2),
        Pair("up", 5),
        Pair("forward", 9),
        Pair("down", 7),
        Pair("down", 2),
        Pair("up", 7),
        Pair("down", 4),
        Pair("down", 6),
        Pair("up", 2),
        Pair("down", 9),
        Pair("forward", 7),
        Pair("down", 8),
        Pair("forward", 6),
        Pair("up", 1),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("down", 5),
        Pair("forward", 6),
        Pair("down", 8),
        Pair("down", 3),
        Pair("forward", 7),
        Pair("down", 8),
        Pair("up", 7),
        Pair("down", 1),
        Pair("up", 1),
        Pair("forward", 9),
        Pair("down", 7),
        Pair("up", 3),
        Pair("down", 6),
        Pair("down", 6),
        Pair("down", 6),
        Pair("down", 7),
        Pair("down", 9),
        Pair("down", 6),
        Pair("down", 9),
        Pair("down", 8),
        Pair("down", 3),
        Pair("down", 7),
        Pair("down", 3),
        Pair("up", 8),
        Pair("down", 5),
        Pair("down", 9),
        Pair("up", 4),
        Pair("forward", 5),
        Pair("forward", 5),
        Pair("forward", 2),
        Pair("up", 1),
        Pair("forward", 6),
        Pair("down", 6),
        Pair("down", 2),
        Pair("forward", 1),
        Pair("forward", 8),
        Pair("down", 4),
        Pair("down", 1),
        Pair("down", 8),
        Pair("down", 7),
        Pair("forward", 6),
        Pair("forward", 8),
        Pair("down", 8),
        Pair("up", 1),
        Pair("up", 1),
        Pair("forward", 1),
        Pair("forward", 3),
        Pair("up", 8),
        Pair("down", 1),
        Pair("forward", 4),
        Pair("down", 3),
        Pair("forward", 3),
        Pair("forward", 4),
        Pair("forward", 3),
        Pair("down", 3),
        Pair("down", 9),
        Pair("down", 3),
        Pair("up", 6),
        Pair("forward", 6),
        Pair("forward", 8),
        Pair("forward", 2),
        Pair("up", 1),
        Pair("up", 4),
        Pair("up", 4),
        Pair("down", 2),
        Pair("down", 2),
        Pair("down", 2),
        Pair("forward", 7),
        Pair("up", 9),
        Pair("down", 9),
        Pair("up", 1),
        Pair("down", 5),
        Pair("forward", 4),
        Pair("down", 2),
        Pair("down", 4),
        Pair("forward", 3),
        Pair("down", 7),
        Pair("down", 9),
        Pair("forward", 1),
        Pair("up", 5),
        Pair("down", 5),
        Pair("down", 5),
        Pair("forward", 2),
        Pair("down", 6),
        Pair("forward", 8),
        Pair("up", 4),
        Pair("forward", 6),
        Pair("up", 1),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("down", 9),
        Pair("forward", 5),
        Pair("down", 7),
        Pair("down", 8),
        Pair("down", 9),
        Pair("forward", 6),
        Pair("up", 6),
        Pair("forward", 9),
        Pair("forward", 9),
        Pair("down", 7),
        Pair("forward", 7),
        Pair("forward", 5),
        Pair("up", 9),
        Pair("forward", 3),
        Pair("down", 9),
        Pair("down", 1),
        Pair("down", 8),
        Pair("down", 4),
        Pair("forward", 5),
        Pair("forward", 6),
        Pair("forward", 8),
        Pair("forward", 8),
        Pair("down", 4),
        Pair("down", 3),
        Pair("down", 8),
        Pair("forward", 3),
        Pair("down", 6),
        Pair("down", 8),
        Pair("down", 2),
        Pair("up", 8),
        Pair("up", 9),
        Pair("down", 6),
        Pair("forward", 3),
        Pair("down", 4),
        Pair("down", 6),
        Pair("forward", 9),
        Pair("forward", 6),
        Pair("up", 2),
        Pair("down", 8),
        Pair("forward", 2),
        Pair("down", 7),
        Pair("forward", 9),
        Pair("up", 9),
        Pair("down", 9),
        Pair("down", 2),
        Pair("forward", 9),
        Pair("down", 4),
        Pair("down", 9),
        Pair("up", 4),
        Pair("forward", 6),
        Pair("down", 2),
        Pair("down", 9),
        Pair("forward", 8),
        Pair("forward", 2),
        Pair("up", 8),
        Pair("forward", 9),
        Pair("forward", 2),
        Pair("forward", 3),
        Pair("down", 2),
        Pair("up", 3),
        Pair("forward", 9),
        Pair("down", 6),
        Pair("down", 3),
        Pair("down", 1),
        Pair("forward", 9),
        Pair("forward", 8),
        Pair("down", 9),
        Pair("up", 7),
        Pair("down", 8),
        Pair("up", 7),
        Pair("forward", 1),
        Pair("forward", 1),
        Pair("forward", 7),
        Pair("down", 2),
        Pair("down", 1),
        Pair("up", 1),
        Pair("up", 6),
        Pair("down", 5),
        Pair("up", 9),
        Pair("up", 7),
        Pair("forward", 1),
        Pair("forward", 6),
        Pair("forward", 1),
        Pair("up", 4),
        Pair("down", 6),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("down", 2),
        Pair("up", 8),
        Pair("forward", 9),
        Pair("forward", 6),
        Pair("forward", 3),
        Pair("forward", 8),
        Pair("down", 1),
        Pair("forward", 8),
        Pair("up", 3),
        Pair("forward", 1),
        Pair("forward", 1),
        Pair("up", 9),
        Pair("down", 1),
        Pair("down", 8),
        Pair("down", 2),
        Pair("forward", 8),
        Pair("down", 8),
        Pair("forward", 7),
        Pair("down", 5),
        Pair("forward", 8),
        Pair("forward", 3),
        Pair("forward", 6),
        Pair("forward", 7),
        Pair("up", 5),
        Pair("down", 5),
        Pair("forward", 8),
        Pair("down", 2),
        Pair("forward", 3),
        Pair("down", 4),
        Pair("down", 9),
        Pair("forward", 6),
        Pair("forward", 5),
        Pair("up", 4),
        Pair("forward", 7),
        Pair("down", 3),
        Pair("forward", 9),
        Pair("forward", 5),
        Pair("down", 3),
        Pair("up", 5),
        Pair("forward", 4),
        Pair("forward", 8),
        Pair("down", 7),
        Pair("up", 2),
        Pair("forward", 7),
        Pair("down", 5),
        Pair("up", 2),
        Pair("down", 9),
        Pair("forward", 4),
        Pair("down", 3),
        Pair("forward", 5),
        Pair("forward", 4),
        Pair("down", 3),
        Pair("forward", 6),
        Pair("up", 1),
        Pair("forward", 8),
        Pair("down", 1),
        Pair("up", 7),
        Pair("forward", 8),
        Pair("up", 1),
        Pair("up", 1),
        Pair("forward", 2),
        Pair("down", 8),
        Pair("forward", 4),
        Pair("forward", 8),
        Pair("up", 6),
        Pair("forward", 5),
        Pair("forward", 7),
        Pair("up", 6),
        Pair("up", 4),
        Pair("up", 6),
        Pair("down", 1),
        Pair("forward", 3),
        Pair("down", 1),
        Pair("down", 1),
        Pair("down", 8),
        Pair("forward", 8),
        Pair("down", 5),
        Pair("down", 5),
        Pair("forward", 5),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("forward", 7),
        Pair("down", 3),
        Pair("down", 5),
        Pair("forward", 6),
        Pair("down", 1),
        Pair("down", 5),
        Pair("up", 8),
        Pair("down", 9),
        Pair("forward", 3),
        Pair("down", 6),
        Pair("up", 2),
        Pair("down", 2),
        Pair("forward", 2),
        Pair("up", 2),
        Pair("forward", 8),
        Pair("down", 2),
        Pair("forward", 9),
        Pair("forward", 2),
        Pair("down", 7),
        Pair("down", 5),
        Pair("forward", 1),
        Pair("forward", 7),
        Pair("up", 6),
        Pair("up", 8),
        Pair("forward", 8),
        Pair("forward", 8),
        Pair("up", 3),
        Pair("forward", 8),
        Pair("down", 6),
        Pair("down", 6),
        Pair("forward", 4),
        Pair("down", 8),
        Pair("down", 5),
        Pair("down", 7),
        Pair("forward", 1),
        Pair("forward", 9),
        Pair("forward", 9),
        Pair("up", 5),
        Pair("down", 9),
        Pair("down", 1),
        Pair("forward", 4),
        Pair("forward", 1),
        Pair("up", 9),
        Pair("forward", 6),
        Pair("down", 6),
        Pair("forward", 2),
        Pair("up", 6),
        Pair("forward", 9),
        Pair("up", 1),
        Pair("down", 2),
        Pair("up", 3),
        Pair("forward", 2),
        Pair("forward", 1),
        Pair("forward", 6),
        Pair("down", 9),
        Pair("up", 1),
        Pair("forward", 7),
        Pair("up", 3),
        Pair("forward", 6),
        Pair("forward", 6),
        Pair("up", 2),
        Pair("down", 8),
        Pair("forward", 4),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("forward", 2),
        Pair("down", 4),
        Pair("down", 7),
        Pair("down", 4),
        Pair("down", 5),
        Pair("forward", 3),
        Pair("down", 1),
        Pair("forward", 1),
        Pair("forward", 8),
        Pair("down", 7),
        Pair("up", 1),
        Pair("forward", 7),
        Pair("forward", 2),
        Pair("down", 9),
        Pair("down", 2),
        Pair("up", 2),
        Pair("forward", 3),
        Pair("down", 4),
        Pair("down", 7),
        Pair("down", 8),
        Pair("forward", 4),
        Pair("forward", 5),
        Pair("forward", 3),
        Pair("up", 3),
        Pair("down", 6),
        Pair("forward", 4),
        Pair("forward", 4),
        Pair("forward", 8),
        Pair("forward", 1),
        Pair("up", 2),
        Pair("up", 3),
        Pair("down", 4),
        Pair("up", 9),
        Pair("forward", 1),
        Pair("forward", 1),
        Pair("forward", 9),
        Pair("down", 2),
        Pair("down", 5),
        Pair("up", 9),
        Pair("down", 7),
        Pair("down", 9),
        Pair("down", 2),
        Pair("down", 4),
        Pair("forward", 1),
        Pair("forward", 1),
        Pair("forward", 8),
        Pair("down", 9),
        Pair("down", 6),
        Pair("forward", 2),
        Pair("up", 3),
        Pair("down", 8),
        Pair("forward", 1),
        Pair("forward", 8),
        Pair("forward", 4),
        Pair("up", 7),
        Pair("forward", 5),
        Pair("forward", 2),
        Pair("forward", 2),
        Pair("up", 8),
        Pair("down", 5),
        Pair("forward", 6),
        Pair("down", 3),
        Pair("up", 5),
        Pair("forward", 8),
        Pair("forward", 3),
        Pair("forward", 9),
        Pair("down", 1),
        Pair("down", 3),
        Pair("forward", 8),
        Pair("down", 2),
        Pair("forward", 6),
        Pair("forward", 2),
        Pair("down", 3),
        Pair("down", 3),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("forward", 7),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("up", 4),
        Pair("up", 6),
        Pair("forward", 9),
        Pair("down", 3),
        Pair("down", 3),
        Pair("up", 7),
        Pair("down", 4),
        Pair("up", 3),
        Pair("up", 3),
        Pair("down", 5),
        Pair("forward", 1),
        Pair("up", 3),
        Pair("down", 1),
        Pair("forward", 2),
        Pair("up", 9),
        Pair("forward", 7),
        Pair("down", 6),
        Pair("forward", 4),
        Pair("forward", 8),
        Pair("up", 1),
        Pair("forward", 6),
        Pair("down", 7),
        Pair("down", 4),
        Pair("up", 9),
        Pair("forward", 4),
        Pair("down", 7),
        Pair("up", 1),
        Pair("forward", 9),
        Pair("down", 4),
        Pair("down", 7),
        Pair("forward", 1),
        Pair("down", 6),
        Pair("down", 6),
        Pair("forward", 3),
        Pair("up", 8),
        Pair("forward", 3),
        Pair("down", 1),
        Pair("down", 5),
        Pair("down", 8),
        Pair("forward", 2),
        Pair("up", 5),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("forward", 5),
        Pair("forward", 1),
        Pair("forward", 3),
        Pair("forward", 4),
        Pair("forward", 5),
        Pair("up", 1),
        Pair("forward", 9),
        Pair("down", 5),
        Pair("down", 7),
        Pair("up", 9),
        Pair("down", 9),
        Pair("forward", 7),
        Pair("up", 6),
        Pair("up", 7),
        Pair("forward", 2),
        Pair("forward", 1),
        Pair("up", 4),
        Pair("forward", 6),
        Pair("forward", 9),
        Pair("down", 1),
        Pair("forward", 4),
        Pair("down", 5),
        Pair("forward", 4),
        Pair("down", 3),
        Pair("down", 5),
        Pair("forward", 6),
        Pair("forward", 3),
        Pair("down", 3),
        Pair("down", 8),
        Pair("down", 2),
        Pair("down", 4),
        Pair("down", 6),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("up", 9),
        Pair("down", 3),
        Pair("forward", 1),
        Pair("forward", 9),
        Pair("forward", 5),
        Pair("forward", 5),
        Pair("forward", 9),
        Pair("up", 1),
        Pair("down", 4),
        Pair("down", 4),
        Pair("up", 7),
        Pair("down", 3),
        Pair("up", 3),
        Pair("up", 4),
        Pair("forward", 3),
        Pair("forward", 1),
        Pair("forward", 8),
        Pair("up", 6),
        Pair("down", 8),
        Pair("down", 4),
        Pair("forward", 7),
        Pair("forward", 9),
        Pair("forward", 2),
        Pair("forward", 8),
        Pair("up", 2),
        Pair("down", 4),
        Pair("down", 5),
        Pair("forward", 9),
        Pair("down", 6),
        Pair("down", 7),
        Pair("down", 8),
        Pair("up", 8),
        Pair("forward", 3),
        Pair("forward", 7),
        Pair("forward", 8),
        Pair("up", 2),
        Pair("down", 9),
        Pair("down", 6),
        Pair("forward", 3),
        Pair("forward", 4),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("up", 6),
        Pair("forward", 1),
        Pair("forward", 7),
        Pair("down", 2),
        Pair("down", 1),
        Pair("forward", 2),
        Pair("forward", 2),
        Pair("down", 2),
        Pair("forward", 2),
        Pair("forward", 7),
        Pair("up", 4),
        Pair("down", 3),
        Pair("forward", 9),
        Pair("down", 7),
        Pair("down", 7),
        Pair("down", 6),
        Pair("forward", 3),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("forward", 2),
        Pair("down", 5),
        Pair("down", 4),
        Pair("down", 9),
        Pair("up", 9),
        Pair("down", 6),
        Pair("down", 8),
        Pair("down", 1),
        Pair("forward", 8),
        Pair("up", 4),
        Pair("up", 4),
        Pair("down", 8),
        Pair("forward", 6),
        Pair("down", 2),
        Pair("forward", 4),
        Pair("forward", 3),
        Pair("forward", 2),
        Pair("forward", 4),
        Pair("down", 4),
        Pair("forward", 6),
        Pair("down", 9),
        Pair("up", 7),
        Pair("up", 5),
        Pair("down", 7),
        Pair("down", 4),
        Pair("up", 3),
        Pair("forward", 4),
        Pair("down", 9),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("forward", 4),
        Pair("down", 9),
        Pair("forward", 3),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("forward", 3),
        Pair("down", 1),
        Pair("down", 3),
        Pair("up", 5),
        Pair("down", 8),
        Pair("down", 3),
        Pair("down", 4),
        Pair("forward", 7),
        Pair("forward", 9),
        Pair("up", 2),
        Pair("forward", 3),
        Pair("up", 4),
        Pair("down", 5),
        Pair("up", 3),
        Pair("up", 9),
        Pair("down", 6),
        Pair("down", 2),
        Pair("down", 5),
        Pair("up", 4),
        Pair("up", 6),
        Pair("forward", 4),
        Pair("forward", 6),
        Pair("up", 5),
        Pair("up", 5),
        Pair("forward", 8),
        Pair("down", 6),
        Pair("forward", 6),
        Pair("down", 7),
        Pair("down", 5),
        Pair("down", 3),
        Pair("down", 8),
        Pair("forward", 6),
        Pair("forward", 9),
        Pair("forward", 9),
        Pair("up", 9),
        Pair("down", 3),
        Pair("up", 5),
        Pair("forward", 4),
        Pair("down", 7),
        Pair("forward", 5),
        Pair("down", 7),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("forward", 9),
        Pair("down", 8),
        Pair("up", 3),
        Pair("up", 7),
        Pair("down", 7),
        Pair("up", 7),
        Pair("forward", 3),
        Pair("down", 2),
        Pair("forward", 7),
        Pair("down", 4),
        Pair("forward", 1),
        Pair("down", 6),
        Pair("forward", 1),
        Pair("up", 4),
        Pair("down", 7),
        Pair("up", 3),
        Pair("forward", 7),
        Pair("forward", 5),
        Pair("forward", 7),
        Pair("forward", 6),
        Pair("up", 2),
        Pair("down", 4),
        Pair("down", 8),
        Pair("down", 4),
        Pair("up", 3),
        Pair("forward", 3),
        Pair("up", 3),
        Pair("up", 3),
        Pair("down", 7),
        Pair("down", 2),
        Pair("down", 3),
        Pair("forward", 7),
        Pair("down", 6),
        Pair("down", 9),
        Pair("up", 1),
        Pair("down", 8),
        Pair("down", 6),
        Pair("down", 3),
        Pair("up", 2),
        Pair("up", 6),
        Pair("forward", 9),
        Pair("forward", 5),
        Pair("forward", 4),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("down", 4),
        Pair("down", 8),
        Pair("up", 2),
        Pair("forward", 6),
        Pair("up", 6),
        Pair("up", 4),
        Pair("down", 2),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("up", 3),
        Pair("down", 6),
        Pair("forward", 5),
        Pair("forward", 3),
        Pair("up", 4),
        Pair("down", 7),
        Pair("down", 2),
        Pair("down", 6),
        Pair("up", 7),
        Pair("forward", 2),
        Pair("forward", 1),
        Pair("forward", 3),
        Pair("down", 2),
        Pair("forward", 1),
        Pair("forward", 2),
        Pair("forward", 4),
        Pair("down", 2),
        Pair("down", 5),
        Pair("down", 7),
        Pair("down", 8),
        Pair("down", 1),
        Pair("up", 1),
        Pair("up", 1),
        Pair("forward", 9),
        Pair("down", 3),
        Pair("down", 1),
        Pair("forward", 4),
        Pair("up", 6),
        Pair("up", 8),
        Pair("forward", 7),
        Pair("forward", 9),
        Pair("down", 3),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("forward", 6),
        Pair("down", 1),
        Pair("forward", 7),
        Pair("down", 9),
        Pair("forward", 1),
        Pair("down", 8),
        Pair("forward", 8),
        Pair("up", 7),
        Pair("forward", 4),
        Pair("up", 5),
        Pair("up", 9),
        Pair("forward", 1),
        Pair("forward", 4),
        Pair("forward", 3),
        Pair("down", 3),
        Pair("down", 8),
        Pair("up", 3),
        Pair("forward", 1),
        Pair("up", 5),
        Pair("forward", 5),
        Pair("up", 6),
        Pair("forward", 8),
        Pair("forward", 1),
        Pair("down", 7),
        Pair("forward", 2),
        Pair("down", 9),
        Pair("forward", 3),
        Pair("forward", 7),
        Pair("forward", 2),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("up", 6),
        Pair("down", 7),
        Pair("up", 3),
        Pair("forward", 7),
        Pair("down", 8),
        Pair("down", 3),
        Pair("forward", 2),
        Pair("up", 7),
        Pair("down", 2),
        Pair("down", 8),
        Pair("up", 6),
        Pair("forward", 7),
        Pair("forward", 1),
        Pair("down", 3),
        Pair("forward", 2),
        Pair("forward", 8),
        Pair("down", 8),
        Pair("forward", 1),
        Pair("down", 7),
        Pair("down", 1),
        Pair("up", 5),
        Pair("up", 3),
        Pair("forward", 5),
        Pair("down", 5),
        Pair("up", 9),
        Pair("up", 9),
        Pair("down", 3),
        Pair("up", 3),
        Pair("down", 4),
        Pair("down", 6),
        Pair("up", 7),
        Pair("forward", 3),
        Pair("up", 5),
        Pair("down", 3),
        Pair("forward", 4),
        Pair("down", 1),
        Pair("up", 1),
        Pair("up", 6),
        Pair("down", 8),
        Pair("forward", 5),
        Pair("up", 2),
        Pair("down", 5),
        Pair("forward", 6),
        Pair("forward", 4),
        Pair("forward", 9),
        Pair("down", 9),
        Pair("down", 5),
        Pair("forward", 5),
        Pair("down", 7),
        Pair("down", 7),
        Pair("down", 8),
        Pair("forward", 3),
        Pair("down", 6),
        Pair("forward", 5),
        Pair("forward", 5),
        Pair("down", 6),
        Pair("forward", 3),
        Pair("down", 7),
        Pair("up", 4),
        Pair("up", 3),
        Pair("down", 5),
        Pair("forward", 9),
        Pair("forward", 9),
        Pair("up", 9),
        Pair("down", 1),
        Pair("up", 2),
        Pair("up", 3),
        Pair("down", 7),
        Pair("forward", 3),
        Pair("down", 7),
        Pair("down", 4),
        Pair("down", 5),
        Pair("down", 1),
        Pair("down", 4),
        Pair("up", 9),
        Pair("forward", 1),
        Pair("up", 8),
        Pair("forward", 7),
        Pair("up", 6),
        Pair("down", 1),
        Pair("up", 2),
        Pair("forward", 2),
        Pair("up", 9),
        Pair("down", 6),
        Pair("forward", 4),
        Pair("down", 2),
        Pair("up", 5),
        Pair("forward", 1),
        Pair("forward", 4),
        Pair("down", 6),
        Pair("down", 2),
        Pair("up", 8),
        Pair("forward", 2),
        Pair("forward", 8),
        Pair("forward", 4),
        Pair("down", 9),
        Pair("up", 3),
        Pair("forward", 5),
        Pair("forward", 9),
        Pair("forward", 4),
        Pair("down", 2),
        Pair("up", 4),
        Pair("up", 9),
        Pair("down", 5),
        Pair("up", 2),
        Pair("forward", 6),
        Pair("up", 2),
        Pair("down", 6),
        Pair("up", 5),
        Pair("up", 3),
        Pair("up", 9),
        Pair("forward", 8),
        Pair("down", 2),
        Pair("forward", 7),
        Pair("up", 8),
        Pair("down", 9),
        Pair("forward", 2),
        Pair("forward", 2),
        Pair("down", 6),
        Pair("forward", 9),
        Pair("forward", 2),
        Pair("forward", 8),
        Pair("up", 3),
        Pair("forward", 5),
        Pair("down", 4),
        Pair("forward", 2),
        Pair("down", 7),
        Pair("up", 6),
        Pair("forward", 7),
        Pair("down", 6),
        Pair("down", 8),
        Pair("down", 3),
        Pair("up", 4),
        Pair("up", 5),
        Pair("down", 2),
        Pair("down", 9),
        Pair("forward", 2),
        Pair("down", 7),
        Pair("forward", 2),
        Pair("forward", 3),
        Pair("forward", 9),
        Pair("down", 6),
        Pair("down", 1),
        Pair("forward", 6),
        Pair("down", 5),
        Pair("forward", 2),
        Pair("down", 5),
        Pair("down", 1),
        Pair("forward", 5),
        Pair("down", 4),
        Pair("down", 6),
        Pair("down", 5),
        Pair("forward", 9),
        Pair("up", 6),
        Pair("up", 5),
        Pair("up", 2),
        Pair("down", 1),
        Pair("down", 8),
        Pair("forward", 4),
        Pair("down", 2),
        Pair("forward", 5),
        Pair("down", 1),
        Pair("forward", 7),
        Pair("down", 8),
        Pair("down", 9),
        Pair("down", 7),
        Pair("up", 1),
        Pair("forward", 2),
        Pair("up", 8),
        Pair("down", 9),
        Pair("down", 2),
        Pair("down", 1),
        Pair("down", 9),
        Pair("down", 2),
        Pair("down", 5),
        Pair("forward", 9),
        Pair("forward", 1),
        Pair("down", 1),
        Pair("forward", 9),
        Pair("forward", 7),
        Pair("down", 6),
        Pair("down", 1),
        Pair("down", 7),
        Pair("forward", 4),
        Pair("forward", 1),
        Pair("forward", 4),
        Pair("forward", 5),
        Pair("forward", 5),
        Pair("down", 2),
        Pair("forward", 7),
        Pair("forward", 6),
        Pair("forward", 3),
        Pair("forward", 9),
        Pair("up", 1),
        Pair("down", 5),
        Pair("down", 4),
        Pair("down", 2),
        Pair("forward", 1),
        Pair("up", 7),
        Pair("forward", 2)
    )
}