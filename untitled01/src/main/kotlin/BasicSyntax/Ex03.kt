fun main() {
    println("123"+4)
    println(123+4)

    // 숫자 + 숫자 = 숫자연산
    // 문자 + 숫자 or 숫자 + 문자
    // = 앞/뒤에오는 숫자를 자동으로 문자로 형변환

    val test1 = "123"+1
    val test2 = 123 + 1
    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

}