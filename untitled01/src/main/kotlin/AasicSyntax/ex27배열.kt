package AasicSyntax

fun main() {

    // arrayOf() 사용하기
    // : 특정 값을 넣어서 배열을 생성하는 경우 사용
    var arr = arrayOf(1,2,3)

    // : 특정 타입을 지정하지 않은 상태로 배열을 생성하면 어떤 값이 들어가도 상관없음
    var arr2 = arrayOf(1,"가",true,3.1415926)

    // : 특정 타입을 넣어서 사용하고 싶을때
    // 1) 제네릭 : <>
    var arr3 = arrayOf<Int>(10,20,30)
    var arr4 = arrayOf<String>("", "")

    // 2) 제공 함수
    var arr5 = intArrayOf(100,200,300)
    var arr6 = charArrayOf('a','b','c')

    // arrayOf() 를 비어있는 상태의 배열로 선언하고 싶다면
    // arrayOfNulls() 사용
    var arr7 = arrayOfNulls<Any>(9)

}