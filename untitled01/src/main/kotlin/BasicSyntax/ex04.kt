fun main() {
    // 자료형 : 자바와 유사한 기본 자료형을 가지고 있다
    // 1) int
    val num1 : Int = 1234
    println(num1)

    // 오류 발생
//    val num2 : Int = "1234"
//    println(num2)

    // 2) long
    // 3) double
    // 4) Float : 숫자에 맨뒤에 f 붙혀주기
    val num3 : Long = 123456
    val num4 : Double = 123.0
    val num5 : Float = 12.3f

    // 데이터 타입을 변경하고 싶다면?
    // 숫자 ---> 문자열
    val num6 : Int = 4567
    val text1 = num6.toString()
    println(text1::class.java.simpleName)
    // 문자열 ---> 숫자
    val num7 = Integer.parseInt(text1)
    println(num7::class.java.simpleName)
    // 5) String
    // 6) boolean
    val answer1 : Boolean = true
    val answer2 = false

    // null
    val text2 = ""
    val text3 = null
    // kotlin에서 null값을 다루는 법이 까다로움
    // val text4 : String = null
    val text4 : String? = null
    println(text4)
    // ? : null 일 수도 있다
    // nullPointerException이 가장 많이 발생하는 오류
    // Kotlin에서는 NullPointerException을 방어하기위해
    // 변수를 선언할때 null값을 허용하지 않는데
    // 사용하고 싶다면 ?를 붙혀줘야 한다


}
