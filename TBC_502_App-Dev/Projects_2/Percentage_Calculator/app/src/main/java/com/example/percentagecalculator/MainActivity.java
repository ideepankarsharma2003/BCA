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
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.button);
        tv= findViewById(R.id.textView6);
        et1= findViewById(R.id.editTextTextPersonName2);
        et2= findViewById(R.id.editTextTextPersonName3);
        et3= findViewById(R.id.editTextTextPersonName4);
        et4= findViewById(R.id.editTextTextPersonName5);
        et5= findViewById(R.id.editTextTextPersonName6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DONE !", Toast.LENGTH_SHORT).show();
                String s1= et1.getText().toString();
                String s2= et2.getText().toString();
                String s3= et3.getText().toString();
                String s4= et4.getText().toString();
                String s5= et5.getText().toString();

                double i1= Double.parseDouble(s1);
                double i2= Double.parseDouble(s2);
                double i3= Double.parseDouble(s3);
                double i4= Double.parseDouble(s4);
                double i5= Double.parseDouble(s5);

                double sum= i1+i2+i3+i4+i5;

                tv.setText("The percentage is: "+ sum/5);
            }
        });

    }
}