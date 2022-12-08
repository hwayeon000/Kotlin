import java.lang.NumberFormatException

fun main() {

    print("숫자 입력>>")
    var num  = readLine()!!
    var res = if (num.equals("")) "문자열" else if (num.toInt() > 0) "양수 값" else if (num.toInt() < 0) "음수 값" else "0"
    println(res)


    // 예외처리~

    print("숫자 입력>>")
    var num1  = readLine()!!

    try{
        var num2 = num1.toInt()
        if (num2 > 0){
            println("양수")
        }else{
            println("음수")
        }
    } catch (e : NumberFormatException){
        println("(👉ﾟヮﾟ)👉 문자열입니다.")
    }


}