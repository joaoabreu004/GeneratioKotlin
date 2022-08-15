/*
    Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
    (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
    deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

fun main(){
    print("Digite um numero: ")
    val num:Int = readLine()!!.toInt()

    var cont = num

    while (cont <= 100){
        print("$cont - ")
        cont *= 3
        if(cont > 100){
            println(cont)
        }
    }

}