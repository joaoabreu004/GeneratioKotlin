/*
 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
 * 	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
 * 	a) média do salário da população;
 * 	b) média do número de filhos;
 * 	c) maior salário;
 * 	d) percentual de pessoas com salário até R$1000,00.
 */

fun main(){

    var qtdFilhos:Int = 0; var somaFilhos:Int = 0; var pessoaSalarioBaixo:Int = 0; var pessoasEntre:Int = 0;
    var salario: Float = 0F; var somaSalarios: Float= 0F; var maiorSalario: Float=0F

    for(i in 1..20){
        println("$i Pessoa")
        print("Qual a quantidade de filhos?: ")
        qtdFilhos = readLine()!!.toInt()
        somaFilhos += qtdFilhos
        print("Qual o seu salario?: ")
        salario = readLine()!!.toFloat()
        somaSalarios += salario
        if(salario > maiorSalario){
            maiorSalario = salario
        }
        if(salario <= 1000){
            pessoaSalarioBaixo++
        }
        println("=====================")
        pessoasEntre++
    }

    println("===========================================================\n")
    println("A media dos salarios e: R$" + somaSalarios / pessoasEntre)
    println("A media de numeros de filhos e: " + somaFilhos / pessoasEntre)
    println("O maior salario e: R$" + maiorSalario)
    println("O percentual de pessoas com o salario de ate R$1000 e: " + pessoaSalarioBaixo * 100 / pessoasEntre + "%")
}