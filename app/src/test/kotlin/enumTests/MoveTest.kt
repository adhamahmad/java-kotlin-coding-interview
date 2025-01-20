package enumTests

import enums.Move
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MoveTest {
    @Test
    fun `enum Move should have ROCK, PAPER, and SCISSORS`(){
        val moves = Move.values()
        assertEquals(3,moves.size)
        assertEquals(Move.ROCK, moves[0])
        assertEquals(Move.PAPER, moves[1])
        assertEquals(Move.SCISSORS, moves[2])
    }
}