package Hotel


var nome_hotel = "Toca dos Coelhos"
val senha = 2678
var usuario = ""
var listaHospedes = mutableListOf<String>(
)
var pessoas_eventos = 0
var dia_evento = ""
var hora_evento = 0
var empresa =""
var garçom = 0
var horario_eventos1 = 0
var custogarçom = 0.0
var contagem_garçom = 0
var custoTotal=0.0
var listaDeEmpresas = mutableListOf<String>()
var listaValor = mutableListOf<Double>()

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
    println("4 - Eventos")
    println("5 - Ar condicionado")
    println("6 - Sair do $nome_hotel")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> AbastecimentoDeAutomoveis()
        4 -> eventos()
        5 -> arCondicionado()
        6 -> sairDoHotel()
        else -> erro()
    }
}



fun AbastecimentoDeAutomoveis(){
    println("ABASTECER OS CARROS - ${usuario.uppercase()} ")

    var Tanque = 42.0
    println("Qual o valor do ácool no posto Wayne Oil?")
    var AlcoolWayne = readln()!!.toDouble()
    println("Qual o valor da gasolina no posto Wayne Oil?")
    val precoGasolinaWayne = readln()!!.toDouble()

    println("Qual o valor do ácool no posto Stark Petrol?")
    var AlcoolStark = readln()!!.toDouble()
    println("Qual o valor da gasolina no posto Stark Petrol?")
    val GasolinaStark = readln()!!.toDouble()

    val postoWayne = calcularMelhorCusto(AlcoolWayne, precoGasolinaWayne)
    val postoStark = calcularMelhorCusto(AlcoolStark, AlcoolStark)

    val custoWayne = if(postoWayne == "álcool"){
        AlcoolWayne * Tanque
    } else {
        GasolinaStark * Tanque
    }

    val custoStark = if(postoStark == "álcool"){
        AlcoolStark * Tanque
    } else {
        GasolinaStark * Tanque
    }

    if(custoWayne < custoStark){
        println("$usuario, é mais barato abastecer com $escolhaFinal no posto Wayne Oil.\n")
        inicio()
    }else if (custoStark < custoWayne){
        println("$usuario, é mais barato abastecer com $escolhaFinal no posto Stark Petrol.\n")
        inicio()
    }else {
        println("Ambos postos estão o mesmo valor.\n")
        inicio()
    }
}

var escolhaFinal: String = ""
fun calcularMelhorCusto(precoAlcool: Double, precoGasolina: Double): String{
    val limiteAlcool = precoGasolina * 0.70
    escolhaFinal = if (precoAlcool <= limiteAlcool){
        "álcool"
    } else {
        "gasolina"
    }
    return escolhaFinal
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
        2-> inicio()

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


fun cadastrarHospedes() {


    while (true) {
        println("""Cadastro de Hóspedes
            Selecione uma opção:
            1. Cadastrar
            2. Pesquisar
            3. Sair""")

        var escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarHospede(listaHospedes)
            2 -> pesquisarHospede(listaHospedes)
            3 -> sairCadastroDeHospedes()
            else -> erroCadastroDeHospedes()
        }
    }
}

fun cadastrarHospede(listaHospedes: MutableList<String>) {
    println("Qual o valor padrão da diária?")
    var daily= readln().toDouble()
    while (daily != 100.0 ){
        println( "Valor inválido, $usuario\n\n")
        println("Qual o valor padrão da diária?")
        daily = readln().toDouble()
    }

    print("Qual o nome do Hóspede?")
    var name = readln().uppercase()
    listaHospedes.add(name)
    while (name != "PARE") {
        println("Qual a idade do Hóspede?")
        var idade = readln().toInt()
        if (idade >= 60) {
            println(" $name cadastrada(o) com sucesso.\n $name paga meia ")
        } else if (idade <= 6) {
            println(" $name cadastrada(o) com sucesso.\n $name possui gratuidade")
        } else {
            println(" $name cadastrada(o) com sucesso.")
        }

        print("Qual o nome do Hóspede?")
        name = readln().uppercase()
        listaHospedes.add(name)

        if(name == "PARE"){
            listaHospedes.remove(name)
        }else{

        }

    }

    println("Lista de Hóspedes atuais: " + listaHospedes)
    cadastrarHospedes()

}

// Não é necessário chamar a função cadastrarHospedes(), pois o loop while já está chamando.


fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it) }
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
    }
}

fun sairCadastroDeHospedes() {
    println("Você deseja sair? S/N")
    val escolha = readln()

    when (escolha.uppercase()) {
        // uppercase fará o que for digitado ser convertido para maiúsculo por exemplpo x -> X
        "S" -> {
            println("Hasta la vista, Baby.")

        }
        "N" -> {
            println("Ok, voltando ao início.")
            cadastrarHospedes()
        }
        else -> {
            println("Desculpe, mas não compreendi.")
            sairCadastroDeHospedes()
        }
    }
}

fun erroCadastroDeHospedes() {
    println("Por favor, informe um número entre 1 e 3.")
}

fun eventos(){

    println("Quantas pessoas estarão no eventos")
    pessoas_eventos = readln().toInt()

    if (pessoas_eventos in 0..350){
        if (pessoas_eventos < 150){
            println("Use o auditório Laranja")
            horario_Eventos()
        }
        else if (pessoas_eventos <220 && pessoas_eventos > 150){
            println("Use o auditório Laranja (inclua mais ${pessoas_eventos - 150} cadeiras)")
            horario_Eventos()
        }
        else if (pessoas_eventos > 220){
            println("Use o auditório Colorado")
            horario_Eventos()
        }
    }
    else if (pessoas_eventos < 0){
        println("Valor invalido!")
        println("digite novamente:")
        eventos()
    }
    else{
        println("de convidados superior à capacidade máxima")
        eventos()
    }
}

