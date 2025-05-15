fun nullSafetyDemo() {
    val nome: String? = null
    val tamanho = nome?.length ?: 0
    println("Tamanho do nome: $tamanho")
}