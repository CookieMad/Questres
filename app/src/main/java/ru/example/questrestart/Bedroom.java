package ru.example.questrestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bedroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedroom);

    }


    public void hall(View view){
        Intent i = new Intent(Bedroom.this, Hall.class);
        startActivity(i);
    }

    public void chest(View view) {
        Intent i = new Intent(Bedroom.this, Chest.class);
        startActivity(i);
    }
}