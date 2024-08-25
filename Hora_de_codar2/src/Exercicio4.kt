fun main() {

    var maior: Int
    var menor: Int
    var medio: Int

    var list_num = mutableListOf<Int>()

    for (i in 1..3) {

        println("Digite os valores: ")
        list_num.add(readln().toInt())
    }

    if (list_num[0] > list_num[1] && list_num[0] > list_num[2]) {
        //println(list_num[0])
        maior = list_num[0]
    } else if (list_num[1] > list_num[0] && list_num[1] > list_num[2]) {
        //println(list_num[1])
        maior = list_num[1]
    } else { //println(list_num[2])
        maior = list_num[2]
    }

    println("Maior numero : $maior")


    if (list_num[0] < list_num[1] && list_num[0] < list_num[2]) {
        //println(list_num[0])
        menor = list_num[0]
    } else if (list_num[1] < list_num[0] && list_num[1] < list_num[2]) {
        //println(list_num[1])
        menor = list_num[1]
    } else { //println(list_num[2])
        menor = list_num[2]
    }

    println("Menor numero : $menor")


    medio = if (list_num[0] != maior && list_num[0] != menor) {
        list_num[0]
    } else if (list_num[1] != maior && list_num[1] != menor) {
        list_num[1]
    } else {
        list_num[2]
    }
    println("Medio numero : $medio")
    var soma: Int = (medio + maior)
    println("A soma dos dois numeros é :" + soma)

}
