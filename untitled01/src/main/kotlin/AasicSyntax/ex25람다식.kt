package AasicSyntax

fun main() {
    // 이름이 없는 함수를 람다식으로 선언한 상태
    {x:Int, y:Int -> x+y}
    // 더하기 기능을 필요할 때마다 사용하려면 어딘가에 저장 : 변수
    val sum : (Int, Int) -> Int = {x:Int , y:Int -> x+y}
    println(sum(3,4))

    // 1. 람다식의 매개변수에 자료형이 지정되어 있다면 변수에 자료형은 생략할 수 있다
    //  val sum = {x:Int , y:Int -> x+y}
    // 2. 변수에 매개변수의 자료형이 지정되어 있다면 람다식의 매개변수 자료형이 생략가능하다
    //  val sum : (Int, Int) -> Int = {x , y -> x+y}
    // 단, 람다식과 변수의 자료형을 둘 다 생략해버리면 추론이 불가능

    // "Hello Kotlin"을 출력하는 기능을 가진 람다식 함수 선언
    val greet : () -> Unit = {println("Hello Kotlin")}
    // 생략 가능한 Unit
    // val greet = {println("Hello Kotlin")}
    // 정사각형의 넓이를 구하는 람다식 함수 선언
    val square : (Int) -> Int = { x:Int -> x*x }
    // val square  = { x:Int -> x*x }

    // 안드로이드에서 람다식 단점..
    // 물론 코드의 길이가 간편해진다라는 장점도 있는 반면에 안드로이드 내부에 있는 함수들의 구조
    // 즉, 매개변수로 어떤 것들이 사용되고 있는지 리턴타입이 어떻게 되어있는지 전부 파악하고 있어야한다

    // 안드로이드에서 람다식이 사용 되는 대표적인 사례~


}