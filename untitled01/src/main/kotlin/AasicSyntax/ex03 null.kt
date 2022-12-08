package AasicSyntax

fun main() {

    // ? : null 일 수도 있다
    // nullPointerException이 가장 많이 발생하는 오류
    // Kotlin에서는 NullPointerException을 방어하기위해
    // 변수를 선언할때 null값을 허용하지 않는데
    // 사용하고 싶다면 ?를 붙혀줘야 한다

    // 1. null 처리하기
    // var str1 : String = "Hello Kotlin"
    // str1 = null
    // : 오류! null을 허용하지 않음

    // null 값을 허용하게 만들려면 ?를 사용해서 선언하자
    var str1 : String? = "Hello Kotlin"
    str1 = null

    println("str1 : $str1")

    // null을 허용해서 변수를 선언 했을 때 발생할 수 있는 문제
    // println(str1.length)가 실행될 수 없음
    // 커서를 두면 빨간 줄이 표시되고 String?형에서는 세이프 콜(?.)이나 non-null 단정기호(!!)
    // 만 허용한다는 팁을 볼 수 있다

    println(str1?.length)
    // println(str1!!.length)
    // !!는 변수에 할당된 값이 null이 아님을 단정하므로 컴파일러가 null 검사 없이 무시
    // 실행 중에 NPE를 발생

    // null을 허용한 변수를 더 안전하게 사용하기 위해서는
    // ex04

}