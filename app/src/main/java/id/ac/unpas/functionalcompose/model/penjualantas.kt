package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class penjualantas(
    @PrimaryKey val id: String,
    val tanggal: String,
    val merek: String,
    val harga: String,
    val tipe: String
)
