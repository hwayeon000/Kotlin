fun main() {

    // 만약 이름이 없는(변수에 담기지 않은) 함수를 람다식으로 선언한 상태
    {x: Int, y: Int -> x+y}
    // 더하기 기능을 필요할 때마다 사용하려면 어딘가에 저장 : 변수
    val sum : (Int, Int) -> Int = {x: Int, y: Int -> x+y}
    println(sum(3,4))


    // 1. 람다식의 매개변수 자료형이 지정되어 잇다면
    // 변수(sum)에 자료형을 생략할 수 있다
    val sum1 = {x:Int, y:Int -> x+y}
    // 2.sum의 매개변수에 자료형이 지정되어 있다면
    // 람다식의 매개변수 자료형 생략가능하다
    val sum2 : (Int,Int) -> Int = {x,y -> x+y}
    // 단, 람다식과 변수의 자료형을 둘 다 생략해버리면 추론 불가능

    // "Hello Kotlin"을 출력하는 기능을 가진 람다식 함수 선언
    val greet :() -> Unit = { println("Hello Kotlin") }
    //val greet = { println("Hello Kotlin") }
    // ->  리턴값
    val greet2 = { println("Hello Kotlin(●ˇ∀ˇ●)") }


    // 정사각형의 넓이를 구하는 람다식 함수 선언 = square
    // 매개변수 Int

    val square :(Int)->Int = {x -> x * x}
    val square2 = {x:Int -> x * x}





}