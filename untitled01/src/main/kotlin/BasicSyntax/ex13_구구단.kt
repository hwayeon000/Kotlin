package BasicSyntax

fun main() {

    // 2단 : 2*1 = 2 .... 2*9 = 18
    // 3단 : 3*1 = 3 .... 3*9 = 27
    // ...
    // 9단 : 9*1 = 9 .... 9*9 = 81

    for(i in 2..9){
        print("$i 단 : ")
        for (j in 1..9){
            print("$i*$j = "+i*j+" ")
        }
        println()
    }

}