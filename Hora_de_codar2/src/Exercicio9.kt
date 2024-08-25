fun main() {

println("Qual ano você nasceu: ")
    var idade: Int = readln().toInt()


    if(idade <= 2008){
        println("Você pode votar!")
    }
    else{
        println("Você não pode votar")
    }

}