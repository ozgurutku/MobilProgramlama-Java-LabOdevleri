package com.example.veritabani.girisekranivt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityVt extends AppCompatActivity {

    EditText adi, soyadi, telefon, kisiEskiAdi;
    TextView kisiBilgi;
    VTbaglanti kontrol;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adi=(EditText)findViewById(R.id.editTextAD);
        soyadi=(EditText)findViewById(R.id.editTextSOYAD);
        telefon=(EditText)findViewById(R.id.editTextTEL);
        kisiBilgi=(TextView)findViewById(R.id.textViewBilgi);
        kisiEskiAdi = (EditText)findViewById(R.id.editTextAD);
        kontrol = new VTbaglanti(this,"",null,1);  }

    public void btn_click(View view) {
        switch (view.getId()) {
            case R.id.buttonKAYDET:
                kontrol.yeniKayit(adi.getText().toString(), soyadi.getText().toString(),telefon.getText().toString());
                break;
            case R.id.buttonGUNCELLE:
                kontrol.güncelleKayit(kisiEskiAdi.getText().toString(),adi.getText().toString());
                break;
            case R.id.buttonLISTE:
                kontrol.listeleKayit(kisiBilgi);
                break;
            case R.id.buttonSIL:
                kontrol.silKayit(adi.getText().toString());
                break;
        }  }  }


