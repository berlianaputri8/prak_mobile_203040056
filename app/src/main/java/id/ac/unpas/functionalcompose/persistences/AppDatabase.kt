package id.ac.unpas.functionalcompose.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.functionalcompose.model.penjualantas

@Database(entities = [penjualantas::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun penjualantasDao(): penjualantasDao
}