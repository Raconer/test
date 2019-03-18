package com.kotlin.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.kotlin.business")
class WebApplication

fun main(args: Array<String>) {
    System.out.println("Start Main")
    //SpringApplication.run(WebApplication::class.java, *args)
    runApplication<WebApplication>(*args)
}