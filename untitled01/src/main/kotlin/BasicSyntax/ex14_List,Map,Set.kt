package BasicSyntax

fun main() {

    // MutableListOf
    // MutableMapOf
    // MutableSetOf

    // List를 만들어보자
    val testList1 = listOf("a","b","c")
    // 현재 testList1의 크기 : 3
    // 계속 3의 크기로 고정이 된다
    println(testList1)
    println(testList1[0])

    // mutableList를 만들어보자
    val testList2 = mutableListOf("a","b","c")
    // 현재 testList2의 크기 : 3
    println(testList2)
    // testList2의 크기 : 4
    // 가변 배열이다
    testList2.add("d")
    println(testList2)


    // Map
    val 떡잎방범대 = mutableMapOf<Int, String>()
    // Map에 데이터를 입력할 때 키워드 : put
    떡잎방범대.put(1,"짱구")
    떡잎방범대.put(2,"철수")
    떡잎방범대.put(3,"유리")
    떡잎방범대.put(4,"맹구")
    떡잎방범대.put(5,"훈이")
    // python에 dictionary, JSON과 비슷하게 Key, Value값을 같는 데이터
    println(떡잎방범대[5])
    println(떡잎방범대[1])
    // 한번에 출력해서 확인해보기
    for(i in 떡잎방범대){
        println(i)
        println(i.key) // key값 확인하기
        println(i.value) // value값 확인하기
    }

    // Set
    val testList3 = mutableSetOf("a","b","c")
    testList3.add("d")
    println(testList3)
    testList3.add("d")
    testList3.add("d")
    testList3.add("d")
    println(testList3)
    // Set : 중복되는 데이터는 없애주는 기능을 가지고 있음
    // 값을 지우는 키워드 : remove

}