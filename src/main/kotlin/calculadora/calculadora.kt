package calculadora

fun main(args: Array<String>) {
    val n1: Int
    val n2: Int
    var operacao = ""
    var control = 0

    print("Digite a operação desejada (+, -, *, /): ")
    operacao = readLine().toString();
    println("Digite um valor: ")
    n1 = Integer.valueOf(readLine())
    println("Digite um valor: ")
    n2 = Integer.valueOf(readLine())
    if (operacao == "+") {
        println("O resultado da subtração é: " + (n1 + n2))
        control++
    }
    if (operacao == "-") {
        println("O resultado da subtração é: " + (n1 - n2))
        control++
    }
    if (operacao == "*") {
        println("O resultado da multiplicação é: " + n1 * n2)
        control++
    }
    if (operacao == "/") {
        println("O resultado da divisão é: " + n1 / n2)
        control++
    }
    if (control == 0) {
        println("Operação inválida, Tente novamente!")
    }
}

