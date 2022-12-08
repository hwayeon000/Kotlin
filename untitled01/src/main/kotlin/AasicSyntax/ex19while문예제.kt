package AasicSyntax

fun main() {

    print("숫자를 입력하세요 : ")
    var number = readLine()?.toInt()
    var factorial = 1;

    while (true){

        // 반복시키고 싶은 동작이 무엇인가요
        if (number != null) {
            factorial *= number
            number--
        }
        if (number == 0){
            break
        }
        // 곱하기 누적을 언제 멈출껀지

    }
    println("결과값 : $factorial")

}