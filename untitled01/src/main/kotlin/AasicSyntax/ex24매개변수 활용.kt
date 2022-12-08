package AasicSyntax

fun main() {

    // addList()를 호출할 때마다 email "default"값을 함수의
    // 인자로 넘겨주는 일은 매우 번거로움
    addList("조자연","default")
    addList("강성관","default")

    addList2("나예호")

}

// 어떤 회원의 이름과 이메일 주소를 매개변수로 받아
// 회원 목록에 저장하는 함수를 개발하는 상황을 상상
// 그런데 이메일 주소가 없는 회원이 있을 수 도 있어서
// 이런 회원의 이메일 주소는 "default"문자열을 함수에 전달하여
// 처리하기로 했다. 그랬을 경우에 어떤 방법을 통해 처리할 수
// 있는지 알아보자

// 1.
fun addList(name : String, email : String){
    // name과 email을 회원 목록에 저장
}

// 2. email 값에 대한 전달인자가 없을 경우 기본값을 설정해주자
fun addList2(name: String, email: String ="default"){

}


