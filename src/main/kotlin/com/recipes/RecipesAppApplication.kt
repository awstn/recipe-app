package com.recipes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecipesAppApplication

fun main(args: Array<String>) {
	runApplication<RecipesAppApplication>(*args)
}
