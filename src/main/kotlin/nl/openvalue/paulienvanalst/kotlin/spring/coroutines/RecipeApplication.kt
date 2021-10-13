package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
open class RecipeApplication

fun main(args: Array<String>) {
    runApplication<RecipeApplication>(*args)
}
