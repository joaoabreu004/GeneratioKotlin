package herancaandpolimorfismo

public class Cachorro(
    nome : String,
    nomeCientifico:
    String, habitat:String,
    raca: String,
    idade: Int) : Animal(nome, nomeCientifico, habitat, raca, idade) {

    override fun possuiNome() {
        return println("O nome do Cachorro é ${this.nome}")

    }

    override fun emitirSom() {
        super.emitirSom()
        return println("CACHORRO - AUAU AUUUUUUUUUUUU")
    }

    override fun possuiIdade() {
        return println("A idade do animal é ${this.idade}")
    }

    fun correr(){
        return println("Correndo como um cachorro")
    }
}