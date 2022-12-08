package BasicSyntax

fun main() {
    // Filtering
    val testList1 = listOf("std1", "std2", "std3", "tea4", "tea5")
    println(testList1)
    // 첫 번째 글자가 s인 요소들만 filtering하고 싶다
    println(testList1.filter { it.startsWith("s") })

    // List에 Null이 포함되어 있다면?
    val testList2 = listOf("std1", "std2", "std3", "tea4", "tea5", null)
    println(testList2)
    // 첫 번째 글자가 s인 요소들만 filtering하고 싶다
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // Null인 요소를 빼고 Filtering을 진행한다
    println(testList2.filterNotNull().filter { it.startsWith("s") })

    // 오류를 보면 ? 와 !! 이건 무엇일까?
}