package AasicSyntax

fun main() {


    // if - else if 문
    // number라는 int자료형 변수를 사용자에게 입력받아서
    // 값이 0보다 크면 "양수 값" 출력
    // 값이 0보다 작으면 "음수 값" 출력
    // 그 외의 경우 "0"을 출력하는 코드를 작성하세요

    print("Enter the number : ")
    var number = readLine()!!.toInt()

    if (number > 0){
        println("양수 값")
    }else if(number < 0){
        println("음수 값")
    }else{
        println("0")
    }

    val result = if (number>0) "양수 값" else if(number<0) "음수 값" else "0"
    println(result)



}