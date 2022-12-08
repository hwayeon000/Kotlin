fun main() {

    // 1. Array() 사용하기
    // 1) Array() 생성하는 방법
    // var array = Array(사이즈, {들어갈 값})
    // var array = Array(사이즈){들어갈 값}

    // 1-1) 사이즈는 10, 각 자리에는 지금 빈 값이라고 볼 수 있는
    // 0을 넣어주는 배열을 만들자
    var array1 = Array(10, {0})

    for (elememt in array1){
        print("${elememt} ")
    }

    // 1-2) 사이즈는 10이고 각 자리에 인덱스 값 *3의 값이 들어가게 해보자
//    var array2 = Array(10){i -> (i+1) * 3}
    var array2 = Array(10){i -> i * 3}

    // 1-2) 사이즈는 5이고 각 자리에 공백
    var array3 = Array(5){""}

    // 2. Array()에 특정 데이터값을 지정하고 싶을 경우
    // 2-1) 제네릭 : ArrayList<String>
    var array4 = Array<String>(5){""}
    // 2-2) 코틀린이 제공하는 기본타입 배열(클래스)
    var array5 = IntArray(10){0}
    // 자료형+Array

    // array2 get, set
    array2[0] = 100
    array2.set(1, 200)  // set(인덱스 값, 데이터 값)

    println( array2.get(1) )




}

