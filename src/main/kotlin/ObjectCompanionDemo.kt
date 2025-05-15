object Logger {
    fun log(msg: String) = println("LOG: $msg")
}

class Produto(val nome: String) {
    companion object {
        fun criarPadrao(): Produto = Produto("Produto Padrão")
    }
}

fun objectCompanionDemo() {
    Logger.log("Usando singleton")
    val p = Produto.criarPadrao()
    println("Produto: ${p.nome}")
}