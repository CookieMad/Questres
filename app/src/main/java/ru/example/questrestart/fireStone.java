package ru.example.questrestart;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class fireStone extends AppCompatActivity {
    boolean dogSleep = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_stone);
        if(Person.gotFood){
            Button b = findViewById(R.id.button10);
            b.setVisibility(View.VISIBLE);
        }

        if(Person.gotMetal){
            TextView story = findViewById(R.id.textView);
            story.setText("");
        }

    }

    public void doger(View view) {
        dogSleep = true;
        TextView story = findViewById(R.id.textView);
        story.setText("Ты открываешь консерву и кидаешьеё соаке. Она жадно съедает всё и возвращается на прежнее место где обарачивается в статую...");

        Button b = findViewById(R.id.button10);
        b.setVisibility(View.GONE);

        Button b1 = findViewById(R.id.button11);
        b1.setVisibility(View.VISIBLE);
    }

    public void coaler(View view) {
        TextView story = findViewById(R.id.textView);
        story.setText("Ты берешь уголь из печи. Несмотря на то что он не зажжен, ты чувтсвуешь его тепло. Также ты находишь в камине наполовину расплавленый слиток какого-то металла. Вот это удача!");
        Person.gotCoal = true;
        Person.gotMetal = true;

        Button b1 = findViewById(R.id.button11);
        b1.setVisibility(View.INVISIBLE);

    }

    public void back(View view) {
        Intent i = new Intent(fireStone.this, MainRoom.class);
        startActivity(i);
    }
}