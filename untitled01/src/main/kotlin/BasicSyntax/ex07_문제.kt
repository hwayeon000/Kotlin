package BasicSyntax

import kotlin.coroutines.suspendCoroutine

fun main() {
    // 간단한 조건문을 이용한 문제 풀이
    // 학생의 A B C D F 점수를 출력
    // A : 100초과
    // B : 90 - 99
    // C : 80 - 89
    // D : 70 - 79
    // F : 70미만

    val score = 80
    if (score>100){
        println("A")
    }else if (score > 90){
        println("B")
    }else if (score > 80){
        println("C")
    }else if (score > 70){
        println("D")
    }else{
        println("F")
    }



}