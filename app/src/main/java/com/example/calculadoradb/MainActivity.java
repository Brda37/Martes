package com.example.calculadoradb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ptNumero1,ptNumero2;
    private TextView tvResp;
    private Button sum,res,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptNumero1=findViewById(R.id.ptNumero1);
        ptNumero2=findViewById(R.id.ptNumero2);
        tvResp=findViewById(R.id.tvResp);
        sum=findViewById(R.id.sum);
        res=findViewById(R.id.res);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        sum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float numero1= Integer.parseInt(ptNumero1.getText().toString());
                float numero2= Integer.parseInt(ptNumero2.getText().toString());
                if(numero1>=0 && numero2>=0){
                    float sumar = numero1+numero2;
                    tvResp.setText(String.valueOf(sumar));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numero1= Integer.parseInt(ptNumero1.getText().toString());
                float numero2= Integer.parseInt(ptNumero2.getText().toString());
                if (numero1>=0 && numero2>=0){
                    if (numero2!=0){
                        float divi = numero1/numero2;
                        tvResp.setText(String.valueOf(divi));
                    }else{tvResp.setText("No se puede dividir por 0");}
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numero1= Integer.parseInt(ptNumero1.getText().toString());
                float numero2= Integer.parseInt(ptNumero2.getText().toString());
                if(numero1>=0 && numero2>=0){
                    float multi = numero1*numero2;
                    tvResp.setText(String.valueOf(multi));
                }
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numero1= Integer.parseInt(ptNumero1.getText().toString());
                float numero2= Integer.parseInt(ptNumero2.getText().toString());
                if(numero1>=0 && numero2>=0){
                    float res = numero1-numero2;
                    tvResp.setText(String.valueOf(res));
                }
            }
        });
    }
}