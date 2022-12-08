import java.util.Scanner

fun main() {

    val score1 = 150
    if (score1 > 150){
        println("150 이상")
    }else{
        println("150 미만")
    }
    // 나이를 입력받아서 성인인지 청소년인지 판단해보자
    val sc: Scanner = Scanner(System.`in`)
    print("나이를 입력해주세요 : ")
    val age = sc.nextInt()
    if (age >= 20){
        println("성인입니다")
    }else{
        println("청소년입니다")
    }

}