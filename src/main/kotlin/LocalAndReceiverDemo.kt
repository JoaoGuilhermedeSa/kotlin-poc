fun localFunctionDemo() {
    fun saudacao(nome: String): String {
        fun mensagem(): String = "Olá, $nome!"
        return mensagem()
    }
    println(saudacao("Mundo"))
}

fun lambdaWithReceiverDemo() {
    val builder = StringBuilder().apply {
        append("Olá, ")
        append("mundo!")
    }
    println(builder.toString())
}