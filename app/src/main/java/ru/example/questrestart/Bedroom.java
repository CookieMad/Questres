package ru.example.questrestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bedroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedroom);
        if(Person.gotKey){
            TextView text = findViewById(R.id.textView);
            text.setText("Ты осматриваешься вокруг себя и видишь средневековое крестьянское убранство. Пол стены и потолок сделаны из темного дерева. Рядом с кроватью ты замечаешь сундук, а также дверь в противоположной стороне комнаты.");

        }
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