package AasicSyntax

fun main() {

    // if - else 문
    var num1 = 11
    var num2 = 24

    var max : Int

    if(num1 > num2)
        max = num1
    else
        max = num2

    println(max)

    // 간략화
    val max2 = if (num1 > num2) num1 else num2
    println(max2)

}