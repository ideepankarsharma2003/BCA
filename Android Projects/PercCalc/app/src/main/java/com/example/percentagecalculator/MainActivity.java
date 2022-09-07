package com.example.percentagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private EditText e4;
    private EditText e5;
    private TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.button);
        e1= findViewById(R.id.editTextNumberDecimal);
        e2= findViewById(R.id.editTextNumberDecimal2);
        e3= findViewById(R.id.editTextNumberDecimal3);
        e4= findViewById(R.id.editTextNumberDecimal4);
        e5= findViewById(R.id.editTextNumberDecimal5);
        t1= findViewById(R.id.textView7);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Done !", Toast.LENGTH_SHORT).show();
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                String s3= e3.getText().toString();
                String s4= e4.getText().toString();
                String s5= e5.getText().toString();


                double d1= Double.parseDouble(s1);
                double d2= Double.parseDouble(s2);
                double d3= Double.parseDouble(s3);
                double d4= Double.parseDouble(s4);
                double d5= Double.parseDouble(s5);
                double sum= d1+d2+d3+d4+d5;

                t1.setText("The percentage is: " + sum/5 );




            }
        });





    }
}