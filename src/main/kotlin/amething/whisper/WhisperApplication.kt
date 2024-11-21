package amething.whisper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WhisperApplication

fun main(args: Array<String>) {
    runApplication<WhisperApplication>(*args)
}
