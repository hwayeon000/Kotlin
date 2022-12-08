package AasicSyntax

fun main() {
    // Array() 사용하기
    // 1) Array() 생성하기
    // var array = Array(사이즈,{들어갈 값})
    // var array = Array(사이즈){ 들어갈 값 }

    // 1-1) 사이즈는 10이고 각 자리에는 지금 빈 값이라고 할 수 있는 0이 들어가 있는 상태
    var array1 = Array(10) { 0 }

    for (i in array1){
        print("$i ")
    }

    // 1-2) 사이즈는 10이고 각 자리에 인덱스 값 * 3의 값이 들어가게 해보자
    var array2 = Array(10){i -> i*5}

    // 1-3) 사이즈는 5이고 각 자리에는 공백이 들어가 있음
    var array3 = Array(5){""}

    // 2) Array에 특정 타입을 지정하고 싶을 경우
    // 2-1) 제네릭 : <>
    var array4 = Array<Int>(4){0}
    var array5 = Array<String>(5){""}
    // 2-2) 코틀린이 제공하는 기본타입 클래스
    var array6 = IntArray(10,{0})
    // ByteArray(),CharArray()...

    // ctrl + Array() 누르면 설계도를 확인 할 수 있는데
    // get,set을 봐보자!

    array1[0] = 100 // array[인덱스] = 넣을 값
    array1.set(1,50) // array.set(인덱스, 값)

    array1.get(0) // array.get(인덱스)
    println(array1[1]) // array[인덱스]



}