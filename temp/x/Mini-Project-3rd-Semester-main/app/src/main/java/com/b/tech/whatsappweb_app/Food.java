package com.b.tech.whatsappweb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Food extends AppCompatActivity {
ImageButton swiggyImgButton, foodPandImgButton,uberEatsImgButton;
Button swiggyButton,foodPandaButton,uberEatsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        swiggyButton= findViewById(R.id.swiggyButton);
        swiggyImgButton = findViewById(R.id.swigyImgButton);
        foodPandaButton = findViewById(R.id.foodPandaButton);
        foodPandImgButton = findViewById(R.id.foodPandaImgButton);
        uberEatsButton = findViewById(R.id.uberEatsBUtton);
        uberEatsImgButton = findViewById(R.id.uberEatsImgButton);



        swiggyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.swiggy.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        swiggyImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.swiggy.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        foodPandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.foodpanda.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        foodPandImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.foodpanda.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        uberEatsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.ubereats.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        uberEatsImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Taking to you yummy!!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.ubereats.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });

    }
}