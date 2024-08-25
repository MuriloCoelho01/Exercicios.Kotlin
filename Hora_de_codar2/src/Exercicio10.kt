fun main() {


    println("1 - Masculino")
    println("2 - Feminino")
    println("Digite o valor de acordo com seu sexo biologico: ")


    var sexo:Int = readln().toInt()


    println("Qual sua altura: ")
    var altura:Double = readln().toDouble()

  var homem: Double = (72.7 * altura) - 58
  var mulher: Double = (62.1 * altura) - 44.7




    if(sexo == 1){
        println("Sua altura ideal é: $homem")
    }
    else if(sexo == 2){
        println("Sua altura ideal é: $mulher")
    }

}