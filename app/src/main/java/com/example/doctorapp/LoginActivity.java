package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = (Button) findViewById(R.id.LoginBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDashboardActivity();
            }
        });
        {

        }

    }

    public void openDashboardActivity(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
}