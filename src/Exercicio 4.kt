fun main(){

    var list = mutableListOf<Double>()

    for (i in 15..100){
        list.add(i.toDouble())
    }

    println("A média aritimetica entre todos os valores que estão entre 15 e 100 é: "+list.sum()/list.count())



}