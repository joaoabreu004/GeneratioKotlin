/*
    CRIE UM CLASSE PRODUTO ELETRÔNICO
 */

class ProdutoEletronico ( var id: String ,var nome: String, var marca: String){
    var preco = 0.0
    var desligado = true

    fun definirPreco(valor: Double){
        if(valor > 0.0) {
            this.preco = valor
        }else{
            println("Preço Inválido")
        }

    }

    fun renomearNome(novoNome: String){
        this.nome = novoNome
    }

    fun ligarProduto(){
        desligado = false
        println("Ligado!")
    }

    fun desligarProduto(){
        desligado = true
        println("Desligado!")
    }
}







