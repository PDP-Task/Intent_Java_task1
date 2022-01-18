package com.example.intentjava_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_main);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("key","Name: Samandar, Age: 18");
            startActivity(intent);
        });
    }
}