package com.example.practicalkimkbkc;

import static android.widget.Toast.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Practical12 extends AppCompatActivity {
    TextView t;
    RadioButton r1, r2, r3;
    RadioGroup rg;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical12);
        t= findViewById(R.id.textView5);
        r1= findViewById(R.id.radioButton9);
        r2= findViewById(R.id.radioButton10);
        r3= findViewById(R.id.radioButton11);
        rg=  findViewById(R.id.radioGroup);

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Right");
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Wrong");
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Wrong");
            }
        });
    }
}
