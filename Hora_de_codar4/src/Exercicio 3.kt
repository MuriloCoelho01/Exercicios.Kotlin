fun main() {
    var list = mutableListOf<String>()

    println("")
    println("")
    println("")
    println("Deseja adicionar itens a sua lista de compra? ")
    println("Caso queira digite (Sim)")
    println("Caso não queira digite (Não)")
    println("Digite: ")
    var confirmacao1: String = readln()



    while (confirmacao1 == "sim" || confirmacao1 == "Sim") {
        println("Digite o item:")
        list.add(readln())
        println("Deseja adicionar outros itens a sua lista de compra? ")
        println("s - sim")
        println("Caso não queira digite (Não)")
        println("Digite: ")
        confirmacao1 = readln()


        if (confirmacao1 == "não" || confirmacao1 == "Não") {

            println("")
            println("")
            println("Foram adicionados  ${list.count()} itens a sua lista de compra.")

            println("")
            println("SUA LISTA DE COMPRA É: ")
            for (x in list) {
                println(x)
            }
            println("")
            println("")
            println("Deseja retirar(riscar) da lista?")
            println("Caso queira digite (Sim)")
            println("Caso não queira digite (Não)")
            var confirmacao2: String = readln()


            while (confirmacao2 == "sim" || confirmacao2 == "Sim") {
                println("Qual item deseja riscar/retirar da lista de compra? ")



                var remocao3: String = readln()
                list.remove(remocao3)

                println("")
                println("SUA LISTA ATUAL:")
                for (m in list) {
                    println(m)
                }
                if (list.isEmpty()) {
                    println("")
                    println("Sua lista está finalizada! ")
                    break
                }

                if(confirmacao2 == "não" || confirmacao2 == "Não") {

                    println("SUA LISTA DE COMPRA É: $list")
                    break
                }
            }
        }

    }

}






