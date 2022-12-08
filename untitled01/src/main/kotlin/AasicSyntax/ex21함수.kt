package AasicSyntax

fun main() {
    // 코드를 실행시키는(컴파일) 메서드
    println(sum(3,7))
    println(sub(3,7))
    println(mul(3,7))
    println(div(3,7))
}

// 함수 선언 및 구현은 main() 밖에서
fun sum(num1: Int, num2: Int) : Int{
    return num1+num2
}

// 함수 간략화 하기
// 1. {}(body)가 한 줄이면 중괄호와 return문을 생략할 수 있다
// fun sum(num1: Int, num2:Int) : Int = num1+num2

// 2. 매개변수 Int 두 개를 더한 결과값을 리턴하는걸 통해
// 결과값이 Int자료형임을 추론할 수 있다 = 리턴타입도 생략 가능
// fun sum(num1: Int ,num2:Int) = num1+num2
// 코드 양을 줄일 수 있고 읽기에도 좋아서 실무에서 가장 많이 사용되는 방법


fun sub(num1: Int, num2: Int) : Int{
    return num1-num2
}
fun mul(num1: Int, num2: Int) : Int{
    return num1*num2
}
fun div(num1: Int, num2: Int) : Int{
    return num1/num2
}

