package BasicSyntax

fun main() {

    val testList1 = mutableListOf("a","b","c")

    val testIterator = testList1.listIterator()
    // Iterator :
    println(testIterator) // 참조값
    // 리스트의 다음 요소를 반환하고, 커서의 위치 이동
    println(testIterator.next()) // a
    println(testIterator.next()) // b
    println(testIterator.hasNext()) // 다음에 값이 있는가?
    println(testIterator.next()) // c
    println(testIterator.hasNext()) // false
    // println(testIterator.next()) : NoSuchElementException
    // previous() : 리스트의 이전 요소를 반환하고 커서 역방향 이동
    println(testIterator.previous()) // c
    println(testIterator.previous()) // b
    println(testIterator.previous()) // a

    while (testIterator.hasNext()){
        println(testIterator.next())
    }

}