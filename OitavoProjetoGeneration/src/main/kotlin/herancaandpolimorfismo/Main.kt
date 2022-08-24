package herancaandpolimorfismo

fun main() {

    val cavalo = Cavalo("Pimposo", "Cavalus", "fazenda", "cavalaria", 8)
    val preguiça = Preguiça("Sid","Preguicius", "Floresta", "preguiçosos", 5)
    val cachorro = Cachorro("Bento", "Latinu", "Campo", "puddle", 7)

    cavalo.emitirSom()
    preguiça.emitirSom()
    cachorro.emitirSom()
}

