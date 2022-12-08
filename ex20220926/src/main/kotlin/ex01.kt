//  mian함수
fun main() {
    // 실행 코드 작성하는 부분!
    println("환상의 나라로 오세요~╰(*°▽°*)╯")
    //  실행 :  shift+f10
    print("집으로 보내죠...")
    print("헿헤헤헤")

    val lazyString : String by lazy {
        println("이 친구가 만들어질 때 프린트")
        "lazyTestString"
    }

    // 값이 lazyString에 값이 들어가면서 출력문실행
    // 단, 사용을 해야 출력문이 실행이 된다

    lazyString
    //  println(lazyString)
}