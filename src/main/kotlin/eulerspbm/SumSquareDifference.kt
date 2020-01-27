package eulerspbm

class SumSquareDifference {
    fun findSumSquareMinusSquareSum(): Int {
        var sumValue = 0
        var sumOfSquare = 0
        var squareOfSum = 0
        for (value in 1..100){
            sumValue += value
            sumOfSquare += value * value
        }
        squareOfSum = sumValue * sumValue
        return squareOfSum - sumOfSquare
    }
}

fun main(args:Array<String>){
    val obj = SumSquareDifference()
    val resultValue = obj.findSumSquareMinusSquareSum()
    println("The Sum Square Difference is: $resultValue")
}
