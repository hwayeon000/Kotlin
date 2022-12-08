package BasicSyntax

fun main() {

    // List 만들기1
    val testList1 = ArrayList<String>();
    testList1.add("a") // index : 0
    testList1.add("b") // index : 1
    testList1.add("c") // index : 2

    // List 만들기2
    val testList2 = listOf<String>("a","b","c")
    // 들어가는 데이터에 따라 자동으로 List의 자료형을 결정해 준다!
    val testList3 = listOf("A","B","C")

    // List 만들기3
    // MutableList : ArrayList와 똑같은 추가, 삭제가 가능한 List자료형
    val testList4 = mutableListOf("a","b","c")
    println(testList4)


}