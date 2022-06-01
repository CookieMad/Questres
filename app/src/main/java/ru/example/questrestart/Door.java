package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Door extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
    }

    public void haller(View view) {
        Intent i = new Intent(Door.this, Hall.class);
        startActivity(i);
        Person.gotKey = true;
    }
}