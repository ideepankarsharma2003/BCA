package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Practical04 extends AppCompatActivity {
    TextView t;
    EditText e1, e2;
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical04);
        t= findViewById(R.id.textView4);
        e1= findViewById(R.id.editTextNumberDecimal3);
        e2= findViewById(R.id.editTextNumberDecimal4);
        r1= findViewById(R.id.radioButton);
        r2= findViewById(R.id.radioButton2);
        r3= findViewById(R.id.radioButton3);
        r4= findViewById(R.id.radioButton4);
        r5= findViewById(R.id.radioButton5);
        r6= findViewById(R.id.radioButton6);
        r7= findViewById(R.id.radioButton7);
        r8= findViewById(R.id.radioButton8);
        Button b= findViewById(R.id.button14);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt(e1.getText().toString());
                int num2= Integer.parseInt(e2.getText().toString());

                if (r1.isChecked()){
                    String s= Integer.toString(num1+num2);
                    t.setText(s);
                }
                else if (r2.isChecked()){
                    String s= Integer.toString(num1-num2);
                    t.setText(s);
                }
                else if (r3.isChecked()){
                    String s= Integer.toString(num1*num2);
                    t.setText(s);
                }
                else if (r4.isChecked()){
                    String s= Integer.toString(num1/num2);
                    t.setText(s);
                }
                else if (r5.isChecked()){
                    String s= Integer.toString(num1>>num2);
                    t.setText(s);
                }
                else if (r6.isChecked()){
                    String s= Integer.toString(num1<<num2);
                    t.setText(s);
                }
                else if (r7.isChecked()){
                    String s= Integer.toString(num1&num2);
                    t.setText(s);
                }
                else if (r8.isChecked()){
                    String s= Integer.toString(num1|num2);
                    t.setText(s);
                }
            }
        });









    }
}