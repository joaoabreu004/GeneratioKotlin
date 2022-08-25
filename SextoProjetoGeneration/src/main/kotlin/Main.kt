fun main() {
    /*
    val celular = ProdutoEletronico(  "294003941-1", "IPHONE 12 PLUS", "APPLE")

    celular.renomearNome("IPHONE 12 XR")
    celular.definirPreco(1250.00)
    celular.definirPreco(3000.00)
    println("=====================")
    println("CÓDIGO PRODUTO " + celular.id)
    println("APARELHO: " + celular.nome)
    println("PREÇO: " + celular.preco)
    celular.ligarProduto()
    celular.desligarProduto()

     */


    val funcionario1 = Funcionario("123", "", "Gerente", 2760.0)

    val funcionario2 = Funcionario("124", "Guillherme", "Estágio", 900.0)



//    //DESLIGAR FUNCIONÁRIO
//    funcionario2.desligarFun()
//    //SALARIO: 00.00
//    funcionario2.toString()
    println("============================================")
    funcionario1.toString()
    funcionario1.descontarSalario(-23.00)
    println(funcionario1.salario)
}