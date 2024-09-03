import kotlin.system.exitProcess


var saldo:Double = 100.0
var nome = ""


fun main() {
    println("Digite seu nome: ")
     nome = readln()
    println("")
    println("Olá $nome, seja bem vindo;")
    inicio()

}



fun inicio() {

    println("")
    println("Escolha uma opção")
    println("")
    println("1 - Ver seu saldo")
    println("2 - Ver extrato")
    println("3 - Realizar um saque")
    println("4 - Realizar um deposito ")
    println("5 - Fazer transferencia")
    println("6 - Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> extrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair()
        else -> erro()
    }
}


fun verSaldo() {

    println("")
    println("$nome seu saldo atual é: R$$saldo reais")
    inicio()
}




fun extrato(){
    println("$nome, seu Extrato Bancário:")
    println("=================")
    println("Data       | Descrição                  | Valor")
    println("-------------------------------------------------")
    println("01/08/2024 | Depósito Inicial            | R$ 1.000,00")
    println("05/08/2024 | Compra em Supermercado      | -R$ 150,00")
    println("10/08/2024 | Transferência Recebida      | R$ 200,00")
    println("15/08/2024 | Pagamento de Conta de Luz    | -R$ 80,00")
    println("20/08/2024 | Compra Online                | -R$ 120,00")
    println("25/08/2024 | Depósito Adicional           | R$ 300,00")
    println("-------------------------------------------------")
    println("Saldo Atual:                       | $saldo")
    println("========================================================")
    inicio()
}



fun fazerDeposito() {
    println("Qual o valor para depósito? ")
    var deposito = readln().toDoubleOrNull()
    println("")
    println("")

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    }
else if (deposito == 0.0 || deposito <0 ){

        println("Por favor, informe um número válido.")
        println("")
    println("Seu saldo é $saldo")

        fazerDeposito()
    }
else {
    saldo += deposito
    println("Seu saldo é $saldo")
   inicio()


    }
}




fun fazerSaque() {
    println("")
    println("$nome seu saldo atual é: R$$saldo reais")
    println("")
    println("Qual o valor para saque? ")
    var saque = readln().toDoubleOrNull()

    if (saque == null) {
        println("")
        println("$nome seu saldo atual é: R$$saldo reais")
        println("")
        println("Por favor, informe um número válido.")
        fazerSaque()
    }

    else if (saque > saldo){
        println("")
        println("Operação não autorizada, saldo insuficente.")
    fazerSaque()
    }
else if(saque <= 0){
    println("")
    println("Operação não autorizada")
        fazerSaque()
}
    else if(saque <= saldo){
        saldo -= saque
        verSaldo()
    }
}




fun fazerTransferencia() {

    println("")
    println("Qual o numero da conta que deseja transferir? ")
    var conta = readln().toInt()

    println("")
    println("Qual o valor que deseja transferir? ")
    var tranferencia:Double = readln().toDouble()


    if (tranferencia <= 0){
        println("")
        println("Operação não autorizada, saldo insuficente.")
        fazerTransferencia()

    }

    println("")
    println("Digite a senha de 4 digitos:")
    var senha:Int = readln().toInt()

    while(senha != 3589){
        println("Senha incorreta, digite novamente")
        senha = readln().toInt()
    }


    if (senha == 3589 ){
        println("Transação concluida com sucesso.")
        saldo -= tranferencia
        println("")
        println("$nome seu saldo atual é: R$$saldo reais")
    }
    else if (senha == null){
        println("Por favor, informe uma senha válida.")
        fazerTransferencia()
    }
    inicio()
}



fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}




fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readln().toUpperCase()

    when (confirma) {
        "S" -> sair2()
        "N" -> inicio()
        else -> sair()
    }
}
fun sair2(){
    println("")
    println("Muito obrigado, $nome!foi um prazer ter você por aqui!")
    exitProcess(0)
}

