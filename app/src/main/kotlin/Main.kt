import players.RandomPlayer
import players.RockPlayer
/**
 * Main function that simulates the Rock-Paper-Scissors game between two players.
 * - Player A is a RandomPlayer that chooses moves randomly.
 * - Player B is a RockPlayer that always chooses Rock.
 * The game runs for 100 rounds, and the results (wins for each player and draws) are printed.
 */

fun main() {
    val playerA = RockPlayer("Player A")
    val playerB = RandomPlayer("Player B")

    val game = Game(playerA,playerB)
    game.simulateGame( 100)

    printMatchResults(playerA, playerB)

}