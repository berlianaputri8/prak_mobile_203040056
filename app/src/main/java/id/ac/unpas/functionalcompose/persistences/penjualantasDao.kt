package id.ac.unpas.functionalcompose.persistences


import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.penjualantas

@Dao
interface penjualantasDao {


    @Query("SELECT * FROM penjualantas")
    fun loadAll(): LiveData<List<penjualantas>>
    @Query("SELECT * FROM penjualantas WHERE id = :id")
    fun find(id: String): penjualantas?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: penjualantas)
    @Delete
    fun delete(item: penjualantas)





}
