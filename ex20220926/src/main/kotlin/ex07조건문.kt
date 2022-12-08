fun main() {

    // if - else
    var num1 = 11
    var num2 = 24

    var result : Int /// 큰 수가 담길 변수
    if (num1 > num2){
        result = num1
    }else{
        result = num2
    }
    println("큰 수 : $result")


    // 위의 if - else 간략화 하기
    // if문 실행 코드가 한 줄이면 중괄호 생략 가능
    var result2 = if (num1 > num2) num1 else num2

    println("큰 수22 : $result2")


}