/*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto
 */

fun main(){
    print("Qual sua idade?: ")
    val age = readln().toInt()

    if(age >= 0 && age <=14)
        println("Infantil")
    else if (age >= 15 && age <= 17)
        println("Juvenil")
    else if (age >= 18)
        println("Adulto")
    else
        println("Faixa etaria inderterminada")
}
