package ru.example.questrestart;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        if (Person.gotFood){
            TextView text = findViewById(R.id.textView);
            text.setText("Здесь больше ничего нет");
        }

    }

    public void backtoKitchen(View view) {
        Person.gotFood = true;
        Intent i = new Intent(Food.this, Kitchen.class);
        startActivity(i);
    }
}