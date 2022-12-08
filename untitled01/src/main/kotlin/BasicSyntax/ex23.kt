package BasicSyntax

fun main() {

    val emailList = ArrayList<String>()
    emailList.add("abc1@naver.com")
    emailList.add("abc2@google.com")
    emailList.add("abc3@daum.com")
    emailList.add("abc4@kakao.com")
    emailList.add("abc5@naver.com")
    emailList.add("abc6@kakao.com")
    emailList.add("abc7@naver.com")

    // @ 다음에 naver라고 적힌 이메일의 갯수를 찾아보자
    // 2개

    // 1. naver라는 텍스트가 포함되었는지 찾기
    // 문제점 : naver@google.com도 포함

    // 2. @ 뒤에 naver라고 텍스트가 있고 그다음에 .이
    // 이어진 이메일이 몇개인지 찾기
    // *******@naver.com

    val naverList = ArrayList<String>()

    for(item in emailList){
        println(item)
        println(item.split("@")[1].split(".")[0])
        naverList.add(item.split("@")[1].split(".")[0])
    }
    var count = 0
    for(item in naverList){
        if(item == "naver"){
            count++
        }
    }

    println(count)

}