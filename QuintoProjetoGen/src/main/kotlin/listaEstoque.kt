/*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
 */
var estoque = mutableListOf<String>()
fun main() {

    while (true){
        println("=================================")
        println("{1} ARMAZENAR PRODUTO")
        println("{2} REMOVER PRODUTO")
        println("{3} ATUALIZAR PRODUTO")
        println("{4} APRESENTAR ESTOQUE ")
        println("{5} SAIR DO SISTEMA")
        print("DIGITE A AÇÃO: ")
        val resp = readln().toInt()

        when (resp) {
            1 -> addProduto()
            2 -> delProduto()
            3 -> updateProduto()
            4 -> exibirEstoque()
            5 -> break
            else -> println("VALOR INESPERADO")
        }

    }

}

fun addProduto() {
    print("Adicione um produto: ")
    val produto = readln()
    while (true) {
        if (produto != "") {
            estoque.add(produto)
            println("Produto Cadastrado com Sucesso!")
            break
        } else {
            println("Falha ao cadastrar")
        }
    }

}

fun delProduto() {
    print("Remova um produto: ")
    val produto = readln()

    if (estoque.contains(produto)) {
        estoque.remove(produto)
        println("Produto removido com sucesso")
    } else {
        println("Falha ao deletar ")
    }
}

fun updateProduto() {
    print("Atualize o produto: ")
    val produto = readln();

    if (estoque.contains(produto)) {
        var pos = estoque.indexOf(produto)
        print("Digite a alteração: ")
        estoque[pos] = readln()
        println("Produto atualizado com sucesso")
    } else {
        println("Produto não encontrado no sistema")
    }
}

fun exibirEstoque() {
    println(estoque)
}