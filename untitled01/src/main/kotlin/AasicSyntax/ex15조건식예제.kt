package AasicSyntax

fun main() {

    print("금액을 입력하세요 >> ")
    var pay = readLine()!!.toInt()

    println("메뉴를 고르세요")
    print("[1]아우터(700원) [2]이구동성(1000원) [3]에그몽(500원) >>")
    var select = readLine()!!.toInt()

    var change : Int

    when(select){
        1 -> if (pay < 700) println("잔액이 부족합니다") else pay -= 700
        2 -> if(pay < 1000) println("잔액이 부족합니다") else pay -= 1000
        3 -> if(pay < 500) println("잔액이 부족합니다") else pay -= 500
        else -> println("메뉴를 다시 선택해 주세요")
    }

    println("잔돈 : $pay")
}