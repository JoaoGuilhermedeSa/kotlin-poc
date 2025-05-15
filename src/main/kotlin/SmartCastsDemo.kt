fun smartCastDemo(obj: Any) {
    if (obj is String) {
        println("Tamanho da string: ${obj.length}")
    }
}