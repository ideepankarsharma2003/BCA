package com.example.practicalkimkbkc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void practical_01(View v){
//        Toast.makeText(this, "Going To Practical 01", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical01.class);
        startActivity(i);
    }
    public void practical_02(View v){
//        Toast.makeText(this, "Going To Practical 02", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical02.class);
        startActivity(i);
    }
    public void practical_03(View v){
//        Toast.makeText(this, "Going To Practical 03", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical03.class);
        startActivity(i);
    }
    public void practical_04(View v){
//        Toast.makeText(this, "Going To Practical 04", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical04.class);
        startActivity(i);
    }
    public void practical_05(View v){
//        Toast.makeText(this, "Going To Practical 05", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical05.class);
        startActivity(i);
    }
    public void practical_06(View v){
//        Toast.makeText(this, "Going To Practical 06", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical06.class);
        startActivity(i);
    }
    public void practical_07(View v){
//        Toast.makeText(this, "Going To Practical 07", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical07.class);
        startActivity(i);
    }
    public void practical_08(View v){
//        Toast.makeText(this, "Going To Practical 08", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical08.class);
        startActivity(i);
    }
    public void practical_09(View v){
//        Toast.makeText(this, "Going To Practical 09", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical09.class);
        startActivity(i);
    }
    public void practical_10(View v){
//        Toast.makeText(this, "Going To Practical 10", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical10.class);
        startActivity(i);
    }
    public void practical_11(View v){
//        Toast.makeText(this, "Going To Practical 11", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical11.class);
        startActivity(i);
    }
    public void practical_12(View v){
//        Toast.makeText(this, "Going To Practical 12", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this, Practical12.class);
        startActivity(i);
    }

}