package eulerspbm

import org.junit.Assert
import org.junit.Test

class MultiplesOf3And5Test{

    @Test
    fun `should return the sum of multiples of 3 and 5 for the valid number` () {
        val input = 10
        var obj = MultiplesOf3And5()
        val resultObj = obj.sumOfMultiplesOf3And5(input)

        Assert.assertEquals(resultObj, 23)
    }
}