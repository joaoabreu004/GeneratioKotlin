/*
    Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
 */

fun main(){
    var num = 0; var mult3 =0; var somaMult3 = 0
    do{
        print("Digite um número: ")
         num = readln().toInt()
         if(num % 3 == 0){
             somaMult3 += num
             mult3++
         }
    }while (num != 0)

    println("A média dos números múltiplos é ${somaMult3 / mult3}")
    println(somaMult3)
    println(mult3)
}


