package AasicSyntax

fun main() {

    // when문으로 변수 x의 값이 1또는 2와 일치하는지 확인해보자

    var x = 1

    // 마지막엔 꼭 else문 사용하기!

    when(x){
        1 -> println("x는 1입니다")
        2 -> println("x는 2입니다")
        else -> println("x는 1,2가 아닙니다")
    }

}