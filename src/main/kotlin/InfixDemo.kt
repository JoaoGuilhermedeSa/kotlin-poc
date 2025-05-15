infix fun Int.mais(outra: Int): Int = this + outra

fun infixDemo() {
    val resultado = 5 mais 10
    println("Resultado do infix: $resultado")
}