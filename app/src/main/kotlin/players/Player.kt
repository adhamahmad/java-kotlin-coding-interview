package players

import enums.Move
import enums.Result
/**
 * This class simulates a player base class that encapsulates the common logic and attributes.
 */
abstract class Player(val name: String) {
    var gamesWon: Int = 0
    var gamesLost: Int = 0
    var gamesDrawn: Int = 0

    fun recordResult(result: Result){
        when(result){
            Result.WIN -> gamesWon++
            Result.LOSE -> gamesLost++
            Result.DRAW -> gamesDrawn++
        }
    }

    abstract fun makeMove(): Move
}