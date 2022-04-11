import AdventOfCode.day2Puzzle1
import AdventOfCode.depthInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day2Test {
    @Test
    fun `The multiplication of depth and horizontal movement in test data is 150`() {
        // given
        val testData = listOf(
            Pair("forward", 5),
            Pair("down", 5),
            Pair("forward", 8),
            Pair("up", 3),
            Pair("down", 8),
            Pair("forward", 2)
        )
        // when
        val horXdepth: Int = day2Puzzle1(testData)
        // then
        assertThat(horXdepth).isEqualTo(150)
    }

    @Test
    fun `The multiplication of depth and horizontal movement in test data is 1882980`() {
        // given
        val input = depthInput()

        // when
        val sum: Int = day2Puzzle1(input)

        // then
        assertThat(sum).isEqualTo(1882980)
    }
}