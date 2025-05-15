data class Pessoa(val nome: String, val idade: Int)

fun dataClassDemo() {
    val p1 = Pessoa("João", 30)
    val p2 = p1.copy(idade = 31)
    println(p1)
    println(p2)
}