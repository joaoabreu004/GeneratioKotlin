fun main(){

    print("Digite um número: ")
    var n1 = readln().toDouble()

    print("Digite um número: ")
    var n2 = readln().toDouble()

    print("Qual operação você deseja realizar?: ")
    var resp = readln()

    escolherOperacao(resp, n1, n2)

}





fun escolherOperacao(operacao: String, n1: Double , n2: Double ){
    if(operacao.equals("+")){
        println("${n1} + ${n2} = ${somar(n1, n2)}")
    } else if(operacao.equals("-")){
        println("${n1} - ${n2} = ${subtrair(n1, n2)}")
    } else if(operacao.equals("*")){
        println("${n1} X ${n2} = ${multiplicar(n1, n2)}")
    } else if(operacao.equals("/")){
        println("${n1} / ${n2} = ${dividir(n1, n2)}")
    } else if(operacao.equals("%")){
        println("${n1} % ${n2} = ${modulo(n1, n2)}")
    }
}


fun somar(n1: Double, n2: Double): Double{
    var soma = n1 + n2
    return soma
}

fun subtrair(n1: Double, n2: Double): Double{
    var sub = n1 - n2
    return sub
}

fun dividir(n1: Double, n2: Double): Double{
    var div = n1 / n2
    return div
}

fun multiplicar(n1: Double, n2: Double): Double{
    var mult = n1 * n2
    return mult
}

fun modulo(n1: Double, n2: Double): Double{
    var mod = n1 % n2
    return mod
}

