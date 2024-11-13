package com.example.adulting101.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.adulting101.R
import android.view.View

class CoursesActivity : AppCompatActivity() {

    private lateinit var courseContentTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val btnCooking: Button = findViewById(R.id.btn_cooking)
        val btnFinance: Button = findViewById(R.id.btn_finance)
        val btnSelfCare: Button = findViewById(R.id.btn_self_care)
        courseContentTextView = findViewById(R.id.course_content_textview)

        btnCooking.setOnClickListener {
            displayCourseContent("Cooking", listOf(
                "1. Basic knife skills are essential for efficient cooking.",
                "2. Understanding ingredients enhances the flavors of dishes.",
                "3. Different cooking techniques can alter the taste and texture of food.",
                "4. Meal planning helps save time and ensures a balanced diet.",
                "5. Food safety and hygiene are crucial to prevent foodborne illnesses."
            ))
        }
        btnFinance.setOnClickListener {
            displayCourseContent("Finance", listOf(
                "1. Budgeting helps track and manage your expenses.",
                "2. Saving and investing are key to financial stability.",
                "3. Understanding credit can help you make better borrowing decisions.",
                "4. Managing debt is important to maintain financial health.",
                "5. Planning for retirement ensures financial security in later years."
            ))
        }
        btnSelfCare.setOnClickListener {
            displayCourseContent("Self Care", listOf(
                "1. Mental health awareness is crucial for overall well-being.",
                "2. Physical fitness improves health and longevity.",
                "3. Healthy eating habits contribute to better physical and mental health.",
                "4. Stress management techniques can enhance quality of life.",
                "5. Time management skills help balance work and personal life."
            ))
        }
    }

    private fun displayCourseContent(title: String, contents: List<String>) {
        val contentString = contents.joinToString("\n")
        courseContentTextView.text = "$title:\n$contentString"
        courseContentTextView.visibility = View.VISIBLE // Set visibility to visible
    }
}
