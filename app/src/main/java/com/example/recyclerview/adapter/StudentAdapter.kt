package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.entities.Student

class StudentAdapter(private val students: MutableList<Student>)
    : RecyclerView.Adapter<StudentAdapter.ViewHolder> () {
    class ViewHolder (view: View): RecyclerView.ViewHolder(view) {

       private lateinit var Name: TextView
       private lateinit var Name2: TextView

       init {
        this.Name = view.findViewById(R.id.Name)
        this.Name2 = view.findViewById(R.id.Name2)
       }
        fun populate(student: Student) {
            this.Name.setText(student.name)
            this.Name2.setText(student.adminNo)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.populate(students[position] )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int  = students.size
}