# 🌟 Kotlin vs Java – Demonstração de Funcionalidades Kotlin

Este documento apresenta uma explicação detalhada dos principais recursos da linguagem Kotlin que não existem ou são significativamente mais verbosos em Java. Cada seção contém uma explicação técnica, código de exemplo e vantagens práticas.

---

## ✅ 1. Null Safety, Elvis Operator, Safe Calls

```kotlin
val nome: String? = null
val tamanho = nome?.length ?: 0
val certeza = "texto"
println("Certeza: ${certeza!!.length}")
```

**Conceitos**:
- `String?`: Tipo anulável.
- `?.`: Safe call – evita NullPointerException.
- `?:`: Elvis operator – fornece valor padrão se `null`.
- `!!`: Not-null assertion – lança exceção se `null`.

**Vantagens sobre Java**:
- Segurança de nulabilidade é verificada em tempo de compilação.
- Menos necessidade de verificações manuais ou uso de `Optional`.

---

## ✅ 2. Data Classes

```kotlin
data class Pessoa(val nome: String, val idade: Int)
```

**Conceitos**:
- `data class` gera `equals()`, `hashCode()`, `toString()`, `copy()` e `componentN()`.

**Vantagens**:
- Reduz drasticamente o boilerplate necessário em Java.

---

## ✅ 3. Funções de Extensão

```kotlin
fun String.palindromo(): Boolean = this == this.reversed()
```

**Uso**:
```kotlin
println("arara".palindromo()) // true
```

**Vantagens**:
- Permite adicionar funcionalidades a classes existentes sem herança ou composição.
- Código mais expressivo do que classes utilitárias em Java.

---

## ✅ 4. Coroutines

```kotlin
runBlocking {
    launch {
        delay(1000)
        println("Executado após 1 segundo")
    }
}
```

**Conceitos**:
- `suspend`: marca funções que podem suspender sua execução.
- `launch`, `async`: formas leves de concorrência.

**Vantagens**:
- Substitui `CompletableFuture` ou `ExecutorService` com código mais limpo, sem bloqueios.

---

## ✅ 5. Smart Casts

```kotlin
fun imprimeTamanho(obj: Any) {
    if (obj is String) {
        println(obj.length) // cast automático
    }
}
```

**Vantagens**:
- Kotlin faz cast automático após `is`, sem precisar de cast manual como em Java.

---

## ✅ 6. Sealed Classes

```kotlin
sealed class Resultado
data class Sucesso(val dados: String) : Resultado()
data class Erro(val msg: String) : Resultado()

fun processar(r: Resultado) = when (r) {
    is Sucesso -> println("Sucesso: ${r.dados}")
    is Erro -> println("Erro: ${r.msg}")
}
```

**Vantagens**:
- Garante exaustividade em `when`, evitando `else` desnecessários.
- Ideal para modelar estados fechados (Result, Status, etc).

---

## ✅ 7. DSL com Lambdas com Receiver

```kotlin
class HtmlBuilder {
    private val html = StringBuilder()

    fun body(conteudo: HtmlBuilder.() -> Unit) {
        html.append("<body>")
        this.conteudo()
        html.append("</body>")
    }

    fun p(texto: String) {
        html.append("<p>$texto</p>")
    }

    override fun toString(): String = html.toString()
}
```

**Uso**:
```kotlin
val html = HtmlBuilder().apply {
    body {
        p("Olá, Kotlin!")
    }
}
println(html)
```

**Vantagens**:
- Muito útil para criar mini-DSLs legíveis (HTML, UI, configs).
- Java não possui lambdas com receiver.

---

## ✅ 8. Operador Infix

```kotlin
infix fun Int.mais(outro: Int): Int = this + outro

val resultado = 5 mais 10 // 15
```

**Vantagens**:
- Sintaxe natural, ideal para DSLs e código expressivo.

---

## ✅ 9. Funções de Alta Ordem – Collections

```kotlin
val numeros = listOf(1, 2, 3)
val resultado = numeros.map { it * 2 }.filter { it > 3 }.fold(0) { acc, i -> acc + i }
```

**Vantagens**:
- Imutabilidade e expressividade.
- Redução de boilerplate comparado ao uso de Streams em Java.

---

## ✅ 10. Funções Locais

```kotlin
fun saudacao(nome: String): String {
    fun mensagem() = "Olá, $nome!"
    return mensagem()
}
```

**Vantagens**:
- Encapsula lógica auxiliar no escopo da função principal.
- Não possível em Java (métodos não podem estar dentro de métodos).

---

## ✅ 11. Lambda com Receiver (`apply`, `with`)

```kotlin
val builder = StringBuilder().apply {
    append("Olá, ")
    append("mundo!")
}
```

**Vantagens**:
- Sintaxe fluente.
- Menos repetição do nome do objeto (`this` implícito).

---

## ✅ 12. object e companion object

```kotlin
object Logger {
    fun log(msg: String) = println("[LOG]: $msg")
}

class Produto(val nome: String) {
    companion object {
        fun criar(nome: String) = Produto(nome)
    }
}
```

**Vantagens de `object`**:
- Singleton thread-safe e elegante.
- Sem `getInstance()`.

**Vantagens de `companion object`**:
- Substitui `static` do Java com mais flexibilidade.
- Pode implementar interfaces e ser mockado.

---

## ✅ 13. Typealias e Destructuring

```kotlin
typealias NomeCompleto = Pair<String, String>

val nome: NomeCompleto = "João" to "Silva"
val (primeiro, sobrenome) = nome
```

**Vantagens**:
- `typealias` melhora a legibilidade de tipos complexos.
- `destructuring` acessa dados de forma mais limpa.

---

## 🎯 Conclusão

| Recurso                     | Kotlin                                      | Java                            |
|----------------------------|---------------------------------------------|---------------------------------|
| Segurança contra null      | Integrada no compilador                     | Manual ou `Optional`            |
| Classes de dados           | `data class` com `copy`, `toString`, etc.   | Verbosidade extrema             |
| Programação funcional      | Totalmente integrada                        | Streams, mas mais verbosos      |
| Concorrência               | Coroutines leves                            | `CompletableFuture`, threads    |
| DSLs / Sintaxe fluente     | `infix`, lambdas com receiver               | Não disponível                  |
| Singleton / Static         | `object`, `companion object`                | Padrões e `static`              |