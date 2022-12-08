package AasicSyntax

fun main() {
    printSum(3,7)
}

// Unit 함수 : 반환값이 없는 함수
// Unit은 코틀린에서 다루는 특수한 자료형 중 하나로 반환값이 없을 때 사용
fun printSum(num1:Int, num2:Int)=
    println("$num1 + $num2 = ${num1+num2}")


// return이라는 키워드가 없어서 자체적으로 Unit으로 추론
// Unit 생략 가능