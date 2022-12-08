package BasicSyntax

// 점수가 50점 이상인 사람들의 이름만 반복문과 조건문을 통해서 출력

fun main() {

    val student = mutableMapOf<Int, String>()
    student[99] = "영우"
    student[20] = "준섭"
    student[35] = "형"
    student[48] = "영표"
    student[100] = "수진"
    student[22] = "승현"
    student[45] = "보라"
    student[88] = "예호"
    student[91] = "명훈"
    student[87] = "병관"
    student[54] = "성관"
    student[42] = "해도"

    // 영우, 수진, 예호, 명훈, 병관, 성관
    for (i in student){
        // println(i)
        // println(i.key) key값 확인하기
        // println(i.value) value값 확인하기

        // 만약에 점수가(key) 50점 이상이라면?
        if(i.key>=50){
            // 이름을 출력하자
            // value값을 출력하자
            print(i.value+" ")
        }



    }






}