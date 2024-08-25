fun main(){
    var maior: Int
    var primeiro: Int
    var ultimo: Int


    val list_num = mutableListOf<Int>()

    for(i in 1..4) {
        println("Digite um valor: ")
        list_num.add(readln().toInt())
    }
    primeiro = list_num[0]
    ultimo = list_num[3]

    list_num.sortDescending()
    maior = list_num[0]




    println("O maior é $maior")
    println("O primeiro é $primeiro")
    println("O ultimo é $ultimo")

}