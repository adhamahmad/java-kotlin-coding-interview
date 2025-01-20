import enums.Move
import enums.Result
import players.Player
/**
 * this class simulates the game
 */
class Game(private val playerA: Player, private val playerB: Player) {

    internal fun simulateGame(rounds: Int) {
        repeat(rounds) {
            val moveA = playerA.makeMove()
            val moveB = playerB.makeMove()
            val result = determineWinner(moveA, moveB)

            when (result) {
                Result.WIN -> {
                    playerA.recordResult(Result.WIN)
                    playerB.recordResult(Result.LOSE)
                }

                Result.LOSE -> {
                    playerA.recordResult(Result.LOSE)
                    playerB.recordResult(Result.WIN)
                }

                Result.DRAW -> {
                    playerA.recordResult(Result.DRAW)
                    playerB.recordResult(Result.DRAW)
                }
            }
        }
    }
}

fun determineWinner(moveA: Move, moveB: Move): Result {
    return when {
        moveA == moveB -> Result.DRAW
        (moveA == Move.ROCK && moveB == Move.SCISSORS) ||
                (moveA == Move.SCISSORS && moveB == Move.PAPER) ||
                (moveA == Move.PAPER && moveB == Move.ROCK) -> Result.WIN

        else -> Result.LOSE
    }
}