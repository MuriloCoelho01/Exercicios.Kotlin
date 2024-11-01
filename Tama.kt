package tamagochi

class Tamagochi(
    val nome:String,
    var fome:Int = 10,
    var nivel_felicidade:Int = 100,
    var cansaco:Int = 0,
    var idade:Int = 0,
    var vida:Boolean = true
){
    fun comer(){
        fome = fome - 25
        println("Estou alimentado! nham,nham!")
    }
    fun brincar(){
        nivel_felicidade = nivel_felicidade + 5
        cansaco = cansaco + 5
        fome = fome - 10
        println("Brinquei agora")
    }
    fun dormir(){
        cansaco = cansaco - 10
        println("Descansei um pouquinho")
    }
    fun status(){
        println("nome: $nome")
        println("fome: $fome ")
        println("felicidade: $nivel_felicidade")
        println("cansaço: $cansaco")
        println("Idade: $idade")
    }
    fun Passar_tempo(){
        idade = idade + 1
        fome = fome + 10
        cansaco = cansaco + 5
        nivel_felicidade = nivel_felicidade - 10
    }


}
