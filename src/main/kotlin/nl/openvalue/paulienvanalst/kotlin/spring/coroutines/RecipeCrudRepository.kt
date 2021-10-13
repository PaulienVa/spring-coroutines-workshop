package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import org.springframework.data.annotation.Id
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface RecipeCrudRepository : ReactiveCrudRepository<RecipeRow, Long> {

    @Query("SELECT * FROM recipes;")
    fun retrieveAll() : Flux<RecipeRow>
}


@Table
data class RecipeRow(
    @Id var id:Long?, var name : String, var duration: Integer
)
