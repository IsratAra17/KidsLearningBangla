package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button = findViewById(R.id.btnsiki);
    }

    public void Button(View view) {
        if (button != null) {
            Intent intent = new Intent(first.this, MainActivity.class);
            startActivity(intent);


        }
    }
}