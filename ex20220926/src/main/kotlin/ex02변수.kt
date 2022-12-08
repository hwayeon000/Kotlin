fun main() {
    // 1. val : value의 약어, 한 번 초기화 시켜놓으면 변경이 불가능한 상수
    // 선언 : 공간만 만드는 것 : int num;
    // 초기화 : 값을 넣은 것 : num = 12;
    // int num = 12; 선언과 동시에 초기화
    val name = "박화연"  // 선언과 초기화를 동시에 진행할 때는 자료형 생략 가능
    // 자료형을 명시하는 방법
    val age : Int = 20
    // age = 21 재할당이 불가능함

    var myAge : Int
    myAge = 21

    // 2. var : Variable 변할 수 있는 수
    var weight = 50
    weight = 55

    // ctrl + shift + p 를 통해서 추론된 자료형을 말풍선으로 확인
    // 자료형 생략 :  선언+초기화 동시에 진행
    // 자료형 명시 : 선언/초기화 분리되어 있으면
    // val, var
    // val (상수) : 초기화 후 값 변경 불가
    // var (변수) : 초기화 후 값 변경 가능

    println("이름: $name, 나이 : $age, 나이2 : $myAge, 무게 : $weight")


}