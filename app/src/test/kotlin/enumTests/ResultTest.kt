package enumTests

import enums.Result
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ResultTest {
    @Test
    fun `enum Result should have WIN, LOSE, and DRAW`(){
        val results = Result.values()
        assertEquals(3,results.size)
        assertEquals(Result.WIN, results[0])
        assertEquals(Result.LOSE, results[1])
        assertEquals(Result.DRAW, results[2])
    }
}