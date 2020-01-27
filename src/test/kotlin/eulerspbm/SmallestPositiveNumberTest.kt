package eulerspbm

import org.junit.Assert
import org.junit.Test

class SmallestPositiveNumberTest{

    @Test
    fun `should return a smallest positive number, which is divisible by 1 to 20`() {
        val obj = SmallestPositiveNumber()
        val expectedResult = obj.findSmallestPositiveNumberDivisibleBy1to20()
        Assert.assertEquals(expectedResult, 232792560)
    }
}