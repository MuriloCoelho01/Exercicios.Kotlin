fun main() {
    var list = mutableListOf<Int>()

    println("Digite um numero")
    var num1: Int = readln().toInt()
    println("Digite outro numero:")
    var num2: Int = readln().toInt()

    println("")

    if (num1 >= num2) {
        println("Numero invalido")

        println("Digite outro valor que seja menor que o segundo numero informado:")
        num1 = readln().toInt()
    }

    for (i in num1..num2) {
        list.add(i)
    }

    println("A média aritimetica entre todos os valores informado é: " + list.sum() / list.count())
}