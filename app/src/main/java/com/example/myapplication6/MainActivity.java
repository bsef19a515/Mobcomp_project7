package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no,res;
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no=findViewById(R.id.no1);
        res=findViewById(R.id.res);

        b1=findViewById(R.id.gram);
        b2=findViewById(R.id.lit);
        b3=findViewById(R.id.mg);
        b4=findViewById(R.id.pound);


    }

    public void Liter(View view) {
        Double text=Double.parseDouble(no.getText().toString());
        Double result=text;
        String l="lit";
        res.setText(result.toString()+l);
    }

    public void Gram(View view) {
        Double text=Double.parseDouble(no.getText().toString());
        Double result=text*1000;
        res.setText(result.toString()+'g');

    }

    public void Pound(View view) {
        Double text=Double.parseDouble(no.getText().toString());
        Double result=text*2.205;
        res.setText(result.toString()+'£');
    }

    public void Milligram(View view) {
        Double text=Double.parseDouble(no.getText().toString());
        Double result=text*1000000;
        String m="mg";
        res.setText(result.toString()+m);
    }
}