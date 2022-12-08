package BasicSyntax

fun main() {
    // 문자열 가공
    // 유저가 입력한 데이터를 가공하거나
    // 서버에서 가져온 데이터를 알맞게 가공해서 쓸 때

    val testString = "동해물과 백두산이 마르고 닳도록"
    val newString = testString.split(" ")
    println(newString)

    // lastIndex : 인덱스 마지막 값
    val splitString = testString.substring(0,testString.length)
    println(splitString)

}