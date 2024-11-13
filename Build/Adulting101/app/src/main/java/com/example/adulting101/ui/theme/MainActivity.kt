package com.example.adulting101.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.adulting101.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_courses -> {
                    val intent = Intent(this, CoursesActivity::class.java)
                    startActivity(intent)
                }

                R.id.nav_faq -> {
                    val intent = Intent(this, FAQActivity::class.java)
                    startActivity(intent)
                }

                R.id.nav_todo -> {
                    val intent = Intent(this, ToDoActivity::class.java)
                    startActivity(intent)
                }

                R.id.nav_quiz -> {
                    val intent = Intent(this, QuizActivity::class.java)
                    startActivity(intent)
                }
            }
            drawerLayout.closeDrawers()
            true
        }

            // Set up button click listeners
            val btnCourses: Button = findViewById(R.id.button_courses)
            val btnFaq: Button = findViewById(R.id.button_faq)
            val btnTodo: Button = findViewById(R.id.button_todo)
            val btnQuiz: Button = findViewById(R.id.button_quiz)

            btnCourses.setOnClickListener {
                val intent = Intent(this, CoursesActivity::class.java)
                startActivity(intent)
            }

            btnFaq.setOnClickListener {
                val intent = Intent(this, FAQActivity::class.java)
                startActivity(intent)
            }

            btnTodo.setOnClickListener {
                val intent = Intent(this, ToDoActivity::class.java)
                startActivity(intent)
            }

            btnQuiz.setOnClickListener {
                val intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)

        }
    }
}
