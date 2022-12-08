package AasicSyntax

fun main() {

    var number = readLine()!!.toInt()

    // when 숫자,숫자 ,(또는)
    when(number){
        10,20 -> println("결과 10 또는 20")
        else -> println("결과는 $number")
    }

    // when in 숫자..숫자 (범위)
    when(number){
        in 10..20 -> println("결과는 10부터 20 사이")
        else -> println("결과는 $number")
    }

}