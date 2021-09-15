package com.example.vucut_kitle_indeksi;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Sayfa2 extends AppCompatActivity {

    TextView sonuc;
    Button anasayfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfa2);
        sonuc = (TextView) findViewById(R.id.sonuc);
        Float vki = getIntent().getFloatExtra("vki",-1.0f);
        displayVKİ(vki);
        anasayfa = (Button) findViewById(R.id.anasayfa);
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anaSayfayiAc();
            }
        });

    }

    private void displayVKİ(float vki){

        String vkiLabel = "";

        if(Float.compare(vki,19f) < 0){
            vkiLabel = "Zayıf";
        }else if(Float.compare(vki, 19f) >= 0 && Float.compare(vki, 24.9f) <=0){
            vkiLabel = "Sağlıklı kilo";
        }else if(Float.compare(vki, 25f) >= 0 && Float.compare(vki, 29.9f) <=0){
            vkiLabel = "Kilolu";
        }else{
            vkiLabel = "Obez";
        }

        vkiLabel = "Vücüt Kitle indeksiniz: "+vki + "\n" +vkiLabel;
        sonuc.setText(vkiLabel);
    }

    private void anaSayfayiAc() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
