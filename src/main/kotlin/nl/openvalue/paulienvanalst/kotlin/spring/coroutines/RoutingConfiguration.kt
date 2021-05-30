package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter

@Configuration
open class RoutingConfiguration {

    @Bean
    open fun mainRouter(recipeHandler: RecipeHandler): RouterFunction<ServerResponse> =  coRouter {
        (GET("/api/v0/recipes") or GET("/api/recipes")).invoke(recipeHandler::findAll)
    }

}
