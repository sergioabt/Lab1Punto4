package com.sergiobt.lab1punto4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {



    private RadioButton rCafe,rRojo,rGold,rSilver;
    private EditText ePrimera,eSegunda,eTercera,concatenar,tInfo;
    private Double n1,n2,n3;
    private Double result;
    private String one,two,tolerancia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCafe = (RadioButton)findViewById(R.id.rCafe);
        rRojo = (RadioButton)findViewById(R.id.rRojo);
        rGold = (RadioButton)findViewById(R.id.rGold);
        rSilver = (RadioButton)findViewById(R.id.rSilver);
        tInfo = (EditText) findViewById(R.id.tInfo);
        ePrimera = (EditText)findViewById(R.id.ePrimera);
        eSegunda = (EditText)findViewById(R.id.eSegunda);
        eTercera = (EditText)findViewById(R.id.eTercera);



    }

    public void Calcular (View view){


        n1 = Double.parseDouble(ePrimera.getText().toString());
        n2 = Double.parseDouble(eSegunda.getText().toString());

        one = ePrimera.getText().toString();
        two = eSegunda.getText().toString();
        concatenar = (EditText)findViewById(R.id.tInfo);
        concatenar.setText(one+two);

        result = Double.parseDouble(concatenar.getText().toString());



        if (rCafe.isChecked()) {
            tolerancia = " +/- 1%";

        } else if (rRojo.isChecked()) {
            tolerancia = " +/- 2%";

        } else if (rGold.isChecked()) {
            tolerancia = " +/- 5%";

        } else if (rSilver.isChecked()) {
            tolerancia = " +/- 10%";

        }

        if (eTercera.getText().toString().equals("0")) {
            result = result * 1;
            tInfo.setText(String.valueOf(result) + " Ohm " + tolerancia);

        } else if (eTercera.getText().toString().equals("1")) {

            result = result * 10;
            tInfo.setText(String.valueOf(result) + " Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("2")) {

            result = result / 10;
            tInfo.setText(String.valueOf(result) + "k Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("3")) {


            tInfo.setText(String.valueOf(result) + "k Ohm " + tolerancia);

        } else if (eTercera.getText().toString().equals("4")) {

            result = result * 10;
            tInfo.setText(String.valueOf(result) + "k Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("5")) {

            result = result / 10;
            tInfo.setText(String.valueOf(result) + "M Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("6")) {


            tInfo.setText(String.valueOf(result) + "M Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("7")) {

            result = result * 10;
            tInfo.setText(String.valueOf(result) + "M Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("8")) {

            result = result / 10;
            tInfo.setText(String.valueOf(result) + "G Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("9")) {


            tInfo.setText(String.valueOf(result) + "G Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("10")) {

            result = result / 10;
            tInfo.setText(String.valueOf(result) + " Ohm " + tolerancia);
        } else if (eTercera.getText().toString().equals("11")) {

            result = result / 100;
            tInfo.setText(String.valueOf(result) + " Ohm " + tolerancia);
        } else {
            tInfo.setText("Revise la 3 banda");
            eTercera.setError("Ingrese un dato correcto");

        }








    }
}