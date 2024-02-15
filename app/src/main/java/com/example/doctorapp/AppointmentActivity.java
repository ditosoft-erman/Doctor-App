package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class AppointmentActivity extends AppCompatActivity {
    TextView dateTextView;
    DatePickerDialog.OnDateSetListener dateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        dateTextView = findViewById(R.id.appointDate);

        // Date picker dialog listener
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                // Update the TextView with the selected date
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                dateTextView.setText(selectedDate);

                // Use the selected date information here as needed
                String formattedDate = year + "-" + (month + 1) + "-" + dayOfMonth;
                // Now you can use the formattedDate string to store or manipulate the selected date.
            }
        };

        Button btn;
        EditText nameEt, numberEt;
        TextView dateET;
        SharedPreferences sharedPreferences;


        nameEt = (EditText) findViewById(R.id.name);

        numberEt = (EditText) findViewById(R.id.number);
        dateET = (TextView) findViewById(R.id.appointDate);
        btn = (Button) findViewById(R.id.appointBtn);
        sharedPreferences = getSharedPreferences("Appointments", MODE_PRIVATE);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = nameEt.getText().toString().trim();
                String deyt = dateET.getText().toString().trim();
                String number = numberEt.getText().toString().trim();

                if (name.isEmpty() || deyt.isEmpty() || number.isEmpty()) {
                    Toast.makeText(AppointmentActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("name", name);
                    editor.putString("phone", number);
                    editor.putString("date", deyt);
                    editor.apply();




                    Toast.makeText(AppointmentActivity.this, "Appointment Saved", Toast.LENGTH_SHORT).show();
                }
                }
            }
        );
    }
    public void showDatePickerDialog(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                dateSetListener,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
}