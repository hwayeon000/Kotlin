package DasicSyntax

fun main() {
    // 고차함수 (Higher-Order Function)
    // f(x) = x
    // f(f(x)) = x 와 같은 형태

    println(testSum(1,2))
    println(testLambdaSum1(1,5))
}

fun testSum(a : Int, b : Int) : Int {
    return a+b
}

val testLambdaSum1 = {a : Int, b : Int -> a+b}
val testLambdaSum2 : (Int, Int) -> Int = {a,b -> a+b}