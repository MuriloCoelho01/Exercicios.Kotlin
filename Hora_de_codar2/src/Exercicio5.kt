fun main(){

    var media : Int

    val list_num1 = mutableListOf<Int>()

    for(i in 1..6){
        println("Digte um valor: ")
        list_num1.add(readln().toInt())
    }
    println(list_num1)

    media = list_num1.sum()/list_num1.count()
    println("A media aritimetica entre os valores é $media")



}