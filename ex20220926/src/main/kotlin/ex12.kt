fun main() {

    // 자판기 만들기
    print("금액입력>>")
    var money = readLine()!!.toInt()

    print("메뉴를 고르세요.\n [1]아우터(700원) [2]이구동성(1000원) [3]에그몽(500원) >>")
    var choice = readLine()!!.toInt()

    // choice가 뭔지 먼저 판단
    var price = 0
    when (choice){
        1 -> price = 700
        2 -> price = 1000
        3 -> price = 500
        else -> print("없는 메뉴입니다.")
    }
//    when (choice){ 1 -> price = 700; 2 -> price = 1000; 3 -> price = 500; else -> print("없는 메뉴입니다.")}
    if (money >= price) println("잔돈 : ${money-price}") else print("잔액부족, 잔돈 : $money")


//    var res = money
//    when (choice){
//        1 -> if (money >= 700) res = money - 700 else print("잔액부족 ")
//        2 -> if (money >= 1000) res = money - 1000 else print("잔액부족 ")
//        3 -> if (money >= 500) res = money - 500 else print("잔액부족 ")
//        else -> print("없는 메뉴입니다.")
//    }
//    println("잔돈 : $res")

}