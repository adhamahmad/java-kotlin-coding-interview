package players

import enums.Move
/**
 * This class simulates a player that always chooses Rock in the game.
 */
class RockPlayer(name: String) : Player(name) {
    override fun makeMove(): Move {
        return Move.ROCK
    }
}