/*
    Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */


fun main(){
    var numPares = 0; var numImpares = 0
    for(i in 1 .. 10){

        print("Digite um número: ")
        var num = readln().toInt()

        if(num % 2 == 0){
            numPares++
        }else{
            numImpares++
        }
    }

    println("São ${numPares} números pares")
    println("E são ${numImpares} número ímpares")
}


