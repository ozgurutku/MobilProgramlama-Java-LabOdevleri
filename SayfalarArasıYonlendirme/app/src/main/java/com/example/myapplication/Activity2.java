package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikincisayfa);

        button = (Button) findViewById(R.id.sayfa1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSayfa1();
            }
        });

        button = (Button) findViewById(R.id.shutdown);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shutDown();
            }
        });
    }

    public void openSayfa1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void shutDown() {
        finish();
        System.exit(0);
    }
}