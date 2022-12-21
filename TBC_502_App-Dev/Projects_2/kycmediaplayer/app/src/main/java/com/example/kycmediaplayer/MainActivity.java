package com.example.kycmediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button b;
    VideoView v;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.button);
        v= findViewById(R.id.vv);
        mc= new MediaController(this);
    }
    public void playVideo(View view){
        String path= "android.resource://"+ getPackageName()+"/"+R.raw.video;
        v.setMediaController(mc);
        mc.setAnchorView(v);
        v.setVideoPath(path);
        v.start();
    }
}