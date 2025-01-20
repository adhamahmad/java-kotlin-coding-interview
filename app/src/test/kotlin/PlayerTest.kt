import enums.Move
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import players.RandomPlayer
import players.RockPlayer
import kotlin.test.assertTrue

class PlayerTest {
    @Test
    fun `RockPlayer should always play ROCK`() {
        val player = RockPlayer("players.Player A")
        repeat(10) {
            assertEquals(Move.ROCK, player.makeMove())
        }
    }

    @Test
    fun `Random player should play valid moves`() {
        val player = RandomPlayer("players.Player A")
        repeat(10) {
            assertTrue(player.makeMove() in Move.values())
        }
    }
}
