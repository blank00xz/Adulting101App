package com.example.adulting101.ui.theme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.adulting101.R

class FAQActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        val faqList = listOf(
            Pair(findViewById<Button>(R.id.faq1), findViewById<TextView>(R.id.answer1)),
            Pair(findViewById<Button>(R.id.faq2), findViewById<TextView>(R.id.answer2)),
            Pair(findViewById<Button>(R.id.faq3), findViewById<TextView>(R.id.answer3)),
            Pair(findViewById<Button>(R.id.faq4), findViewById<TextView>(R.id.answer4)),
            Pair(findViewById<Button>(R.id.faq5), findViewById<TextView>(R.id.answer5)),
            Pair(findViewById<Button>(R.id.faq6), findViewById<TextView>(R.id.answer6)),
            Pair(findViewById<Button>(R.id.faq7), findViewById<TextView>(R.id.answer7)),
            Pair(findViewById<Button>(R.id.faq8), findViewById<TextView>(R.id.answer8)),
            Pair(findViewById<Button>(R.id.faq9), findViewById<TextView>(R.id.answer9)),
            Pair(findViewById<Button>(R.id.faq10), findViewById<TextView>(R.id.answer10))
        )

        faqList.forEach { (button, answer) ->
            button.setOnClickListener {
                if (answer.visibility == View.VISIBLE) {
                    answer.visibility = View.GONE
                } else {
                    answer.visibility = View.VISIBLE
                }
            }
        }
    }
}
