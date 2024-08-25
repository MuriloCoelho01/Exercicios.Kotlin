fun main(){
    var nome_usuario: String
    var idade: Int

    println("Qual seu nome?")
    nome_usuario = readln()

    println("Qual sua idade?")
    idade = readln().toInt()

    println("Olá $nome_usuario, sua idade é $idade")
}