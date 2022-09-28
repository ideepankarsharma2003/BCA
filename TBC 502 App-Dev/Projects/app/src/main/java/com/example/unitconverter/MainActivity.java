package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private TextView tv;
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.button);
        tv= findViewById(R.id.textView);
        et= findViewById(R.id.editTextTextPersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted Successfully !!!", Toast.LENGTH_SHORT).show();
                String s= et.getText().toString();
                int kg= Integer.parseInt(s);

                double pound= kg*2.205;
                tv.setText("The corresponding Pounds value is: "+ pound);
            }
        });
    }
}