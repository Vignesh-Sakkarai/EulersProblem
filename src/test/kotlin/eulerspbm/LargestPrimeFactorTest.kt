package eulerspbm

import org.junit.Assert
import org.junit.Test

class LargestPrimeFactorTest{

    @Test
    fun `Should return the largest prime factor of the given number`() {
        val input = 13195L
        val obj = LargestPrimeFactor()
        val resultValue = obj.findLargestPrimeFactor(input)
        Assert.assertEquals(resultValue, 29)
    }
}