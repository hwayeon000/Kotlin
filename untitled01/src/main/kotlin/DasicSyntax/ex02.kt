package DasicSyntax

fun main() {

    println(sumTypeNumber(1,5))

}

fun sum(a:Int, b:Int):Int{
    return a+b
}

// val 함수명 = { 매개변수 -> 리턴하고싶은 데이터}
// val sumNumber = {a:Int, b:Int -> a+b}

// val 함수명 : 매개변수의 데이터타입 -> 리턴타입 = { 매개변수명 -> 리턴값 }
val sumTypeNumber : (Int, Int) -> Int = {a,b -> a+b}

fun sumString(a:String, b:String):String{
    return "String1 : $a String2 : $b"
}
// 람다식으로 한 번 바꿔보자!
val sumStringTwo = {a:String, b:String -> "String1 : $a String2 : $b"}
val sumStringType : (String, String) -> String = {a,b -> "String1 : $a String2 : $b"}