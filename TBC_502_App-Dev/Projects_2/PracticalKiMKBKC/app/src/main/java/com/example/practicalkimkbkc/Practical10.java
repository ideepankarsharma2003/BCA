package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Practical10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical10);
    }
    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}