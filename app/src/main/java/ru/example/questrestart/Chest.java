package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Chest extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        TextView text = findViewById(R.id.textView);
        if(Person.gotKey){
            Button but = findViewById(R.id.button3);
            but.setVisibility(View.VISIBLE);
            text.setText("Ты подходишь к сундуку c ключом в руках");
        }
        if(Person.gotForm){
            text.setText("Больше в сундуке ничего нет");
            Button but = findViewById(R.id.button3);
            but.setVisibility(View.INVISIBLE);
        }

    }

    public void bedroom(View view) {
        Intent i = new Intent(Chest.this, Bedroom.class);
        startActivity(i);
    }


    public void Open(View view) {
        Button but = findViewById(R.id.button3);
        but.setVisibility(View.INVISIBLE);
        Intent i = new Intent(Chest.this, OpenedChest.class);
        startActivity(i);
    }
}