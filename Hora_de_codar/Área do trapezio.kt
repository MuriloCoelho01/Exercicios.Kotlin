fun main(){

    var base_maior: Int
    var base_menor: Int
    var altura: Int

        println("Digite o valor da base menor: ")
       base_menor = readln().toInt()

    println("Digite o valor da base maior: ")
    base_maior = readln().toInt()

    println("Digite o valor da altura: ")
    altura = readln().toInt()

println("A area do trapezio é: " + (base_maior + base_menor) * altura/2)
}
