package com.example.samsung_java_lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.Hello_field);
        textView.setText("Goodby!");


        Toast.makeText(this, "hello Pablo", Toast.LENGTH_LONG).show();

    }
}