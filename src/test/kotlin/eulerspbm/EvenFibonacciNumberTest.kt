package eulerspbm

import org.junit.Assert
import org.junit.Test

class EvenFibonacciNumberTest {

    @Test
    fun `should return the sum of even fibonacci numbers for the given input` () {
        val obj = EvenFibonacciNumber()
        val resultValue = obj.findSumOfEvenFibonacciNumbers()
        Assert.assertEquals(resultValue, 4613732)
    }

    @Test
    fun `should check the given number is even` (){
        val given = 34
        val obj = EvenFibonacciNumber()
        val resultValue = obj.getEvenResultValue(given)
        Assert.assertEquals(resultValue, given)
    }

    @Test
    fun `should check the given number is not even` (){
        val given = 35
        val obj = EvenFibonacciNumber()
        val resultValue = obj.getEvenResultValue(given)
        Assert.assertEquals(resultValue, 0)
    }

}