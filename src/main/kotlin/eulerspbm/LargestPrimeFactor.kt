package eulerspbm

class LargestPrimeFactor {
    fun findLargestPrimeFactor(input: Long): Long {
        var temp = input
        for (value in 2..input){
            if (temp % value == 0L) {
                temp /= value
                if(temp == 1L){
                    println("The Largest Prime factor of the given number is : $value")
                    return value
                }
            }
        }
        return 0
    }
}

fun main (args: Array<String>){
    val input = 600851475143L
    val obj = LargestPrimeFactor()
    obj.findLargestPrimeFactor(input)
}
