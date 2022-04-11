import AdventOfCode.day1Puzzle1Try2
import AdventOfCode.day1Puzzle2
import AdventOfCode.input
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day1Test {
    @Test
    fun `The sum of increasing segments in test data is 7`() {
        // given
        val testData = listOf(
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263,
        )
        // when
        val sum: Int = day1Puzzle1Try2(testData)
        // then
        assertThat(sum).isEqualTo(7)
    }

    @Test
    fun `The sum of increasing segments in input data is 1681`() {
        // given
        val input = input()

        // when
        val sum: Int = day1Puzzle1Try2(input)

        // then
        assertThat(sum).isEqualTo(1681)
    }

    @Test
    fun `The sum of 3 increasing segments compared to next 3 segments in input data is 1704`() {
        // given
        val input = input()

        // when
        val sum: Int = day1Puzzle2(input)

        // then
        assertThat(sum).isEqualTo(1704)
    }
}