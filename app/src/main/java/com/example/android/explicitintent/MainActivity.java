package com.example.android.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
                        Toast.makeText(
                MainActivity.this,
                "Opening new activity",
                Toast.LENGTH_SHORT
        ).show();
                        Intent intent = new Intent(this, ExplictIntent.class);
                        this.startActivity(intent);
    });

    }
}