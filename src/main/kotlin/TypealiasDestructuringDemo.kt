typealias NomeCompleto = Pair<String, String>

fun typealiasDestructuringDemo() {
    val nome: NomeCompleto = "João" to "Silva"
    val (primeiro, sobrenome) = nome
    println("Nome: $primeiro $sobrenome")
}