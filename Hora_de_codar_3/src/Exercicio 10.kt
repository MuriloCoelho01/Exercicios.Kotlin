fun main(){

    println("Digite um valor: ")
    var num:Int = readln().toInt()
    var tab:Int = 1

for (i in tab..num){
    println("Taboada do $i")
    println ("$tab x 1 = " + tab * 1)
    println ("$tab x 2 = " + tab * 2)
    println ("$tab x 3 = " + tab * 3)
    println ("$tab x 4 = " + tab * 4)
    println ("$tab x 5 = " + tab * 5)
    println ("$tab x 6 = " + tab * 6)
    println ("$tab x 7 = " + tab * 7)
    println ("$tab x 8 = " + tab * 8)
    println ("$tab x 9 = " + tab * 9)
    println ("$tab x 10 = " + tab * 10)
tab++
}

}