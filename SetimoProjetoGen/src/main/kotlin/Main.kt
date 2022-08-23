import generationstore.Cliente

fun main() {
    print("OLÁ USUÁRIO, DIGITE SEU NOME:")
    val nome = readln()
    print("ENDEREÇO: ")
    val endereco = readln()
    print("TELEFONE : ")
    val telefone = readln()

    val cliente = Cliente(nome, endereco, telefone)

    println()
    while (true){
        println("==================COMPRAS====================")

        println("(1) - ADICIONAR PRODUTO")
        println("(2) - REMOVER PRODUTO")
        println("(3) - LISTAR PRODUTOS")
        println("(4) - SAIR DO SISTEMA")
        print("OPÇAO: ")
        val opcao = readln().toInt()

        when(opcao){
            1 -> cliente.addItem()
            2 -> cliente.delItem()
            3 -> cliente.listarCompra()
            4 -> break
        }
    }


}