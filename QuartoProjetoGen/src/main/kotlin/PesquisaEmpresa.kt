/*
   Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
   21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
   idade for =-99. (WHILE)
 */
fun main(){
    var pessoasMenos21 = 0
    var pessoasMais50 = 0

    var idade = 0
    while (idade >= 0){
        print("Qual sua idade: ")
        idade = readln().toInt()
        if(idade >= 0 && idade < 21){
            pessoasMenos21++
        } else if (idade > 50) {
            pessoasMais50++
        }
    }

    println("Pessoas com menos de 21 anos: ${pessoasMenos21}")
    println("Pessoas com mais de 50 anos: ${pessoasMais50}")




}