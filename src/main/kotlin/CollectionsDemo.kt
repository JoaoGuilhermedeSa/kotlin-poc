fun collectionsDemo() {
    val numeros = listOf(1, 2, 3, 4, 5)

    val dobrados = numeros.map { it * 2 }
    val pares = numeros.filter { it % 2 == 0 }
    val soma = numeros.fold(0) { acc, i -> acc + i }

    println("Dobrados: $dobrados")
    println("Pares: $pares")
    println("Soma: $soma")
}