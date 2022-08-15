import java.time.LocalDate
import java.time.format.DateTimeFormatter

// O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

fun main() {
    print("Digite sua idade: ")
    var age = readln().toInt()
    print("Voce ja fez aniversario esse ano? (s/n): ")
    val jaFezAniversario = readln()
    if (jaFezAniversario == "n") {
        age += 1
        println("Voce nasceu em ${anoNascimento(age)}")
    } else {
        println("Voce nasceu em ${anoNascimento(age)}")
    }
}

fun anoNascimento(idade: Int): Int {
    //LocalDate
    val ano = LocalDate.now().year
    return ano - idade
}