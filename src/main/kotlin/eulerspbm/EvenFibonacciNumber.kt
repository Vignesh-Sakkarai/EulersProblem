package eulerspbm

class EvenFibonacciNumber {
    fun findSumOfEvenFibonacciNumbers(): Int {
        var initValue = 1
        var resultValue = 0
        var sumValue = 0
        val sumValueLimit = 4000000
        while (true){
            if(resultValue == 0){
                resultValue = initValue + initValue
            }else{
                var temp = resultValue
                resultValue += initValue
                initValue = temp
            }
            sumValue += getEvenResultValue(resultValue)
            if(sumValue > sumValueLimit){
                break
            }
        }

        println(sumValue)
        return sumValue
    }

    fun getEvenResultValue(resultValue: Int): Int {
        return if(resultValue % 2  == 0)
            resultValue
        else
            0
    }

}

fun main(args: Array<String>){
    val obj = EvenFibonacciNumber()
    obj.findSumOfEvenFibonacciNumbers()
}
