package eulerspbm

class LargestPalindromeOf3Digit{
    fun findLargestPalindromeOf3Digit(): Int {
        val resultList = arrayListOf<Int>()
        for (x in 999 downTo  100){
            for (y in 999 downTo  100){
                var result = x * y
                if(isPalindrome(result)){
                    resultList.add(result)
                }
            }
        }
        return getLargestPalindrome(resultList)
    }

    private fun getLargestPalindrome(resultList: ArrayList<Int>): Int {
        resultList.sort();
        println("The Largest Palindrome of 3 digit number: ${resultList[resultList.size-1]}")
        return resultList[resultList.size-1]
    }

    private fun isPalindrome(result: Int): Boolean {
        val resultString = result.toString()
        if (resultString == resultString.reversed())
            return true
        return false
    }
}

fun main(args: Array<String>){
    val obj = LargestPalindromeOf3Digit()
    obj.findLargestPalindromeOf3Digit()
}