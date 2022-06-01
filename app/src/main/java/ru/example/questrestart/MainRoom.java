package ru.example.questrestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_room);
    }

    public void haller(View view) {
    Intent i = new Intent(MainRoom.this, Hall.class);
    startActivity(i);

    }

    public void fireStoner(View view) {
        Intent i = new Intent(MainRoom.this, fireStone.class);
        startActivity(i);
    }


}