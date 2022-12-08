package BasicSyntax

fun main() {

    // 반복문 : while
    var count = 0
    while(count < 10){
        count++; // count = count + 1
        println(count)
        if(count > 10){
            break;
        }
    }

}