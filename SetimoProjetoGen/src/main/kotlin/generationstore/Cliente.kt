package generationstore


class Cliente(val nome: String, val endereco: String, val telefone: String) {
    private var listaCompra = mutableListOf<String>()


    fun addItem(){
        println()
        println("Digite o nome do produto")
        val item = readln()
        if(item != ""){
            listaCompra.add(item)
            println("Produto Adicionado na Compra")
        }
    }

    fun delItem(){
        println()
        println("Digite o nome do produto")
        val item = readln()
        if(listaCompra.contains(item)){
            listaCompra.remove(item)
            println("Produto removido com Sucesso!")
        }else{
            println("Produto não existe na Lista")
        }
    }

    fun listarCompra(){
        println("LISTA DE COMPRA: ${this.nome}")
        listaCompra.forEach{
            println(it)
        }
    }

    fun checarAtributos(){
        if(nome == "" && telefone == ""){
            throw Exception("Cliente Cadastrado de maneira errada!")
        }
    }
}








