import enums.Move
import enums.Result
import org.junit.jupiter.api.Test
import players.Player
import players.RandomPlayer
import players.RockPlayer
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class GameTest {
    @Test
    fun `simulateGame updates stats correctly`() {
        val playerA = RockPlayer("Player A")
        val playerB = RandomPlayer("Player B")

        val game = Game(playerA,playerB)
        game.simulateGame( 100)

        val totalGames = playerA.gamesWon + playerA.gamesLost + playerA.gamesDrawn
        assertEquals(100, totalGames)
        assertEquals(playerA.gamesDrawn, playerB.gamesDrawn) // Draw count should match
        assertEquals(playerA.gamesLost, playerB.gamesWon) // First player's losses are second player's wins
    }

    @Test
    fun `determineWinner handles all scenarios correctly`() {
        assertEquals(Result.WIN, determineWinner(Move.ROCK, Move.SCISSORS))
        assertEquals(Result.LOSE, determineWinner(Move.ROCK, Move.PAPER))
        assertEquals(Result.DRAW, determineWinner(Move.ROCK, Move.ROCK))

        assertEquals(Result.WIN, determineWinner(Move.PAPER, Move.ROCK))
        assertEquals(Result.LOSE, determineWinner(Move.PAPER, Move.SCISSORS))
        assertEquals(Result.DRAW, determineWinner(Move.PAPER, Move.PAPER))

        assertEquals(Result.WIN, determineWinner(Move.SCISSORS, Move.PAPER))
        assertEquals(Result.LOSE, determineWinner(Move.SCISSORS, Move.ROCK))
        assertEquals(Result.DRAW, determineWinner(Move.SCISSORS, Move.SCISSORS))
    }

    @Test
    fun `should handle invalid move gracefully`() {
        // If we extend the game in the future, we might introduce invalid moves.
        // Here, we simulate an invalid move scenario (assuming our enums don't allow this).

        val invalidMovePlayer = object : Player("Invalid Player") {
            override fun makeMove(): Move = Move.valueOf("INVALID") // Will throw exception
        }

        assertFailsWith<IllegalArgumentException> {
            Game(invalidMovePlayer, RockPlayer("Player B")).simulateGame(1)
        }
    }


}