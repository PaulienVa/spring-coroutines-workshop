package nl.openvalue.paulienvanalst.kotlin.spring.coroutines

import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CoroutineRepository : CoroutineCrudRepository<RecipeRow, Long> {
    @Query("SELECT * FROM recipes;")
    fun retrieveAll() : Flow<RecipeRow>
}
