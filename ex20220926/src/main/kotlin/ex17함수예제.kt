fun main() {

    var num1 = 24
    var num2 = 13
    val result = largerNumber(2, 2)
    println(result)

    val result2 = largerNumber2(num1, num2)
    println(result2)

}


fun largerNumber(num1:Int, num2:Int) : Any {
    var res = if (num1>num2) num1 else if (num2>num1) num2 else "같음"
    return res
}

fun largerNumber2(num1:Int, num2:Int) = if (num1>num2) num1 else if (num2>num1) num2 else 0
