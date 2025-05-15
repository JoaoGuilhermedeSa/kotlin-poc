fun String.palindromo(): Boolean = this == this.reversed()

fun extensionDemo() {
    println("arara".palindromo()) // true
}