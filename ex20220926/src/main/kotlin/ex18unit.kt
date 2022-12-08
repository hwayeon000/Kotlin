fun main() {

    // 전달인자 두개 받아서 더한 연산결과 출력해주는 기능을 가진 함수
    printSum(3, 7)
    printMin(10, 5)

}

// Unit 함수 : 반환값이 없는 함수

fun printSum(num1:Int, num2: Int) : Unit {
    println(num1+num2)
    // return 이라는 키워드 오지 않음
}

// return 키워드 없으면 자체적으로 Unit으로 추론
// Unit 리턴타입 생략 가능
fun printMin(num1:Int, num2: Int) = println(num1-num2)
// return 이라는 키워드 오지 않음
// 리턴문 한출, 중괄호 생략 가능
