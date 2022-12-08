package CasicSyntax

fun main() {
    // Any
    // 이름처럼 아무거나 할 수 있는 느낌?
    // java -> object
    // 모든 클래스의 최상위 클래스

    var str1 : String = "abc"
    println(str1)
    str1 = "cda"
    println(str1)
    // str1 = 123

    var str2 : Any = "abc"
    println(str2)
    str2 = 123
    println(str2)

    // is : 맞는지 확인하는 용도

    var str3 : Any = "abc"
    if(str3 is String){
        println("This is String")
    }else{
        println("This is not String")
    }

    var str4 : Any = "abc"

    when(str4){
        is Int -> {
            println("This is int")
        }
        is String -> {
            println("This is String")
        }
    }

    // as : 타입변경 체크 용도


}