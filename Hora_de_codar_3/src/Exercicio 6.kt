import kotlin.system.exitProcess

val list_Ofaluno = mutableListOf<String>()
fun main(){
    println("")
    println("Deseja tirar a média aritimetica de um(a) aluno(a)")
    println("Caso sim, digite (1)")
    println("Caso não, digite (2)")
    println("Digite:")

    var confirm = readln().toInt()

    when(confirm){
        1 -> media()
        2 -> fechamento2()
    }
}
fun media(){

    println("Digite o nome do aluno: ")
    var aluno = readln()

    println("")
    println("Digite a primeira nota: ")
    var nota1 = readln().toDouble()

    println("Digite a segunda nota: ")
    var nota2 = readln().toInt()

    var media2 = (nota1 + nota2)/2

    if (media2 < 9.5){
        println("ALUNO REPROVADO")
    }
    else if(media2 >= 9.5){
        println("")
        println("ALUNO APROVADO")
        list_Ofaluno.add(aluno)
    }
    println("")
    println("Deseja calcular a média de outro aluno? ")
    println("Caso sim, digite (1)")
    println("Caso não, digite (2)")
    println("Digite:")
    var confirm2 = readln().toInt()
    when(confirm2){
        1 -> media()
        2 -> fechamento()
    }

}

fun fechamento() {


    println("")
    println("Foram aprovados "+list_Ofaluno.count()+" alunos")
    println("")
    println("LISTA DE ALUNOS APROVADOS:")

    for (i in list_Ofaluno){
        println(i)
    }
}
fun fechamento2(){
   println("Ok, obrigado!")
}