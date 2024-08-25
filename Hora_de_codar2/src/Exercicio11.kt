fun main() {



    println("1 - adição")
    println("2 - subtração")
    println("3 - multiplicação")
    println("4 - divisão")
    println("Digite qual operação deseja fazer: ")
    var operação: Int = readln().toInt()



  if(operação == 1){
      println("Digite um valor: ")
      var valor1 = readln().toInt()

      println("Digite outro valor: ")
      var valor2 = readln().toInt()
   var soma:Int = valor1 + valor2
    println("$valor1 + $valor2 = $soma")
  }
    if (operação == 2) {
        println("Digite um valor: ")
        var valor1 = readln().toInt()

        println("Digite outro valor: ")
        var valor2 = readln().toInt()
        var soma: Int = valor1 - valor2
        println("$valor1 - $valor2 = $soma")
    }

    if (operação == 3) {
        println("Digite um valor: ")
        var valor1 = readln().toInt()

        println("Digite outro valor: ")
        var valor2 = readln().toInt()
        var soma: Int = valor1 * valor2
        println("$valor1 x $valor2 = $soma")
    }
    if (operação == 4) {
        println("Digite um valor: ")
        var valor1 = readln().toInt()

        println("Digite outro valor: ")
        var valor2 = readln().toInt()
        var soma: Int = valor1 / valor2
        println("$valor1 / $valor2 = $soma")

        
    }

}

