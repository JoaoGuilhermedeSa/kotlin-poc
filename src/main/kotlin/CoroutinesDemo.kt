import kotlinx.coroutines.*

fun coroutineDemo() = runBlocking {
    launch {
        delay(1000)
        println("Feito!")
    }
    println("Esperando...")
}