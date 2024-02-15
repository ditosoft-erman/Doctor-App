package com.example.doctorapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button btn;
        btn = (Button) findViewById(R.id.pending);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDashboardActivity();
            }
        });

        CardView card1, card2, card3, card4, card5, card6, card7;


         card1 = (CardView) findViewById(R.id.card11);
         card2 = (CardView) findViewById(R.id.derma);
         card3 = (CardView) findViewById(R.id.gyne);
         card4 =  (CardView) findViewById(R.id.opthal);
         card5 = (CardView) findViewById(R.id.orthod);
         card6 = (CardView) findViewById(R.id.neuro);
        card7 = (CardView) findViewById(R.id.anest);

         card1.setOnClickListener(this);
         card2.setOnClickListener(this);
         card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);

    }
    public void openDashboardActivity(){
        Intent intent = new Intent(this, DisplayAppointmentActivity.class);
        startActivity(intent);
    }



    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){
            case R.id.card11:
                i = new Intent(this, CardiologistActivity.class);
                startActivity(i);
                break;
            case R.id.derma:
                i = new Intent(this, DermatologistActivity.class);
                startActivity(i);
                break;
            case R.id.gyne:
                i = new Intent(this, GynecologistActivity.class);
                startActivity(i);
                break;
            case R.id.opthal:
                i = new Intent(this, OpthalmologistActivity.class);
                startActivity(i);
                break;
            case R.id.orthod:
                i = new Intent(this, OrthodonistActivity.class);
                startActivity(i);
                break;
            case R.id.neuro:
                i = new Intent(this, NeurologistActivity.class);
                startActivity(i);
                break;
            case R.id.anest:
                i = new Intent(this, AnesthesiologistActivity.class);
                startActivity(i);
                break;
        }
    }
}