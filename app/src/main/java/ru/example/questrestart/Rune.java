package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Rune extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rune);
    }


    public void kitchen(View view) {
        Intent i = new Intent(Rune.this, Kitchen.class);
        startActivity(i);
    }
}