/*
 * 	Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando
 * 	de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */
fun main(){
    var num:Int = 233
    do{
        println(num)
        if(num >= 300 && num < 400){
            num = num +3
        } else {
            num = num + 5
        }
    } while (num < 456)
}