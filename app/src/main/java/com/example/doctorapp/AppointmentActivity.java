package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppointmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        Button btn;
        EditText nameEt, emailEt, numberEt;
        nameEt = (EditText) findViewById(R.id.name);
        emailEt = (EditText) findViewById(R.id.email);
        numberEt = (EditText) findViewById(R.id.number);
        btn = (Button) findViewById(R.id.appointBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEt.setText("");
                emailEt.setText("");
                numberEt.setText("");

                Toast.makeText(AppointmentActivity.this, "Appointment Set", Toast.LENGTH_LONG).show();
            }
        });
    }
}