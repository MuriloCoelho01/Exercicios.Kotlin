fun main(){

    val SistemaSolar = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Digite um nome de um planeta: ")
    var planeta: String = readln()


    if(SistemaSolar.contains(planeta)){
        println("$planeta está no Sistema Solar")
    }
    else{
        println( "$planeta, não está no planeta solar")
    }}