package herancaandpolimorfismo

class Preguiça(
    nome : String,
    nomeCientifico: String,
    habitat:String,
    raca: String,
    idade: Int) : Animal (nome, nomeCientifico, habitat, raca, idade){
    override fun possuiNome() {
        return println("O nome da preguiça é: ${this.nome}")
    }

    override fun possuiIdade() {
        return println("O nome da preguiça é: ${this.idade}")
    }

    override fun emitirSom() {
        super.emitirSom()
        return println("PREGUIÇA - IERRR IERR IERR")
    }

    fun subirArvores(){
        return println("Subindo em árvores")
    }
}