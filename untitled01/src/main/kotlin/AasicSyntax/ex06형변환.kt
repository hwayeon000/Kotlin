package AasicSyntax

fun main() {

    // int -> String : toString()
    val number1 : Int = 56
    val str1 : String = number1.toString()

    println(number1)
    println(str1)

    // Double -> Float : toFloat()
    val number2 : Double = 3.14
    val number3 : Float = 3.14.toFloat()
    val number4 : Float = 3.14f

    println(number2)
    println(number3)
    println(number4)

    // 스마트캐스트
    // 내가 저장하고 싶은 값이 정수일 수도 있고, 실수일 수도있다면?
    // 대표적인 스마트캐스트 적용되는 자료형 : Number
    var test : Number  = 12.2
    println(test::class.java.simpleName)
    test = 12
    println(test::class.java.simpleName)

    // Any 자료형 : Java에서 Object와 비슷한 개념
    var test2 : Any = "조자연"
    println(test2::class.java.simpleName)
    test2 = 12
    println(test2::class.java.simpleName)


}