fun main() {
    var listA = mutableListOf<Int>()
    var listR = mutableListOf<Int>()

    for (i in 1..10){
      println("Digite um valor: ")
        var num:Int = readln().toInt()

        if (num <= 42 && num >= 24 ){
           var condicao = num
            listA.add(condicao)
        }
       else{
           var condicao2:Int = num
            listR.add(condicao2)
        }

    }
    println("")
    println("Foram selecionados " + listA.count() + " numeros que estão entre (24 e 42)")
    println("Esses valores são: $listA ")

    println("")
    println("Foram selecionados " + listR.count() + " numeros que NÃO estão entre (24 e 42)")
    println("Esses valores são $listR ")

}