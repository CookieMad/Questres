package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Roof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roof);

        if(Person.gotRune){
            Button b = findViewById(R.id.button12);
            b.setVisibility(View.VISIBLE);
        }
    }

    public void haller(View view) {
        Intent i = new Intent(Roof.this, Hall.class);
        startActivity(i);
    }

    public void ender(View view) {
        Intent i = new Intent(Roof.this, End.class);
        startActivity(i);
    }
}