package com.example.practicalkimkbkc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Practical08 extends AppCompatActivity {
    Button b;
    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical08);
        b= findViewById(R.id.button24);
        v= findViewById(R.id.vv);
    }

    public void playVideo(View view){

        String path= "android.resource://"+ getPackageName()+"/"+R.raw.video;
        v.setVideoPath(path);
        v.start();
    }
}