fun horario_Eventos(){
    println("Agora vamos ver a agenda do evento")
    println("")
    println("")



    println(" Qual o dia do seu evento? ")
    dia_evento = readln().lowercase()
    if (dia_evento == "SABADO" || dia_evento == "DOMINGO") {
        print(" Qual a hora do seu evento? ")
        hora_evento = readln().toInt()
        if (hora_evento > 15 || hora_evento < 7) {
            println("Horario fora de funcionamento, Auditório indisponível\n")
            println(" Segunda a Sexta das 7hs às 23hs \n Sábados e Domingos apenas das 7hs às 15hs \n")
            horario_Eventos()
        }else {
            println(" Qual o nome da empresa? ")
            empresa = readln()
            println(" Auditório reservado para $empresa . $dia_evento às $hora_evento hs.\n \n")
        }
    } else {
        print(" Qual a hora do seu evento? ")
        hora_evento = readln().toInt()
        while (hora_evento> 23 || hora_evento < 7) {
            println("Horario fora de funcionamento, Auditório indisponível")
            println(" Segunda a Sexta das 7hs às 23hs \n Sábados e Domingos apenas das 7hs às 15hs \n")
            print(" Qual a hora do seu evento? ")
            hora_evento = readln().toInt()
        }

        println(" Qual o nome da empresa? ")
        empresa = readln().lowercase()
        println(" Auditório reservado para $empresa . $dia_evento às $hora_evento")

    }
    garçom()
}

fun garçom(){
    println("Qual a duração do evento em horas?")
    horario_eventos1 = readln().toInt()
    var calc = horario_eventos1 / 2
    contagem_garçom = pessoas_eventos/12
    garçom = contagem_garçom + calc
    custogarçom = garçom * horario_eventos1* 10.5
    println("são necessarios $garçom garçons")
    println("E o custo é $custogarçom ")
    println("Agora vamos calcular o custo do buffet do hotel para o evento." )
    buffet()

}
fun buffet(){
    var cafe_litros = pessoas_eventos * 0.2
    var agua_litros = pessoas_eventos * 0.5
    var contagem_salgado = pessoas_eventos * 7

    var custoCafe = cafe_litros * 0.8
    var custoAgua = agua_litros * 0.4
    var custoSalgados = contagem_salgado / 100.0 * 34

    custoTotal = custoCafe + custoAgua + custoSalgados

    println("O evento precisará de $cafe_litros litros de café, $agua_litros litros de água, $contagem_salgado salgados.")
    println("Custo total com comida do evento: R$ $custoTotal")
    confirm_eventos()
}
fun confirm_eventos(){

    println("\nEvento no Auditório tal.")
    println("Nome da Empresa: $empresa")
    println("Data: $dia_evento, $hora_evento hs.")
    println("Duração do evento: $horario_eventos1 horas.")
    println("Quantidade de garçons: $garçom")
    println("Quantidade de Convidados: $pessoas_eventos")
    println("Custo do garçom: $custogarçom")
    println("Custo do Buffet: R$custoTotal ")
    println("Valor total do evento: ${custogarçom + custoTotal} ")

    print("\nGostaria de efetuar a reserva? S/N: ")
    val resposta = readLine()?.lowercase() ?: ""
    if (resposta == "s") {
        println("Reserva efetuada com sucesso.")
    } else {
        println("Reserva não efetuada.")
    }
}

fun arCondicionado() {

    println("Qual o nome da empresa?")
    var nomeEmpresa = readln()
    listaDeEmpresas.add(nomeEmpresa)

    println("Qual o valor por aparelho?")
    var valorAparelho = readln().toDouble()

    println("Qual a quantidade de aparelhos?")
    var quantidadeAparelho = readln().toDouble()

    println("Qual a porcentagem de desconto?")
    var desconto1 = readln().toInt()

    println("Qual o número mínimo de aparelhos para conseguir o desconto?")
    var minimo = readln().toInt()

    val valorsemdesconto = quantidadeAparelho*valorAparelho
    val valorFinal:Double
    if (quantidadeAparelho < minimo){
        println(valorsemdesconto)
        listaValor.add(valorsemdesconto)
        arCondicionado2()
    }
    else if (quantidadeAparelho >= minimo){
        val desconto2 = (valorsemdesconto * desconto1) / 100
        valorFinal = valorsemdesconto - desconto2
        println(valorFinal)
        arCondicionado2()
    }


}

fun arCondicionado2(){
    println("Deseja informar novos dados? (S/N)")
    var escolha2 = readln().toString().uppercase()

    when(escolha2){

        "S" -> arCondicionado()
        "N" -> arCondicionado3()


    }

}
fun arCondicionado3() {

    if (listaValor.isNotEmpty()) {
        // Inicializa o menor valor com o primeiro elemento do array
        var minValue = listaValor[0]

        // Itera pelo array a partir do segundo elemento
        for (i in 1 until listaValor.size) {
            if (listaValor[i] < minValue) {
                minValue = listaValor[i]
            }
        }

        println("O menor valor é: $minValue")
    }}

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

