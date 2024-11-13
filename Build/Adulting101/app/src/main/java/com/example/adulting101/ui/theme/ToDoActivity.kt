package com.example.adulting101.ui.theme

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.adulting101.R
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ToDoActivity : AppCompatActivity() {

    private lateinit var tvSelectedCookingDate: TextView
    private lateinit var tvSelectedFinanceDate: TextView
    private lateinit var tvSelectedSCareDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        // Initialize TextViews
        tvSelectedCookingDate = findViewById(R.id.tvSelectedCookingDate)
        tvSelectedFinanceDate = findViewById(R.id.tvSelectedFinanceDate)
        tvSelectedSCareDate = findViewById(R.id.tvSelectedSCareDate)

        // Set up buttons and their click listeners
        val btnCookingDatePicker: Button = findViewById(R.id.btnCookingDatePicker)
        val btnFinanceDatePicker: Button = findViewById(R.id.btnFinanceDatePicker)
        val btnSCareDatePicker: Button = findViewById(R.id.btnSCareDatePicker)

        btnCookingDatePicker.setOnClickListener {
            showDatePicker(tvSelectedCookingDate)
        }

        btnFinanceDatePicker.setOnClickListener {
            showDatePicker(tvSelectedFinanceDate)
        }

        btnSCareDatePicker.setOnClickListener {
            showDatePicker(tvSelectedSCareDate)
        }
    }

    private fun showDatePicker(textView: TextView) {
        // Get the current date
        val calendar = Calendar.getInstance()

        // Create a DatePickerDialog
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, monthOfYear, dayOfMonth ->
                // Create a new Calendar instance to hold the selected date
                val selectedDate = Calendar.getInstance()
                // Set the selected date using the values received from the DatePicker dialog
                selectedDate.set(year, monthOfYear, dayOfMonth)
                // Create a SimpleDateFormat to format the date as "dd/MM/yyyy"
                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                // Format the selected date into a string
                val formattedDate = dateFormat.format(selectedDate.time)
                // Update the TextView to display the selected date with the "Selected Date: " prefix
                textView.text = "Selected Date: $formattedDate"
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        // Show the DatePicker dialog
        datePickerDialog.show()
    }
}
