fun main() {
    // 변수 : 값을 저장할 수 있는 공간
    // 1) val
    val text : String = "test box"
    // 자동으로 문자열로 인식해서 담는다
    val text1 = "test box1"
    println(text1)
    val text2 = "text box2"
    // text2에 값을 재할당 할 수 있을까?
    // text2 = "new data"
    // val는 값을 초기할당(초기화) 시키고나면 재할당이 불가능하다

    // 2) var
    var text3 = "text box3"
    println(text3)
    text3 = "new data"
    println(text3)
    // var은 값을 재할당이 가능하다
}