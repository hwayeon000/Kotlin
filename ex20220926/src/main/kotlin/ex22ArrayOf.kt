import java.awt.Button

fun main() {

    // arrayOf() 사용하기
    // : 특정한 값을 넣어서 배열을 생성하는 경우 사용
    // int[] arr = {1,2,3,4,5}
    var arr = arrayOf(1, 2, 3)

    // : 특정 타입을 지정하지 않은 상태로 배열을 생성하면
    // 어떤 값이 들어가도 상관없음
    var arr2 = arrayOf(1, "가", true, 3.141592)

    // 특정한 데이터 타입을 지정해 주고 싶다면
    // 1) 제네릭 <>
    var arr3 = arrayOf<Int>(1, 20, 30)
    // 2) 코틀린 제공 함수
    var arr4 = intArrayOf(100, 200, 300)
    var arr5 = charArrayOf('c', 'd', 'e')

    // arrayOfNulls() 사용
    // arrayOf()를 비어있는 상태의 배열로 선언하고 싶다면
//    var arr6 = arrayOfNulls<Button>(10)


    // first() : 첫 번쨰 요소 확인
    arr4.first()
    println(arr4.first())

    // last() : 마지막 요소 확인
    arr4.last()
    println(arr4.last())
    // average() : 배열의 평균 값 출력
    println(arr4.average())
    // sum() :  요소를 합산하는 메서드
    // count() : 요소의 개수를 알려주는 메서드


}