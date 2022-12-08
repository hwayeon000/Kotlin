import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {

    // 자료형 : 자바와 유사, 단 첫번째 글자가 대문자!
    // Boolean, Char, Byte, Int ...
    // String

    val isHot : Boolean = true

    // 형변환
    // int ---> String : toSting()
    val num1 : Int = 56
    val str1 : String = num1.toString()

    // Double ---> Float : toFloat()
    val num2 : Double = 3.14
    val num3 : Float = num2.toFloat()
    val num4 : Float = 3.14f


    // 스마트 캐스트
    // 내가 저장하고 싶은 값이 정수일 수도 있고, 실수일 수도 있다면?
    // Number : int, float, double 숫자 자료형은 다 담을 수 있는 데이터타입
    var score : Number = 12.2
    println(score::class.java.simpleName)
    // 자료형 확인
    score = 20
    println(score::class.java.simpleName)

    // Any 자료형 : JAVA에서 Object와 비슷한 개념
    // 최상위 자료형 ===> Any
    var test : Any = "박화연"
    println("'박화연'의 자료형 : " + test::class.java.simpleName)  // "박화연"이 대입된 test의 자료형
    test = 12
    println("'12'자료형 : " + test::class.java.simpleName) // 12가 대입된 test 자료형





}