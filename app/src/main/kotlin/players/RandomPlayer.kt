package players

import enums.Move

import kotlin.random.Random

/**
 * This class simulates a random player that plays randomly in the game.
 */
class RandomPlayer (name: String) : Player(name){
    override fun makeMove(): Move {
        val moves = Move.values()
        return moves[Random.nextInt(moves.size)] // generate random value from 0 to moves.size exclusively
    }

}