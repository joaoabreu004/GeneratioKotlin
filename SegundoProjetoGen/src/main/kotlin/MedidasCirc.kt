/*
    Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele.
 */

fun main(){
    val pi = 3.14
    print("Qual eh o diametro do circulo?: ")
    val d = readln().toDouble()
    val r = d/2
    println("Area: ${"%.2f".format(calcularArea(pi, r))}")
    println("Perimetro: ${"%.2f".format(calcularPerimetro(pi, r))}")
}

fun calcularArea(pi: Double, raio: Double): Double{
    return pi * (raio * raio)
}

fun calcularPerimetro(pi: Double, raio: Double):Double{
    return 2 * pi * raio
}