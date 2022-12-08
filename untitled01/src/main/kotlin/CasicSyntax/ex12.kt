package CasicSyntax

// 데이터 클래스 (Data Class)
// 데이터를 넣어놓는 클래스

// 서버에서 데이터를 받아와서 넣어놓을때 많이 사용한다
fun main() {

    val justDog = JustDog("파트라슈",20)
    println(justDog.name)
    println(justDog.age)
    println(justDog)

    val dataDog = DataDog("팥들어슈",18)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())
}

class JustDog(var name:String, var age:Int)
data class DataDog(var name:String, var age:Int)