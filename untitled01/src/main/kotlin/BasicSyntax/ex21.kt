package BasicSyntax

fun main() {
    val student = mutableMapOf<Int, String>()
    student[99] = "꽃사슴"
    student[20] = "준섭"
    student[35] = "캥거루"
    student[48] = "영표"
    student[100] = "수진"
    student[22] = "승현"
    student[45] = "코끼리"
    student[88] = "예호"
    student[91] = "명훈"
    student[87] = "병관"
    student[54] = "성관"
    student[42] = "해도"

    // 학생들 중에, 점수가 50점 이상이고 and 학생의 이름길이가 3이상인 친구들의 이름을 출력해라
    // 이름의 길이를 알 수 있는 방법
    // 이름 : value값
    // value값에 접근해서 length를 입력!
    for(i in student){
        if (i.key >= 50 && i.value.length > 2){
            println(i.value)
        }
    }

}