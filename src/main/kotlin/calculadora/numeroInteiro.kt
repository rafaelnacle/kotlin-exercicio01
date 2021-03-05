package calculadora

fun main() {
    numeroDivisivel(5)
}

fun numeroDivisivel(arg: Int){
    if (arg%3 == 0){
        println("Fa")
    } else if (arg%5 == 0){
        println("Cec")
    } else if (arg%3 == 0 && arg%5 == 0){
        println("Facec")
    } else{
        println(arg)
    }
}

