package CasicSyntax

fun main() {

    // 오버로딩 (overloading)
    // : 같은 클래스 내에서 매개변수는 다르고 메서드 명이 같은 메서드
    Iam().paramsString("문자열")
    Iam().paramsInt(123)

}


class Iam{

    fun paramsString(a : String){
        println("I am String")
    }
    fun paramsInt(a : Int){
        println("I am Integer")
    }

}