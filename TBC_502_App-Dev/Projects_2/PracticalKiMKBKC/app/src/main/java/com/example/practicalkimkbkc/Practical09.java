package com.example.practicalkimkbkc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Practical09 extends AppCompatActivity {
    Button b;
    VideoView v;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical09);
        b= findViewById(R.id.button25);
        v= findViewById(R.id.vv1);
        mc= new MediaController(this);
    }
    public void playVideoWithMediaController(View view){

        String path= "android.resource://"+ getPackageName()+"/"+R.raw.video;
        mc.setAnchorView(view);
        v.setMediaController(mc);
        v.setVideoPath(path);
        v.start();
    }
}