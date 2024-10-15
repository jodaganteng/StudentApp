package com.example.studentapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {
    @Query("SELECT * FROM students ORDER BY id ASC")
    fun getAllStudents(): LiveData<List<Student>>

    @Insert
    suspend fun insert(student: Student)
}