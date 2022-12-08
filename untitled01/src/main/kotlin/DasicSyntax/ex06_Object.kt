package DasicSyntax

import org.jetbrains.annotations.TestOnly

fun main() {

    // object -> 싱글톤패턴
    // 디자인 패턴
    // : 코드를 어떻게 짜는게 더 좋을지,
    //   어떤 방식으로 구성해야 유지보수가 좋은지
    // 싱글톤 패턴 : 객체를 한개만 생성하도록 한다

    var test1 = TestClass()
    var test2 = TestClass()

    test1.count = 10
    println(test1.count) // 10
    println(test2.count) // 0

    val test3 = testObject
    val test4 = testObject

    test3.count = 50
    println(test3.count)
    println(test4.count)
    // 싱글톤 패턴에서는 객체를 여러개 만들어도
    // 하나 처럼 사용이 가능하다.
    // 즉, 객체를 하나만 선언할 수 있다.


}

object testObject{
    init {
        println("testObject")
    }
    var count = 0;
}


class TestClass{
    init {
        println("testClass")
    }

    var count = 0

}