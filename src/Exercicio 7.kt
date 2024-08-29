fun main(){

var list = mutableListOf<Double>()

    for (i in 1..6){
        println("Digite uma nota: ")
        var nota:Double = readln().toDouble()

       if(nota < 0 || nota > 10){
           println("")
           println("NUMERO INVALIDO")
           println("Digite outra nota entre 0 a 10: ")
           nota = readln().toDouble()
           list.add(nota)
       }
        else if(nota <= 10 || nota >=0){
            list.add(nota)
        }

    }
    println("Media do aluno é "+list.sum()/list.count())
}