package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.StudentAdapter
import com.example.recyclerview.entities.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView =
            findViewById(R.id.rvStudents)
        val adapter =StudentAdapter(this.genStudents())
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)
        adapter.notifyDataSetChanged()
    }

    private  fun genStudents() : MutableList<Student> {
        val students= mutableListOf<Student>()
        students.add(Student("scii/02594/2020",
            "Philemon MURAYA"))
        students.add(Student("scii/034248/2019",
            "simon abell"))
        students.add(Student("scii/05486/2020",
            "james bond"))
        students.add(Student("scii/07687/2020",
            "abel mutua"))
        students.add(Student("scii/00617/2020",
            "peter chemutai"))
        students.add(Student("scii/05648/2020",
            "simon kange"))
        students.add(Student("scii/07686/2020",
            "simon wabet"))
        students.add(Student("scii/0987687/2020",
            "hurry liam"))
        students.add(Student("scii/00687/2020",
            "peter thuku"))
        students.add(Student("scii/0748/2020",
            "giddy apple"))
        students.add(Student("scii/07636/2020",
            "james kenyatta"))
        students.add(Student("scii/06687/2020",
            "abel team"))
         return students

    }
}