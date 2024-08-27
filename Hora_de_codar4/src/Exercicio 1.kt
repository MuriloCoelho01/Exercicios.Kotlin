fun main(){


    var list = mutableListOf<String>()
    println("Deseja cadastrar um aluno? ")
    println("s - sim")
    println("Caso não queira digite (Pare)")
    println("Digite: ")
    var sn:String = readln()



    while(sn == "sim" || sn == "Sim") {
        println("Digite o nome do aluno:")
        list.add(readln())
        println("Deseja cadastrar outro aluno? ")
        println("s - sim")
        println("Caso não queira digite (Pare)")
        println("Digite: ")
        sn = readln()


        if (sn == "pare" || sn == "PARE") {
            println("Os alunos cadastrados são $list")
            println("Foram cadastrados ${list.count()} alunos.")
            break
        }
    }

}




