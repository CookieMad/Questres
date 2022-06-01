package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kitchen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
    }

    public void haller(View view) {
        Intent i = new Intent(Kitchen.this, Hall.class);
        startActivity(i);
    }

    public void Pecher(View view) {
        Intent i = new Intent(Kitchen.this, Pech.class);
        startActivity(i);
    }

    public void fooder(View view) {
       Intent i = new Intent(Kitchen.this, Food.class);
       startActivity(i);
    }
}