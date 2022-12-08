package BasicSyntax

fun main() {
    // 함수 (function) : 기능
    addPrint()
    addPrint()
    // 단순 반복 작업을 줄여준다.

    addPrint(10,5)
    println(add(50,8))

    // 지옥
    deathTime(3756)

}

// fun + 함수 이름
fun addPrint(){
    // 기능을 구현하기 위한 로직을 작성하자
    println(1+5)
}

// 매개변수를 작성하는 방법
fun addPrint(num1 : Int, num2 : Int){
    println(num1+num2)
}
// 리턴타입을 작성하는 방법
// fun 함수명 ( 매개변수 ) : 리턴타입 { 로직(body) }
fun add(num1: Int, num2: Int) : Int {

    return num1 + num2
}

// 지옥
// "너는 3456초 뒤에 죽는다" - 저는 몇시간 몇분 몇초뒤에 죽는걸까요..?
fun deathTime(time : Int) {
    var hour = time/3600
    var min = time%3600/60
    var sec = time%60

    println("$hour 시간 $min 분 $sec 초 뒤에 너는 죽는다")
}