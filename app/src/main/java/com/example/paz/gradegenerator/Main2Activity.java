package com.example.paz.gradegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView RAFin,Fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RAFin = (TextView) findViewById(R.id.RAfin);
        Fin = (TextView) findViewById(R.id.Fin);
        String msg = getIntent().getStringExtra("sample");
        RAFin.setText(msg);
        double comp = Double.parseDouble(msg);
        if(comp  < 60){
            Fin.setText("FAILED");
        }
        else if(comp >=60 && comp <= 65){
            Fin.setText("3.0");
        }
        else if (comp >= 66 && comp <= 75 ){
            Fin.setText("2.75");
        }
        else if (comp >= 76 && comp <=80){
            Fin.setText("2.5");
        }
        else if (comp >= 81 && comp <=85){
            Fin.setText("2.0");
        }
        else if (comp >= 86 && comp <=90){
            Fin.setText("1.75");
        }
        else if (comp >= 91 && comp <=92){
            Fin.setText("1.5");
        }
        else if (comp >= 93 && comp <=94){
            Fin.setText("1.25");
        }
        else if (comp == 100){
            Fin.setText("1.0");
        }
    }

    public void backMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
