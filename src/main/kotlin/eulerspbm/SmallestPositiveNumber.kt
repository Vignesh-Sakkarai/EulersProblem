package eulerspbm

class SmallestPositiveNumber {
    fun findSmallestPositiveNumberDivisibleBy1to20() : Int{
        var initValue = 21
        while (true) {
            for (value in 1..20){
                if(initValue % value != 0)
                    break
                else if(initValue % value == 0 && value == 20)
                    return initValue
            }
            initValue += 1
        }
        return 0
    }

}

fun main(args: Array<String>){
    val obj = SmallestPositiveNumber()
    val resultValue = obj.findSmallestPositiveNumberDivisibleBy1to20()
    println("The Smallest Positive number divisible by 1 to 20 is : $resultValue")
}