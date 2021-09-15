package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btAdd, btSubtraction, btDivision, btMultiplication, btEqual, btComma, btMod, btExponential, btReset;
    Double firstNum;
    TextView resultScreen;
    Boolean commaState;
    String operationState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btAdd = findViewById(R.id.btAdd);
        btSubtraction = findViewById(R.id.btSubtraction);
        btDivision = findViewById(R.id.btDivision);
        btMultiplication = findViewById(R.id.btMultiplication);
        btMod =findViewById(R.id.btMod);
        btExponential=findViewById(R.id.btExponential);
        btEqual = findViewById(R.id.btEqual);
        btReset = findViewById(R.id.btReset);
        btComma = findViewById(R.id.btComma);
        resultScreen = findViewById(R.id.resultScreen);
        resultScreen.setText("0");
        firstNum = 0.0;
        commaState = false;
        operationState = "0";
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("=");
            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("+");
            }
        });
        btSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("-");
            }
        });
        btMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("*");
            }
        });
        btDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("/");
            }
        });
        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("zero");
            }
        });
        btComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol(",");
            }
        });
        btMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("%");
            }
        });
        btExponential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSymbol("^");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(0);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(4);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(5);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(6);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(7);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(8);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClick(9);
            }
        });
    }
    private void numClick(int sayi)
    {
        if(resultScreen.getText().toString() == "0"){
            resultScreen.setText("");
        }
        else if(
                resultScreen.getText().toString() == "+" ||
                        resultScreen.getText().toString() == "*" ||
                        resultScreen.getText().toString() == "/"||
                        resultScreen.getText().toString() == "-" ||
                        resultScreen.getText().toString() == "^" ||
                        resultScreen.getText().toString() == "%"
        )
        {
            resultScreen.setText("");
        }
        resultScreen.setText(resultScreen.getText() + String.valueOf(sayi));
    }
    private void numSymbol(String sembol)
    {
        switch (sembol)
        {
            default:
            {
                if(resultScreen.getText().toString() == "+" ||
                        resultScreen.getText().toString() == "*"
                        || resultScreen.getText().toString() == "/" ||
                        resultScreen.getText().toString() == "-" || resultScreen.getText().toString()
                        == "^" || resultScreen.getText().toString() == "%")
                {
                    if(operationState == "*" || operationState == "/" || operationState
                            == "%")
                        firstNum = -1*firstNum;
                    resultScreen.setText(sembol);
                    operationState = sembol;
                }
                else
                {
                    firstNum =
                            Double.parseDouble(resultScreen.getText().toString());
                    resultScreen.setText(sembol);
                    operationState = sembol;
                }
            }
            break;
            case "zero":
            {
                firstNum = 0.0;
                resultScreen.setText("0");
                operationState = "0";
            }
            break;
            case "=":
            {
                if(resultScreen.getText().toString() == "+" ||
                        resultScreen.getText().toString() == "*"
                        || resultScreen.getText().toString() == "/" ||
                        resultScreen.getText().toString() == "-" || resultScreen.getText().toString()
                        == "^" || resultScreen.getText().toString() == "%")
                {
                }
                else
                {
                    switch (operationState)
                    {
                        default:
                        {
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "+":
                        {
                            firstNum = firstNum +
                                    Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "-":
                        {
                            firstNum = firstNum -
                                    Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "/":
                        {
                            firstNum = firstNum /
                                    Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "*":
                        {
                            firstNum = firstNum *
                                    Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "^":
                        {
                            firstNum
                                    =Math.pow(firstNum,Double.parseDouble(resultScreen.getText().toString()));
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                        case "%":
                        {
                            firstNum = firstNum %
                                    Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText(firstNum.toString());
                        }
                        break;
                    }
                }
            }
            break;
            case ",":
            {
            }
            break;
        }
    }
}