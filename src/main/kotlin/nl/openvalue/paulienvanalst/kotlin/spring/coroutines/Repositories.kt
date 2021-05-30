package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import kotlinx.coroutines.flow.Flow
import org.springframework.data.annotation.Id
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface RecipesRepository : ReactiveCrudRepository<RecipeRow, Long> {

    @Query("SELECT * FROM recipes;")
    override fun findAll(): Flux<RecipeRow>
}

@Repository
interface RecipesRepository2 : CoroutineCrudRepository<RecipeRow, Long> {

    @Query("SELECT * FROM recipes;")
    override fun findAll(): Flow<RecipeRow>
}

@Table
data class RecipeRow(@Id var id:Long?, var name : String, var duration: Int)
