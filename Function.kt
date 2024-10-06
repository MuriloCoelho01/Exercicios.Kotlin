package Hotel


var nome_hotel = "Toca dos Coelhos"
val senha = 2678
var usuario = ""
var lista_usuario = mutableListOf<String>()


fun main() {

    println("Digite seu nome:")
    usuario = readln()
    lista_usuario.add(usuario)

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
    val lista_de_quartos = listOf<Int>(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        14,
        15,
        16,
        17,
        18,
        19,
        20
    )
    var ocupado = mutableListOf<String>(
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
        "livre",)


    println("")
    println("")
    println("")
    println(" $usuario o valor da diária é 100R$!")
    println("")
    println("Os quartos livres são:")
    for (i in lista_de_quartos) {
        println("quarto: $i")
    }
    println("Qual quarto você deseja?")
    var escolha_quarto = readln().toInt()

    when (escolha_quarto) {
        1 -> ocupado[0] = "ocupado"
        2 -> ocupado[1] = "ocupado"
        3 -> ocupado[2] = "ocupado"
        4 -> ocupado[3] = "ocupado"
        5 -> ocupado[4] = "ocupado"
        6 -> ocupado[5] = "ocupado"
        7 -> ocupado[6] = "ocupado"
        8 -> ocupado[7] = "ocupado"
        9 -> ocupado[8] = "ocupado"
        10 -> ocupado[9] = "ocupado"
        11 -> ocupado[10] = "ocupado"
        12 -> ocupado[11] = "ocupado"
        13 -> ocupado[12] = "ocupado"
        14 -> ocupado[13] = "ocupado"
        15 -> ocupado[14] = "ocupado"
        16 -> ocupado[15] = "ocupado"
        17 -> ocupado[16] = "ocupado"
        18 -> ocupado[17] = "ocupado"
        19 -> ocupado[18] = "ocupado"
        20 -> ocupado[19] = "ocupado"
        else -> println("Escolha de quarto inválida")
    }
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

fun cadastrarHospedes(){}