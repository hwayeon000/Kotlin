import java.util.*

// 주석 : 컴파일 안되는 문장 (메모)
// ---> 컴퓨터는 읽지 않고 넘어가는 부분

// class 말고 file로 만들기
// main 입력 후 Enter 빵!

fun main() {
    // println : 출력 후 개행 o
    println("Hello World")
    // print : 출력 후 개행 x
    print("Hello")
    print(" World")

    // 실행 단축키 : shift + F10

    // Scanner 사용하기
    val sc : Scanner = Scanner(System.`in`)

    val name = sc.nextLine()
    println(name)
}
