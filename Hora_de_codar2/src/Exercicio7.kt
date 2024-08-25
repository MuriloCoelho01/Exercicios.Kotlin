fun main() {

    var soma: Int
    val numero: Int = 72
    val list_num = mutableListOf<Int>()

    for (n in 1..6) {

        println("DIgite um valor: ")
        list_num.add(readln().toInt())
    }


    soma = list_num.filter { it < numero }.sum()
    println(soma)


}


