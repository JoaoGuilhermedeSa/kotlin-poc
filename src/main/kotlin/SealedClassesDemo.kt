sealed class Resultado
data class Sucesso(val dados: String): Resultado()
data class Erro(val msg: String): Resultado()

fun processarResultado(resultado: Resultado) {
    when(resultado) {
        is Sucesso -> println("Dados: ${resultado.dados}")
        is Erro -> println("Erro: ${resultado.msg}")
    }
}