fun main() {

    // when문 변수 x의 값이 1 또는 2와 일치하는지 확인
    print("숫자입력>>")
    var x = readLine()!!.toInt()

    // when문은 마지막에 꼭 else문을 사용해야 한다!!
    when (x){
        // 값 -> 값이 일치할 경우 실행시킬 문장
        1 -> println("x는 1입니다.")
        2 -> println("x는 2입니다.")
        else -> println("x는 1과 2가 아닙니다.")
    }


    print("in 숫자입력>>")
    var number = readLine()!!.toInt()
    // 입력받은 숫자(number)가 10 ~ 20 사이의 수인지 판단
    when (number){
        // in : 범위를 지정하는 키워드
        in 10..20 -> println("10~20 사이의 수")
        else -> println("결과 : $number")
    }


    var str = "안뇽안뇽"
    when(str){
        // is : 데이터 타입이 뭔지 판단, 특정 자료형을 검사
        is String -> println("(👉ﾟヮﾟ)👉is 문자열")
//        is Interger -> println("정수 ╰(*°▽°*)╯")
        else -> println("문자열이 아닙니다.")
    }


}