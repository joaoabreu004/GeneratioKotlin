import kotlin.random.Random

/*
 *  		Um dado é lançado 10 vezes e o valor correspondente é anotado.
 *  		Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 *  		A seguir determine e imprima a média aritmética dos lançamentos,
 *  		contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

fun main() {
    var ponto:Int = 0; var maiorPonto:Int = 0; var somaPontos:Int = 0; var qtdLancamentos:Int = 0; var qtdMaior:Int = 0
    val lancamento: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var media:Double = 0.0

    for(i in 0..9){
            ponto = 0
            ponto = (1..6).random()
            if(ponto > maiorPonto){
                maiorPonto = ponto
            }

            lancamento[i] = ponto
            somaPontos += ponto
            qtdLancamentos++

    }

    lancamento.forEach {
        if(it == maiorPonto){
            qtdMaior++
        }
        print("$it ")
    }

    media = (somaPontos / qtdLancamentos).toDouble()

    println("")
    println("Maior ponto: $maiorPonto")
    println("Media pontos: $media" )
    println("Quantidade de vezes que o $maiorPonto apareceu: $qtdMaior" )
}
