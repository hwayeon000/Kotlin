fun main() {

    // 5 ~ 15 출력(for문을 통해)
    for (x in 5..15) print("${x} ")

    println(" ")

    // 15 ~ 1 출력(-1씩 감소)
    // .. 대신에 downTo(-1)
    for (x in 15 downTo 1) print("${x} ")

    println(" ")

    // 1 ~ 50 홀수만 출력
    // 1, 3, 5, 7, 9 ... 49

    // x in 1..49 step 2
    // step: 시작점에서 도착점까지 얼마만큼 보폭으로 이동할건지
    for (x in 1 .. 49 step 2) print("${x} ")

    println(" ")

    // 50 - 1 짝수만
    // 50, 48, 46, 44, 42 ...
    // x in 50 downTo 1 step 2
    for (x in 50 downTo  1 step 2) print("${x} ")

    println(" ")

    // 1 - 100 홀수 더하기
    var add_odd = 0
    for (x in 1 .. 99 step 2) add_odd += x
    print("홀수의 합 : $add_odd")

    println(" ")

    // 1 - 100 짝수 더하기
    var even_add = 0
    for (x in 2 .. 100 step 2) even_add += x
    print("짝수의 합 : $even_add")
    
}