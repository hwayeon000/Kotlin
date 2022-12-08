fun main() {

    // !! : readLine()에 입력값은 null이 아니다
    // ? : readLine()에 입력값은 null이 됦될 수도 있다


//    print("숫자 입력>>")
//    var num = readLine()!!.toInt()
//
//    var res = if (num > 0) "양수 값" else if (num < 0) "음수 값" else "0"

    print("숫자 입력>>")
    var num  = readLine()!!
    var res = if (num.equals("")) "(👉ﾟヮﾟ)👉null" else if (num.toInt() > 0) "양수 값" else if (num.toInt() < 0) "음수 값" else "0"
    println(res)


    



    var str : String?
    str = null
    print(str?.length ?: "(👉ﾟヮﾟ)👉null")


}