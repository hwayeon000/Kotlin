package AasicSyntax

fun main() {

    for (x in 1..5){ // in과 범위 지정을 활용한 반복
        println(x) // 본문
    }

    for (x in 5 downTo 1){
        println(x)
    }

    for (x in 1..10 step 2){
        println(x)
    }


}