package ru.example.questrestart;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Death extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death);

    }


    public void nextLife(View view) {
        Intent life = new Intent(Death.this, Bedroom.class);
        startActivity(life);
    }
}