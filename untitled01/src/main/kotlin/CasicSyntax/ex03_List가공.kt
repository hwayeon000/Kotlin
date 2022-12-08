package CasicSyntax

fun main() {
    // List 가공

    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(1)
    testList1.add(10)
    testList1.add(11)
    testList1.add(10)
    testList1.add(15)
    testList1.add(15)

    // 중복 제거하기
    println(testList1.distinct())

    // 큰값과 작은값
    println(testList1.maxOrNull())
    println(testList1.minOrNull())

    // 평균값 구하기
    println(testList1.average())

}