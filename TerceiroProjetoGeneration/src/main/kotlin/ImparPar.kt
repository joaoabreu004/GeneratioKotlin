/*
       Faça um programa em que permita a entrant de um número qualquer e exiba se este
       número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
       ímpar exiba o número elevado ao quadrado.
 */


fun main(){
    println("Digite um número: ")
    val num:Int = readln().toInt()

    val rest = num / 2
    if(rest == 1){
        println("O número ${num} é ímpar")
    }

}