fun main() {

    println("Digite um valor: ")
    var num1: Int = readln().toInt()

    println("Digite outro valor: ")
    var num2: Int = readln().toInt()

    if (num2 <= 0) {
        println("numero invalido")
        println("Digite outro valor:")
        num2 = readln().toInt()
    }
var conta:Double = (num1 / num2)

    println("O resultado da divisão é igual a $conta ")
}
