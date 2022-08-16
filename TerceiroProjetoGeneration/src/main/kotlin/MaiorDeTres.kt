/*
     Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

fun main() {
    print("Digite tres numeros: ")
    val numerosDigitos = readln();
    val arrayDigitos =  numerosDigitos.split(";")
    var maior = 0


    //Converter números para inteiro e comparar todos
    for (i in arrayDigitos.indices) {
        val arrayDigitosInt = Array(arrayDigitos.size){Integer.parseInt(arrayDigitos[i])}
        for(i in arrayDigitosInt.indices){
            if(maior < arrayDigitosInt[i]){
                maior = arrayDigitosInt[i]
            }
        }
    }

    println("O maior numero entre ${numerosDigitos} eh: ${maior}")


}


