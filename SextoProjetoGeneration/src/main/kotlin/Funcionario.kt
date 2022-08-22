/*
    Crie uma classe funcionário e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto funcionário, defina as
    instancias deste objeto e apresente as informações deste objeto no
    console.
 */
class Funcionario(var id: String, var nome: String, var cargo: String, var salario: Double) {
    var situacao = "Ativo"
    var bateuPonto = false

    fun bonificacao(valor: Double){
        this.salario += valor
    }

    fun baterPonto(){
        this.bateuPonto = true
    }

    fun desligarFun(){
        this.salario = 0.0
        this.situacao = "Inativo"
    }

}