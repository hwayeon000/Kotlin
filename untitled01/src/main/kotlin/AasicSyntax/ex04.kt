package AasicSyntax

fun main() {

    // ?: - 엘비스(Elvis) 연산자
    var str1 : String? = "Hello Kotlin"
    str1 = null

    // 세이프 콜과 엘비스 연산자 활용
    println("length of str1 : ${str1?.length}")
    println("length of str1 : ${str1?.length ?: -1}")

}