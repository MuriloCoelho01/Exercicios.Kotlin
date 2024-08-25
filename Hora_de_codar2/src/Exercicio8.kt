fun main() {

val list = mutableListOf<Double>()

for (i in 1..4) {
    println("Digite um numero: ")
    list.add(readln().toDouble())
}


    var numero = list.filter { it <= 10 }
       val numero2 = numero.sum()/numero.count()

    println(numero)

       if(numero2 < 5){
           println("A média é $numero")
           println("Você está retido! ")
       }
     else{
         println("A média é $numero2")
         println("Você está aprovado! ")
     }

}












