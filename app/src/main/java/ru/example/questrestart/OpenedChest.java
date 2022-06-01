package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OpenedChest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opened_chest);
        Person.gotForm = true;
    }



    public void bedroom(View view) {
        Intent i = new Intent(OpenedChest.this, Bedroom.class);
        startActivity(i);
    }
}