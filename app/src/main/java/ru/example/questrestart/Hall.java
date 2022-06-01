package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hall extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall);
    }

    public void bedroom(View view) {
        Intent i = new Intent(Hall.this, Bedroom.class);
        startActivity(i);
    }

    public void kitchen(View view) {
        Intent i = new Intent(Hall.this, Kitchen.class);
        startActivity(i);
    }

    public void mainer(View view) {
        Intent i = new Intent(Hall.this, MainRoom.class);
        startActivity(i);
    }

    public void roofer(View view) {
        Intent i = new Intent(Hall.this, Roof.class);
        startActivity(i);
    }

    public void doorer(View view) {
    Intent i = new Intent(Hall.this, Door.class);
    startActivity(i);
    }
}