package AasicSyntax

fun main() {
    var num1 = 24
    var num2 = 13

    val result = largerNumber(num1, num2)
    println(result)
}

fun largerNumber(num1: Int, num2: Int) = if (num1>num2) num1 else num2
// fun sum(num1: Int, num2: Int) = println("안녕하세요")