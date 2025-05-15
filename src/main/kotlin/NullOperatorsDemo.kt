fun nullOperatorsDemo() {
    val nome: String? = "Kotlin"
    println("Tamanho com safe call: ${nome?.length}")

    val idade: Int? = null
    val idadeFinal = idade ?: 18
    println("Idade final (Elvis): $idadeFinal")

    val certeza: String? = "Não é nulo"
    println("Certeza: ${certeza!!.length}")
}