package com.example.practicalkimkbkc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Practical02 extends AppCompatActivity {

    private Button b;
    private TextView tv;
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical02);
        b= findViewById(R.id.p2button);
        tv= findViewById(R.id.p2textView);
        et= findViewById(R.id.p2editTextTextPersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= et.getText().toString();
                int kg= Integer.parseInt(s);

                double pound= kg*2.205;
                tv.setText("The corresponding Pounds value is: "+ pound);
            }
        });
    }
}