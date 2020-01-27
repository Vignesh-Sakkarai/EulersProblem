package eulerspbm

import org.junit.Assert
import org.junit.Test

class SumSquareDifferenceTest{
    @Test
    fun `should return the difference of the square of the sum minus sum of the squares from 1 to 100` () {
        val obj = SumSquareDifference()
        val expectedResult = obj.findSumSquareMinusSquareSum()
        Assert.assertEquals(expectedResult, 25164150)
    }
}