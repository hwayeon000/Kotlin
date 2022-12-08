package AasicSyntax

fun main() {

    // 0. 데이터를 저장할 수 있는 공간 만들기
    val age : Int = 20
    print(age)

    // 1. val : value의 약어이며 변경 불가능(immutable)한 변수, 초기화만 가능
    val name = "Kotlin"
    // 1-1. 위에서 이미 값을 할당 했기 때문에 아래 코드처럼 값 할당 불가능
    // name = "Java"

    // 2. 타입 지정 가능, 다만 1번처럼 컴파일러에서 타입이 추론 가능한 경우 생략 가능
    val appTeacher = "조자연"
    // ctrl + shift + p : 추론된 자료형을 말풍선으로 알려줌

    // 2-1. 초기화시 값을 할당하지 않을시엔 반드시 타입을 지정해야함
    val aiTeacher : String
    aiTeacher = "강성관"

    // 3. 코드 문맥에 따라 val 변수가 1번만 초기화 되는 것이 맞다면 여러 값을 초기화 가능
    // 4. 변수이 참조가 가리키는 객체의 내부 값은 변경이 가능 : arrayListOf

}