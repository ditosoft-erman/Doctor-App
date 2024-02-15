package com.example.doctorapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doctorapp.R;

public class DisplayAppointmentActivity extends AppCompatActivity {

    TextView textViewName, textViewPhone, textViewDate;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_appointment);

        textViewName = findViewById(R.id.textViewName);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewDate = findViewById(R.id.textViewDate);

        sharedPreferences = getSharedPreferences("Appointments", MODE_PRIVATE);

        // Get appointment details from SharedPreferences
        String name = sharedPreferences.getString("name", "");
        String phone = sharedPreferences.getString("phone", "");
        String date = sharedPreferences.getString("date", "");

        // Set appointment details to TextViews
        textViewName.setText("Name: " + name);
        textViewPhone.setText("Phone: " + phone);
        textViewDate.setText("Date: " + date);
    }
}
