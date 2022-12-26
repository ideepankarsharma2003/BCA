package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Practical05 extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical05);
        iv= findViewById(R.id.imageView2);
    }
    public void home(View v){
        Intent i= new Intent(this, MainActivity.class);
        Toast.makeText(this, "Going Back to Home", Toast.LENGTH_LONG).show();
        startActivity(i);
    }
    public void img_v(View v){

        iv.setImageResource(R.drawable.img);
        Toast.makeText(this, "Set the Picture", Toast.LENGTH_LONG).show();
    }
}