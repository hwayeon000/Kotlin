package DasicSyntax

fun main() {
    testFun1("abc")
    // testFun1(12) : error

    testFun2("abc")
    testFun2(123)
    // 문자나 숫자가 들어가도 다 수용이 가능하다
    // T가 의미하는게 제네릭인가? A로 바꿔볼까
    // 바뀜!
    // 제네릭은 <> 꺽새 기호임
}

fun testFun1(a : String){
    println(a)
}

fun <T> testFun2( a : T){
    println(a)
}