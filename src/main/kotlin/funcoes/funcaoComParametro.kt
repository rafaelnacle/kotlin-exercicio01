package funcoes

fun main() {
    val resultado = funcaoComParametros(
        arg = "Ronald",
        arg2 = "McDonald"
    )
    println(resultado)
}

fun funcaoComParametros(arg: String, arg2: String): String {
    return arg + " " + arg2;
}
