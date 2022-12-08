package AasicSyntax

fun main() {

    // 1. 초기화 후 값 변경 가능
    var language = "Kotlin"
    language = "Java"
    println("언어 : "+language) // 출력문

    // 2. 초기화 시 타입을 지정 했다면 다른 타입의 값을 넣는 것은 불가능
    // language = 88
    // Type mismatch 에러 발생


}