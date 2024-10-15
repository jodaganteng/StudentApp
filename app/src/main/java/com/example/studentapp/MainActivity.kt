package com.example.studentapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.Recycler

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: StudentViewModel
    private lateinit var adapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(StudentViewModel::class.java)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        adapter = StudentAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val nimEditText: EditText = findViewById(R.id.nimEditText)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val nim = nimEditText.text.toString()
            if (name.isNotEmpty() && nim.isNotEmpty()) {
                viewModel.insertStudent(Student(name = name, nim = nim))
                nameEditText.text.clear()
                nimEditText.text.clear()
            }
        }

        viewModel.allStudents.observe(this) { students ->
            adapter.submitList(students)
        }
    }
}