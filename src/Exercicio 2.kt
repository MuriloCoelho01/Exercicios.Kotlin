import java.lang.Thread.sleep

fun main() {

    for (i in 30 downTo 1) {
        println(i)
        sleep(1000)
    }
    println("EXPLOSÃO!!!!")
}