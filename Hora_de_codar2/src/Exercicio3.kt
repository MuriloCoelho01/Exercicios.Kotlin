fun main() {


    var list_num1 = mutableListOf<Int>()

    for (i in 1..3) {

        println("Digite um valor: ")
        list_num1.add(readln().toInt())
    }

      if( list_num1[0] > list_num1[1] && list_num1[0] > list_num1[2] ) {
          println("O maior valor é " + list_num1[0])
      }
     else if(list_num1[1] > list_num1[0] && list_num1[1] > list_num1[2]) {
        println("O maior valor é " + list_num1[1])
    }
    else{
          println("O maior valor é " + list_num1[2])
      }
}
