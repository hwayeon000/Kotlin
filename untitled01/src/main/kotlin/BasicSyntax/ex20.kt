package BasicSyntax

// 논리연산
// and / or
// and : 두 가지 조건을 다 만족 했을 경우 true
// or : 두 가지 조건중 하나라도 만족했을 경우 true
fun main() {

    val a = "남자"
    val b = 10

    // And : &&
    if(a == "남자" && b == 10){
        println("AND 만족")
    }else{
        println("AND 불만족")
    }

    // OR : || (shift + \)
    if(a == "남자" || b == 10){
        println("OR 만족")
    }else{
        println("OR 불만족")
    }




}