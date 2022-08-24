package herancaandpolimorfismo

abstract class Animal(var nome: String, var nomeCientifico: String, var habbitat: String, var raca: String, var idade: Int) {

    abstract fun possuiNome()
    abstract fun possuiIdade()

    open fun emitirSom(){
        return print("Som: ")
    }

}