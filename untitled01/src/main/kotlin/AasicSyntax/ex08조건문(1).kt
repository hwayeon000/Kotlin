package AasicSyntax

fun main() {

    // 두 수중 큰 값을 판단하는 조건문을 만들고 간략화하는 방법을 알아보자

    var num1 = 11
    var num2 = 24

    var result = num2

    // if문
    if ( num1 > num2 ) {
        // true일 경우 실행시킬 코드 작성하는 부분
        result = num1
    }

    println(result)

}