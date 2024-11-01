
package tamagochi



fun main(){

    println("Olá seja bem vindo ao tamagochi!")
    println("Insira o nome do seu pet:")
    val nome = readln()
    val tamagochi = Tamagochi(nome)


    while (true){
        println("1 - Alimentar o $nome")
        println("2 - brincar com o $nome")
        println("3 - Dormir")
        println("4 - Verificar Status")
        println("5 - sair")

        val escolha = readln().toIntOrNull()


        when(escolha){
            1 -> tamagochi.comer()
            2 -> tamagochi.brincar()
            3 -> tamagochi.dormir()
            4 -> tamagochi.status()
            5 -> {
                println("Tamagochi encerrando")

            return
            }
        }

        if (tamagochi.idade == 50){
            println("Você ganhou!")
            return
        }

        tamagochi.Passar_tempo()
       if (tamagochi.fome >= 100 ||
           tamagochi.cansaco >= 100 ||
           tamagochi.nivel_felicidade <=0){
           println("O bixin foi de F")
       }
    }


    }



