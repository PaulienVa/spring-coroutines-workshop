package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.reactive.asFlow
import org.springframework.stereotype.Component

@Component
open class RecipeHandler(
    private val repository: RecipeCrudRepository,
    private val coroutineRepository: RecipeCoroutineRepository
) {

    fun findAll(): Flow<Recipe> {
        val noDB = flowOf(
            pancakes, scrambledEggs, fondue
        )

        val crudDB = repository.retrieveAll().map { Recipe(it.name, it.duration.toInt(), listOf(), "Something") }.asFlow()

        val coroutineDB = coroutineRepository.retrieveAll().map { Recipe(it.name, it.duration.toInt(), listOf(), "Something") }

        return coroutineDB
    }
}

private val pancakes = Recipe(
    "pancakes",
    20,
    listOf("2 eggs", "250gr flower", "500mL milk", "bit of salt"),
    "Mix everything and bake pancakes"
)
private val scrambledEggs = Recipe(
    "scrambled eggs",
    10,
    listOf("4 eggs", "2 tbsp milk", "bit of salt"),
    "Mix everything and bake and fold the eggs over"
)
private val fondue = Recipe(
    "fondue",
    45,
    listOf("cheese", "wine", "kirsch", "garlic"),
    "Cook the wine, add the cheese, add the kirsch and garlic"
)

