package io.paketo.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SomethingBakedService

fun main(args: Array<String>) {
	runApplication<SomethingBakedService>(*args)
}
