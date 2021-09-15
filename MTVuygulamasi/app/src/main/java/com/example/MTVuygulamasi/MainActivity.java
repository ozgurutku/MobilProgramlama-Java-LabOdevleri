package com.example.MTVuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] car = { "Otomobil", "Motosiklet", "Minibüs", "Panel Van ve Motorlu Karavanlar", "Otobüs", "Kamyonet, Kamyon, Çekici"};
    String[] carAge = { "1-3", "4-6", "7-11", "12-15", "16 ve üzeri",  };
    String[] carEngine = { "0-1300", "1301-1600", "1601-1800", "1801-2000", "2001-2500", "2001-2500", "2501-3000","3501-4000","4001-25000",};
    String[] carRegistrationDate = { "1.1.2018 ve öncesi", "1.1.2018 ve sonrası"};
    String[] carValue = { "0-51.800", "51.801-90.800", "90.801 ve üzeri"};

    Button sonuc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,car);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        Spinner spin1 = (Spinner) findViewById(R.id.spinner2);
        spin1.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter bb = new ArrayAdapter(this,android.R.layout.simple_spinner_item,carAge);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin1.setAdapter(bb);

        Spinner spin2 = (Spinner) findViewById(R.id.spinner3);
        spin2.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter cc = new ArrayAdapter(this,android.R.layout.simple_spinner_item,carEngine);
        cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin2.setAdapter(cc);

        Spinner spin3 = (Spinner) findViewById(R.id.spinner4);
        spin3.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter dd = new ArrayAdapter(this,android.R.layout.simple_spinner_item,carRegistrationDate);
        dd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin3.setAdapter(dd);

        Spinner spin4 = (Spinner) findViewById(R.id.spinner5);
        spin4.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter ff = new ArrayAdapter(this,android.R.layout.simple_spinner_item,carValue);
        ff.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin4.setAdapter(ff);

        result = (TextView) findViewById(R.id.result);
        sonuc = (Button) findViewById(R.id.button);
        spin4.setVisibility(View.INVISIBLE);
        sonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 0) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.051 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 0) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("733 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 0) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("410 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 0) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("309 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 0) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("109 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 1) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.830 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 1) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.372 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 1) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("796 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 1) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("563 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 1) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("216 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 2) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("3.234 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 2) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("2.526 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 2) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.488 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 2) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("906 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 2) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("351 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 3) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("5.095 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 3) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("3.923 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 3) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("2.306 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 3) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.372 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 3) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("541 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 4) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("7.640 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 4) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("5.547 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 4) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("3.466 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 4) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("2.070 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 4) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("819 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 5) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("10.655 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 5) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("9.268 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 5) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("5.790 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 5) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("3.113 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 5) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.143 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("16.226 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("14.600 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("8.794 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("4.389 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("1.610 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("25.513 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("22.030 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("12.974 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("5.790 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("2.306 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 6) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("41.756 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("31.312 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("18.544 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("8.333 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 7) && (spin3.getSelectedItemPosition() == 0)){
                    result.setText("3.234 TL");
                }

                //2018 sonrası


                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("1.051 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("733 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("410 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("309 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("109 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("1.155 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("806 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("450 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("341 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("120 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("1.261 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("879 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("492 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("372 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 0) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("130 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("1.830 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("1.372 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("796 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("563 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 0)){
                    result.setText("216 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("2.014 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("1.510 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("876 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("617 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 1)){
                    result.setText("236 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 0) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("2.197 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 1) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("1.647 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 2) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("954 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 3) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("674 TL");
                }
                if((spin.getSelectedItemPosition() == 0) && (spin1.getSelectedItemPosition() == 4) && (spin2.getSelectedItemPosition() == 1) & (spin3.getSelectedItemPosition() == 1) && (spin4.getSelectedItemPosition() == 2)){
                    result.setText("258 TL");
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.spinner1:
                Toast.makeText(getApplicationContext(),car[position] ,Toast.LENGTH_LONG).show();
                break;
            case R.id.spinner2:
                Toast.makeText(getApplicationContext(),carAge[position] ,Toast.LENGTH_LONG).show();
                break;
            case R.id.spinner3:
                Toast.makeText(getApplicationContext(),carEngine[position] ,Toast.LENGTH_LONG).show();
                break;
            case R.id.spinner4:
                Toast.makeText(getApplicationContext(),carRegistrationDate[position] ,Toast.LENGTH_LONG).show();
                Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
                Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
                if(spinner4.getSelectedItemPosition() == 1){
                    spinner5.setVisibility(View.VISIBLE);
                }if(spinner4.getSelectedItemPosition() == 0){
                    spinner5.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void mtvHesapla(){

    }
}