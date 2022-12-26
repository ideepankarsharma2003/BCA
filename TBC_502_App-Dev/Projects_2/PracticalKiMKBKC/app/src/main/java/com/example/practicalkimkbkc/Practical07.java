package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Practical07 extends AppCompatActivity {
    TextView tv;
    EditText et;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical07);
        tv= findViewById(R.id.textView2);
        et= findViewById(R.id.editTextTextPersonName);
        b= findViewById(R.id.button5);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= et.getText().toString();
                name= "Your name is:  "+ name;
                tv.setText(name);
            }
        });
    }
    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_LONG).show();
        startActivity(i);
    }

}