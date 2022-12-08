package AasicSyntax

fun main() {

    // 배열 관련 API
    // 코틀린 표준 라이브러리 Array의 유용한 메서드

    var arr = arrayOf(1,12,15,24,0,5,8)


    // 1) first() : 첫 번째 요소 확인
    println(arr.first())
    // 2) last() : 마지막 요소 확인
    println(arr.last())
    // 3) average() : 배열의 평균 값 출력
    println(arr.average())
    // 4) count() : 요소 개수
    println(arr.count())
    // 5) sum() : 요소를 합산하는 메서드
    println(arr.sum())

}