package com.kotlinboot.kotlintesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTestingApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestingApplication>(*args)
}
