package CasicSyntax

fun main(){

    val c = Calculator()
    c.sumNumber(1,2)
    c.sumNumber(1,2,3)
    c.sumNumber("나는", "행복")
}

class Calculator(){

    fun sumNumberTwo(a : Int, b : Int) {
        println(a+b)
    }

    fun sumNumberThree(a : Int, b:Int, c:Int) {
        println(a+b+c)
    }

    fun sumNumber(a : Int, b : Int) {
        println(a+b)
    }

    fun sumNumber(a : Int, b : Int, c: Int) {
        println(a+b+c)
    }

    fun sumNumber(str1 : String, str2: String) {
        println(str1+str2)
    }

}
