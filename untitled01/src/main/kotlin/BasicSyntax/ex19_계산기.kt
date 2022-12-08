package BasicSyntax

import java.util.Scanner

fun main() {
    // 함수를 사용해서 계산기 만들어보자
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()

    sumTwo(num1,num2)

}

fun sumTwo(num1 : Int, num2: Int){
    println(num1 + num2)
}

fun sumThree(num1 : Int, num2: Int, num3:Int){
    println(num1 + num2 + num3)
}
fun min(num1 : Int, num2: Int){
    println(num1 - num2)
}
fun division(num1 : Int, num2: Int){
    println(num1 / num2)
}
fun remainder(num1 : Int, num2: Int){
    println(num1 % num2)
}