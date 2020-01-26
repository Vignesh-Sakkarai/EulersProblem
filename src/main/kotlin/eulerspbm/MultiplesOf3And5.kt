package eulerspbm

import java.util.*

class MultiplesOf3And5{
    fun sumOfMultiplesOf3And5(input: Int): Int {
        var result = 0
        for(value in 0 until input){
            if(value % 3 == 0 || value % 5 == 0){
                result += value
            }
        }
        println("The Result Output is : $result")
        return result
    }
}

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var input: Int = reader.nextInt()
    println("The Given Input is : $input")

    val obj = MultiplesOf3And5()
    obj.sumOfMultiplesOf3And5(input)
}