package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pech);
        if(Person.gotForm & Person.gotCoal & Person.gotMetal){
            Button rune = findViewById(R.id.button4);
            rune.setVisibility(View.VISIBLE);
        }

        if(Person.gotRune){
            Button rune = findViewById(R.id.button4);
            rune.setVisibility(View.INVISIBLE);
            TextView story = findViewById(R.id.textView);
            story.setText("Ты подходишь к печи. Больше тебе нечего делать");
        }

    }



    public void backtoKitchen(View view) {
        Intent i = new Intent(Pech.this, Kitchen.class);
        startActivity(i);
    }

    public void Runer(View view) {
        Intent i = new Intent();
        startActivity(i);
    }
}