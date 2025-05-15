fun main() {
    println("== Null Safety ==")
    nullSafetyDemo()

    println("\n== Data Class ==")
    dataClassDemo()

    println("\n== Extension Function ==")
    extensionDemo()

    println("\n== Coroutines ==")
    coroutineDemo()

    println("\n== Smart Cast ==")
    smartCastDemo("Kotlin")

    println("\n== Sealed Class ==")
    processarResultado(Sucesso("Deu bom"))
    processarResultado(Erro("Deu ruim"))

    println("\n== DSL Demo ==")
    dslDemo()

    println("\n== Infix Operator ==")
    infixDemo()

    println("\n== Null Operators ==")
    nullOperatorsDemo()

    println("\n== Collections High-Order ==")
    collectionsDemo()

    println("\n== Local Function & Receiver Lambda ==")
    localFunctionDemo()
    lambdaWithReceiverDemo()

    println("\n== Singleton & Companion ==")
    objectCompanionDemo()

    println("\n== Typealias & Destructuring ==")
    typealiasDestructuringDemo()
}