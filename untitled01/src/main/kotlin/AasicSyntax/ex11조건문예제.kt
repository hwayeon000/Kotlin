package AasicSyntax

import java.util.Random

fun main() {
    // 기능을 가져와서 사용하는 방법
    // val rd = Random()
    var num1 = Random().nextInt(10)+1
    var num2 = Random().nextInt(10)+1

    println("$num1 + $num2 = ?")

    print("Enter the Answer : ")
    // 예외 상황이 발생할 가능성 : 숫자와 영문자로 이루어진 값이나 문자열을 입력하면 입력한 값을 실수형으로 변환하지 못함
    var answer = readLine()?.toInt()

    val result = if (num1 + num2 == answer) "정답입니다" else "오답입니다"
    println("결과 : $result")

}