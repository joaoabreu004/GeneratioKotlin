package herancaandpolimorfismo

class Cavalo(
    nome : String,
    nomeCientifico: String,
    habitat:String,
    raca: String,
    idade: Int) : Animal (nome, nomeCientifico, habitat, raca, idade){

    override fun possuiNome() {
        return println("O nome do Cavalo é ${this.nome}")

    }

    override fun emitirSom() {
        super.emitirSom()
        return println("CAVALO - IHHHHH IIHHH BUUF")
    }

    override fun possuiIdade() {
        return println("A idade do animal é ${this.idade}")
    }

    fun correr(){
        return println("Correndo como um cavalo...")
    }


    }