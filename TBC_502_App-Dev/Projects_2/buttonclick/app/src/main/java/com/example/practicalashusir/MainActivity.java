package com.example.practicalashusir;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void demo(View view){
        EditText edt= findViewById(R.id.edt);
        TextView txv= findViewById(R.id.txtv);
        txv.setText("Hello "+ edt.getText()+ '!');

    }
}