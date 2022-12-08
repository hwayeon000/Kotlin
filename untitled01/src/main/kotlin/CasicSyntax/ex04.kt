package CasicSyntax

fun main() {

    // 이름이 j로 시작하는 사람
    val testList2 = listOf("john","jay","minsu","minju","bokchi")

    val result1 = testList2.filter {
        it.startsWith("j")
    }
    println(result1)

    // 짝수만
    val testList3 = listOf(1,2,3,4,5)
    val result2 = testList3.filter {
        it % 2 == 0
    }
    println(result2)

    val testList4 = listOf("a","aa","aaa","aaaa")

    val result3 = testList4.groupBy {
        it.length > 2
    }
    println(result3)
    println(result3[true])


}