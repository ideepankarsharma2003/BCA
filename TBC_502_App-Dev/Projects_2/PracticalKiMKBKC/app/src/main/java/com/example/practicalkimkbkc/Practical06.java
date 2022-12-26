package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Practical06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical06);
    }
    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_LONG).show();
        startActivity(i);
    }
    public void show_toast(View v){

        Toast.makeText(this, "Amazing Toast !!!!", Toast.LENGTH_LONG).show();
    }
}