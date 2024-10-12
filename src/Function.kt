package Hotel


var nome_hotel = "Toca dos Coelhos"
val senha = 2678
var usuario = ""
var listaHospedes = mutableListOf<String>(

)
val ocupado = mutableListOf<String>(
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre")


fun main() {

    println("Digite seu nome:")
    usuario = readln()


    println("Digite sua senha:")
    var senha2  = readln().toIntOrNull()

    while(senha2 != senha){
        println("senha invalida!")
        println("digite novamente: ")
        senha2 = readln().toIntOrNull()

    }
    if (senha2 == senha){
        inicio()
    }}

fun inicio() {
    println("")
    println("Bem vindo ao $nome_hotel, $usuario. É um imenso prazer ter você por aqui!")
    println("")
    println("Escolha uma opção:")
    println("")
    println("1 - Cadastrar Quartos")
    println("2 - Cadastrar Hospedes")
    println("3 - Abastecimento de Automóveis")
    println("4 - Sair do $nome_hotel")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> AbastecimentoDeAutomoveis()
        4 -> sairDoHotel()
        else -> erro()
    }
}

fun cadastrarQuartos() {
    println("""Cadastro de Quartos
            Selecione uma opção:
            1. Cadastrar
            2. Pesquisar
            3. Sair""")

    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> cadastrarquartos1()
        2 -> pesquisaquartos()
        3 -> sairCadastroDeHospedes()
        else -> erroCadastroDeHospedes()
    }


}
fun cadastrarquartos1(){
    println("Qual o padrão valor da diária")
    var valordiaria = readln().toInt()
    while(valordiaria < 0){
        println("Valor invalido!")
        cadastrarQuartos()
    }


    println("Quantos dias você ficará hospedado?")
    var diaria = readln().toInt()
    while (diaria > 30){
        println("Valor invalido!")
        println("Escolha um valor entre 1 e 30")
        cadastrarQuartos()

    }

    println("Nome do cliente")
    var cliente = readln()
    listaHospedes.add(cliente)


    var m = 1
    println("Os quartos livres são:")
    println("")

    for (i in ocupado) {
        println("Quarto $m está $i")
        m++
    }


    println("Qual quarto você deseja?")
    var escolha_quarto = readln().toInt()

    println("a reserva em nome de $cliente, de $diaria dias, no quarto $escolha_quarto ficará ${diaria*valordiaria}R$ ")


    println("Deseja confirmar?")
    println("")
    println("(Sim/Não")
    println("1 - SIM")
    println("2 - NÃ")
    var confirm = readln().toInt()

    when(confirm){
        1 -> quartos2(escolha_quarto)
        2-> cadastrarQuartos()

    }

    inicio()

}
fun quartos2(escolha_quarto: Int){
    if (escolha_quarto in 1..20){
        if (ocupado[escolha_quarto - 1] == "livre"  ){
            ocupado[escolha_quarto - 1] = "ocupado"

            println("Quarto reservado com sucesso!")

        }
        else if (escolha_quarto in 1..20){
            if(ocupado[escolha_quarto - 1]== "ocupado"){
                println("")
                println("Quarto indisponivel!")
                println("")
                println("Escolha outro quarto")
                println("")
                cadastrarQuartos()
            }
        }

    }

}
fun pesquisaquartos(){
    var m = 1
    println("Os quartos livres são:")
    println("")

    for (i in ocupado) {
        println("Quarto $m está $i")
        m++
    }
    println("")
    println("")
    println("")
cadastrarQuartos()
}


fun AbastecimentoDeAutomoveis() {

}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Deseja sair?")
    println("")
    println("1 - sim")
    println("2 - não")
    val escolha = readln().toIntOrNull()
    when(escolha){
        1 -> sair2()
        2 -> inicio()
    }

}

fun sair2(){
    println("Muito obrigado $usuario, é um prazer ter você por aqui!")
    main()

}

