package com.example.vucut_kitle_indeksi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText boy,kilo;
    Button hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boy = (EditText) findViewById(R.id.boy);
        kilo = (EditText) findViewById(R.id.kilo);
        hesapla = (Button) findViewById(R.id.hesapla);
        Intent intent = new Intent(this, Sayfa2.class);

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("vki",hesaplaVKİ());
                startActivity(intent);
            }
        });


    }

    private Float hesaplaVKİ(){

        String boyStr = boy.getText().toString();
        String kiloStr = kilo.getText().toString();

        if(boyStr != null && !boyStr.equals("") && kiloStr != null && !kiloStr.equals("")){
            float boyDeger = Float.parseFloat(boyStr) / 100;
            float kiloDeger = Float.parseFloat(kiloStr);

            float vki = kiloDeger / (boyDeger * boyDeger);
            return vki;
        }
        return 0f;
    }

}