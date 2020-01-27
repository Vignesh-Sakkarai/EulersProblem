package eulerspbm

import org.junit.Assert
import org.junit.Test

class LargestPalindromeOf3DigitTest{
    @Test
    fun `should return the largest palindrome of 3 digit number`() {
        val obj = LargestPalindromeOf3Digit()
        val expectedResult = obj.findLargestPalindromeOf3Digit()
        Assert.assertEquals(expectedResult,906609)
    }
}