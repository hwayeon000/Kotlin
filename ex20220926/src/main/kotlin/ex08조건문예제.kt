import java.util.*
import kotlin.random.Random as Random1

fun main() {

    // Random rd = new Random()
    val rd = Random()
    // rd를 사용해 정수를 랜덤으로 1~10사이의 수 2개 가져오기
    // nextInt(bound) 0 ~ bound-1

    var num1 = rd.nextInt(10)+1
    var num2 = Random().nextInt(10)+1  // 안드로이드 요거로 쓰자!
    // 사용자에게 문제 보여주기
    println("$num1 + $num2 = ?")

    // 사용자가 입력하는 답, Scanner
    print("Enter the Answer : ")
    // readLine() ---> return type이 String?
    // : null인지 아닌지 null검사(처리) ---> ?
    // 숫자 + 영문자 .toInt(), null.toInt 불가능
//    var answer = readLine()?.toInt()
    var answer = readLine()!!.toInt()

    var result = if (num1+num2==answer)  "정답" else "오답"

    println("결과 : ${result}입니다.")
}