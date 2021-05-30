package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

//import kotlinx.coroutines.flow.flowOf
//import org.springframework.stereotype.Component
//import org.springframework.web.reactive.function.server.ServerRequest
//import org.springframework.web.reactive.function.server.ServerResponse
//import org.springframework.web.reactive.function.server.ServerResponse.ok
//import org.springframework.web.reactive.function.server.bodyAndAwait

//@Component
open class RecipeHandler() {

//    suspend fun findAll(request: ServerRequest): ServerResponse {
//
//        val recipes = flowOf(
//            pancakes, scrambledEggs, fondue
//        )
//
//        return ok().bodyAndAwait(recipes)
//    }
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

