/*
    Crie uma classe funcionário e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto funcionário, defina as
    instancias deste objeto e apresente as informações deste objeto no
    console.
 */
class Funcionario(var id: String, var nome: String, var cargo: String, var salario: Double) {
    var situacao = "Ativo"
    var bateuPonto = false

    init{
        checarAtributos()
    }


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

    fun descontarSalario(valor: Double){
        if(valor > 0){
            this.salario -= valor
        }else {
            println("Impossível descontar esse valor!")
        }
    }

    fun checarAtributos(){
        if(nome.isNullOrBlank()){
            throw Exception ("Funcionário cadastrado sem nome")
        }
    }

    @Override
    override fun toString():String {
        return println("ID: ${this.id}\n" +
                "NOME: ${this.nome}\n" +
                "CARGO: ${this.cargo}\n" +
                "SALARIO: ${this.salario}\n" +
                "SITUAÇÃO: ${this.situacao}").toString()
    }
}