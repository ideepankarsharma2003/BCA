package com.b.tech.whatsappweb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Cabs extends AppCompatActivity {
ImageButton olaImgButton,meruImgButton,uberImgButton;
Button olaButton , meruButton,uberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabs);
        olaButton = findViewById(R.id.olaButton);
        olaImgButton = findViewById(R.id.olaImgButton);
        meruButton = findViewById(R.id.meruButton);
        meruImgButton=findViewById(R.id.meruImgButton);
        uberButton = findViewById(R.id.uberButton);
        uberImgButton = findViewById(R.id.uberImgButton);

        olaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening ola for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.olacabs.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        olaImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening ola for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.olacabs.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        meruImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Meru for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.meru.in/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        meruButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Meru for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.meru.in/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        uberImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening uber for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://auth.uber.com/login/?breeze_local_zone=phx5&next_url=https%3A%2F%2Fm.uber.com%2F&state=sfZxYrnJVEw9_Pzu0PahZwvuMofqAzeJK-NyixBYAKw%3D");
                webView.setWebViewClient(new MyWebView());
            }
        });
        uberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening uber for your safe journey", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://auth.uber.com/login/?breeze_local_zone=phx5&next_url=https%3A%2F%2Fm.uber.com%2F&state=sfZxYrnJVEw9_Pzu0PahZwvuMofqAzeJK-NyixBYAKw%3D");
                webView.setWebViewClient(new MyWebView());
            }
        });

    }
}