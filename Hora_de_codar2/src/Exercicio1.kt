fun main(){

    var num1: Int
     var lista_num = mutableListOf<Int>()

    for(n in 1..2){
        println("Digite um numero: ")

        lista_num.add(readln().toInt())

    }

        if(lista_num[0] > lista_num[1] ){
            print("O maior valor é")
            println(lista_num[0])
         }
         else {
            print("O maior valor é ")
            println(lista_num[1])



}}