/*
    Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
 */
fun main(){
    var soma: Double = 0.0

    do {
        print("Digite um número: ")
        var y: Double = readln().toDouble()
        soma += y

    } while(y != 0.0)

    println("A soma de todos os números é: ${soma}")
}

