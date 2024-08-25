fun main(){
    var diagonal_maior: Int
    var diagonal_menor:Int

    println("Digite o valor da diagonal maior: ")
    diagonal_maior = readln().toInt()

    println("Digite o valor da diagonal menor: ")
    diagonal_menor = readln().toInt()

    println(" A área do Losango é: " + diagonal_maior * diagonal_menor / 2)
}