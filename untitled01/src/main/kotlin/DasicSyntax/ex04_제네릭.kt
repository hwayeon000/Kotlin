package DasicSyntax

fun main() {
    // 제네릭(generic)
    // 컴파일 시에 타입 체크를 할 수 있다
    // 타입 캐스팅이 필요없다

    // val box1 = Box1(10)
    // println(box1.value)

    val box2 = Box2("문자 10")
    println(box2.value)
    // box1에서 문자열을 출력해보고 싶다면?

    val box1 = Box1("10".toInt())
    println(box1.value)
    // 너무나 번거로운 작업

    // val box3 = Box3(10)
    val box3 = Box3("문자")
    println(box3.value)

}


class Box1(test : Int){
    var value = test
}
class Box2(test:String){
    var value = test
}

/////////////////////////////////////

class Box3<T>(test : T){
    var value = test
}

// 적극적으로 활용을 하기위해 설명 x
// 남이 작성한 코드를 해석할 수 있게 하기위해 알아야하는 부분



