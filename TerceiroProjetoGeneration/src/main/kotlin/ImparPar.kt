import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

/*
       Faça um programa em que permita a entrant de um número qualquer e exiba se este
       número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
       ímpar exiba o número elevado ao quadrado.
 */


fun main(){
    print("Digite um numero: ")
    val num:Double = readln().toDouble()
    val rest:Double = num % 2


    if(rest == 0.0){
        println("O numero ${num} eh par e sua Raiz Quadrada eh: ${"%.4f".format(sqrt(num))}")
    } else {
        println("O numero ${num} eh impar e elevado ao quadrado eh: ${Math.pow(num, 2.0)} ")
    }

}