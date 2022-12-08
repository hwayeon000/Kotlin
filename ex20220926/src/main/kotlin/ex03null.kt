fun main() {

    // kotlin에서 null을 허용하는 방법 : ?
    var str1 : String = "안녕 코틀린!"
    var str2 : String? = "안녕 코틀린( ⓛ ω ⓛ *)"
    str2 = null
    //  안녕 코틀린( ⓛ ω ⓛ *) or null
    // str1의 문자열의 길이 srt1.length
    println(str1.length)
    println(str2?.length)

    // 엘비스(Elvis) 연산자 : null값을 처리하는 두 번째 방법
    // 값(변수) ?: 값이 null이라면 실행시킬 코드
    println("length of str2 : ${str2?.length ?: "(👉ﾟヮﾟ)👉null"}")


}