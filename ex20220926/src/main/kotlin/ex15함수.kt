fun main() {

    println(sum3(4, 2))
    println(sum1(4, 2))
    println(sum2(4, 2))

}

// main() 밖에서 함수 선언 및 구현
fun sum3(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

// 함수 간략화 하기
// 1. {}(body)가 한줄이면 중괄호와 return 생략 가능
fun sum1(num1 : Int, num2 : Int) : Int = num1 + num2

// 2. 매개변수 Int 두 개를 더한 결과값 리턴하는 걸 통해
// 결과값 Int 자료형임을 추론 가능
fun sum2(num1 : Int, num2 : Int) = num1 + num2
// 코드 양을 줄일 수 있고 가독성도 좋아 실무에서 가장 많이 사용하는 방법!



