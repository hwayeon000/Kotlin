fun main() {

    // = (대입연산자) : 값을 할당하는 연산자
    var numOfApple = 12

    // 복합대입연산자 : +=, -=, *= ...
    // numOfApple += 1 ---> numOfApple = numOfApple + 1
    // 값을 누적시키고 싶을 때

    // 증감연산자 : 증가/감소 연산자 : ++, --
    var num1 = 10
    var num2 = 10

    var result1 = ++num1  // +1 먼저 하고 대입
    var result2 = num2++  // 코드를 먼저 실행시키고 +1

    println("$num1, $num2")
    println("$result1, $result2")


    // ★★비교연산자 : >, <, >=, <=
//     ==, != 과  ===, !== 차이점 알아보자~
//     == : 주소값(참조값)에 상관없이 값만 같으면 true
//     != : 주소값(참조값)에 상관없이 값만 다르면 true
//
//     === : 값에 상관없이 주소값(참조값)이 같으면 true
//     !== : 값에 상관없이 주소값(참조값)이 다르면 true

    val a : Int = 128
    val b = a

    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d)  // 128과 128 같은지 비교
    println(c === d)  // c(A2주소)의 주소값과 d(A3주소)의 주소값이 같은지 비교, 참조형 자료형으로 주소값이 다름!
    println(c === e)  // e에 대입한 c는 참조형으로 주소값 A2까지 가져옴, 그래서 true


}