package DasicSyntax

fun main() {

    val test5 = TestObjectClass()
    val test6 = TestObjectClass()

    test5.plusBtn()
    println(TestObjectClass.number)
    test5.plusBtn()
    println(TestObjectClass.number)
    test6.minusBtn()
    println(TestObjectClass.number)
}


class TestObjectClass{

    companion object {
        var number = 0
    }

    fun plusBtn(){
        number++
    }

    fun minusBtn(){
        number--
    }

}