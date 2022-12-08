package BasicSyntax

fun main() {
    var test1 : String = "a"
    var test2 : String = "b"

    test1 = test2
    println(test1) // good

    var test3 : String = "c"
    var test4 : String? = "d" // ? : test4는 null이 될 수 도 있다

    test3 = test4!! // !! : test4는 null이 아니다!!


}