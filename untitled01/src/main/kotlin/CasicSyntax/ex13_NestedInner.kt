package CasicSyntax.ex13_중첩

fun main() {
    // 중첩 클래스 (Nested Class) : 객체지향/캡슐화
    val test1 = Test1.NestedClass()
    test1.testFun1()

    // 내부 클래스 (Inner Class) : RecyclerView

}


class Test1{

    // 중첩 클래스에서는 변수를 선언해서 내부 클래스에서
    // 사용이 불가능 하다
    val text1 = "TestFun1"
    class NestedClass{
        fun testFun1(){
            println("TestFun1")
            // println(text1)
        }
    }

}

class Test2{

    val text2 = "TestFun2"
    inner class NestedClass2{
        fun testFun2(){
            println("TestFun2")
            println(text2)
        }
    }
}