package com.tecmm.tala.sumaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    TextView varTxtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varTxtNum1 = (EditText) findViewById(R.id.edtxtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.edtxtNum2);
        varTxtResult = (TextView)findViewById(R.id.txtRestult);
    }
    public void doSum(View v){
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(varTxtNum2.getText().toString());
        int result = num1 + num2;
        varTxtResult.setText("El resultado es: " +result);
    }
    public void doRes(View v){
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(varTxtNum2.getText().toString());
        int result = num1 - num2;
        varTxtResult.setText("El resultado es: " +result);
    }
    public void doMult(View v){
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(varTxtNum2.getText().toString());
        int result = num1 * num2;
        varTxtResult.setText("El resultado es: " +result);
    }
    public void doDiv(View v){
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(varTxtNum2.getText().toString());
        int result = num1 / num2;
        varTxtResult.setText("El resultado es: " +result);
    }
}
