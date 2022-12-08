fun main() {
    // Collection


    // MutableList : 가변 리스트
    // MutableMap
    // MutableSet

    //ArrayOf(크기){처음에 초기화 시킬 값}

    // 1. MutabelList 생성하기 -> 가변배열
    val testList1 = mutableListOf("a", "b", "c")
    // testList 크기 : 3
    // 2. MutableList에 데이터 추가하기 : add(추가 할 데이터 값)
    testList1.add("d")
    testList1.add(1, "a")
    println(testList1)

    // Map : python의 Dictionary, JSON과 비슷하게
    // Key 값과 Value 값을 가지는 데이터
    // 1. Map 생성하기
    val 떡잎방범대 = mutableMapOf<Int, String>()
    // 2. Map에 데이터 추가하기
    떡잎방범대[1] = "짱구"
    떡잎방범대[2] = "철수"
    떡잎방범대.put(3, "유리")
    떡잎방범대.put(4, "맹구")
    떡잎방범대.put(5, "훈이")
    // 3. for문 사용해 한번에 출력해보기
    for (i in 떡잎방범대) {
        println(i)
        // i의 Key값만 확인
        println(i.key)
        // i의 value값만 확인
        println(i.value)
    }

    // Set : 중복되는 데이터 없애주는 기능
    // 데이터 추가하는 기능 : add()
    // 데이터 삭제 키워드 : remove()
    // 1. Set 생성하기
    val testList2 = mutableSetOf("a", "b", "c")
    // 2. Set에 데이터 추가하기
    testList2.add("d")
    testList2.add("d")
    testList2.add("d")
    println(testList2)

}