fun main() {

    print("숫자 입력 >>")
    var userNum = readLine()!!.toInt()
    var factorial = 1

//    while (userNum > 0){
//        factorial *= userNum
//        userNum--
//    }

    // 쌤꺼
    while (true){
        // 반복시키고 싶은 동작
        factorial *= userNum
        userNum--
        //언제 멈출건지
        if (userNum==0) break
    }

    if (userNum<0) println("음수입니다....양수로 입력하세요...") else println("결과값 : $factorial")


}