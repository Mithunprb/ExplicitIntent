package com.example.android.explicitintent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class ExplictIntent extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Toast.makeText(
                    ExplictIntent.this,
                    "Going back!!",
                    Toast.LENGTH_SHORT
            ).show();

            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        });
    }
}
