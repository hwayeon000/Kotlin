package BasicSyntax

fun main() {

    val testList = listOf("a","b","c","d","e","f")
    for(i in testList){
        println(i)
    }

    // for문을 사용해서 1 ~ 10까지 출력하기
    for (i in 1..10){
        println(i)
    }
    // for문을 사용해서 1 ~ 10까지 2씩 증가하는 값 출력
    for (i in 1..10 step 2){
        println(i)
    }



}