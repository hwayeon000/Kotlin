fun main() {

    // 만약 회원이 이메일 입력하지 않은 경우
    // "default" 저장시키고 싶다!
    addList("박화연", "default")
    addList2("ㅂㅎㅇ")
    addList2("ㅂㅎㅇ", "phy@naver.com")

}
// 1. 회원 정보를 저장하는 프로그램 (이름, 이메일(선택))
fun addList(name : String, email : String){
    // 저장하는 어떤 코드
}

// 2. email값에 대한 전달인자가 없을 경우 기본값 설정
fun addList2(name:String, email: String= "default") {
    println("${name} : ${email}")
}