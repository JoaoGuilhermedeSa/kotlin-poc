class HtmlBuilder {
    private val content = StringBuilder()
    fun body(block: HtmlBuilder.() -> Unit) {
        content.append("<body>\n")
        this.block()
        content.append("</body>")
    }
    fun p(text: String) {
        content.append("<p>$text</p>\n")
    }
    override fun toString() = content.toString()
}

fun dslDemo() {
    val html = HtmlBuilder().apply {
        body {
            p("Hello, mundo Kotlin DSL!")
        }
    }
    println(html)
}