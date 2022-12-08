fun main() {

    // x가 1이거나 2라면 "x는 1 또는 2 입니다."
    print("숫자입력>>")
    var x = readLine()!!.toInt()

    when(x){
        // 1, 2 : 1이거나 2에 해당하는지 판단
        1 , 2 -> print("x는 1 또는 2 입니다.")
        else -> println("결과 : $x")
    }


}