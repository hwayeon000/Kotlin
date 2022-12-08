package DasicSyntax

fun main() {
    // 지연 초기화
    // lateinit / lazy

    var justString : String = "아무거나 스트링"
    println(justString)
    justString = "변경된 스트링"
    println(justString)

    //
    lateinit var lateString : String

    // println(lateString)
    // 데이터가 아무것도 안들어가있는데 출력하려고하면 오류발생

    // 만약 서버에서 데이터를 받아오는 일이 생길 수도 있다
    // 서버에서 받아온 데이터를 넣어두고 싶은데, 미리 변수를 선언해놓고
    // 나중에 서버에서 값을 받아와서 넣어줄 때 주로 사용합니다.

    lateString = "변경된 스트링"

    println(lateString)



}