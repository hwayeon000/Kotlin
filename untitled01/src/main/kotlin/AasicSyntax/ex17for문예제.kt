package AasicSyntax

fun main() {

    var odd : Int = 0
    var even : Int = 0

    for( num in 1..100 step 2) odd+=num
    println("홀수의 합 : $odd")

    for (num in 0..99 step 2) even+=num
    println("짝수의 합 : $even")


}