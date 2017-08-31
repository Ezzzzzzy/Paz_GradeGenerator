package com.example.paz.gradegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5;
    Button  submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        submit = (Button) findViewById(R.id.submit);
    }

    public void callSecond(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        double quiz1;
        double quiz2;
        double Sw;
        double labex;
        double majex;
        double finalgrade;
        String fin;
        quiz1 = Integer.parseInt(et1.getText().toString()) * .1;
        quiz2 = Integer.parseInt(et1.getText().toString()) * .1;
        Sw  = Integer.parseInt(et1.getText().toString()) * .1;
        labex = Integer.parseInt(et1.getText().toString()) * .4;
        majex = Integer.parseInt(et1.getText().toString()) * .3;
        finalgrade = quiz1 + quiz2 + labex + majex + Sw;
        fin = String.valueOf(finalgrade);
        intent.putExtra("sample",fin);
        startActivity(intent);
    }
}
