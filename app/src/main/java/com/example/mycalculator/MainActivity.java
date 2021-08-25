package com.example.mycalculator;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_0;
    private Button btn_punto;

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_por;
    private Button btn_para;
    private Button btn_igual;
    private Button btn_clear;

    private TextView txtResultado;

    private double number;
    private double numTemp;
    private String operacion;
    private String respuesta;

    public void suma(double a, String ope){
        numTemp = a;
        operacion = ope;
        Log.d(TAG, "numero a y operacion: "+numTemp+" y "+operacion);
    }

    public void resta(double a,String ope){
        numTemp = a;
        operacion = ope;
    }

    public void por(double a,String ope){
        numTemp = a;
        operacion = ope;
    }

    public void para(double a,String ope){
        numTemp = a;
        operacion = ope;
    }

    public double num_0(double number){
        return this.number = number;
    }
    public double num_1(double number) {
        Log.d(TAG, "numero clicado" + number);
        return this.number = number; }
    public double num_2(double number){
        return this.number = number;
    }
    public double num_3(double number){
        return this.number = number;
    }
    public double num_4(double number){
        return this.number = number;
    }
    public double num_5(double number){
        return this.number = number;
    }
    public double num_6(double number){
        return this.number = number;
    }
    public double num_7(double number){
        return this.number = number;
    }
    public double num_8(double number){
        return this.number = number;
    }
    public double num_9(double number){
        return this.number = number;
    }
    public double igual(double a, String ope , double b){
        Log.d(TAG, "valores de la operacion: " +a+ope+b);
        if(ope == "+"){
            return a+b;
        }else if(ope == "-"){
            return a-b;
        }else if(ope == "*"){
            return a*b;
        }return a/b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btn_0 = findViewById(R.id.button0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_0(0);
            }
        });
        btn_1 = findViewById(R.id.button1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1(1);
            }
        });
        btn_2 = findViewById(R.id.button2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_2(2);
            }
        });
        btn_3 = findViewById(R.id.button3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_3(3);
            }
        });
        btn_4 = findViewById(R.id.button4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_4(4);
            }
        });
        btn_5 = findViewById(R.id.button5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_5(5);
            }
        });
        btn_6 = findViewById(R.id.button6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_6(6);
            }
        });
        btn_7 = findViewById(R.id.button7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_7(7);
            }
        });
        btn_8 = findViewById(R.id.button8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_8(8);
            }
        });
        btn_9 = findViewById(R.id.button9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_9(9);
            }
        });
        btn_punto = findViewById(R.id.buttonPunto);
        btn_igual = findViewById(R.id.buttonIgual);
        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta = igual(numTemp, operacion, number)+"";
//                number = igual(numTemp, operacion, number);
                txtResultado.setText(respuesta);
            }
        });

        btn_clear = findViewById(R.id.buttonClear);

        btn_suma = findViewById(R.id.buttonMas);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma(number,"+");
            }
        });

        btn_resta = findViewById(R.id.buttonMenos);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resta(number,"-");
            }
        });

        btn_por = findViewById(R.id.buttonPor);
        btn_por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                por(number,"*");
            }
        });

        btn_para = findViewById(R.id.buttonPara);
        btn_para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                para(number,"/");
            }
        });
    }
}