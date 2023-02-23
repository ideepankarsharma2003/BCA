package com.b.tech.whatsappweb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Hotels extends AppCompatActivity {
ImageButton oyoImgButton, myTripImgButton, yatraImgButton;

Button oyoButton, yatraButton, myTripButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        oyoImgButton = findViewById(R.id.oyoImgButton);
        oyoButton = findViewById(R.id.oyoButton);
        yatraButton = findViewById(R.id.yartaButton);
        yatraImgButton = findViewById(R.id.yartaImgButton);
        myTripButton = findViewById(R.id.myTripButton);
        myTripImgButton = findViewById(R.id.myTripImgButton);
        oyoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.oyorooms.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        oyoImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.oyorooms.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        yatraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.yatra.com/?utm_source=google&utm_medium=cpc&utm_campaign=&gclid=Cj0KCQiA5aWOBhDMARIsAIXLlkctIuum3gQ1l9eH9xLuxVGWAHzaTpSgf13gh2zpSuMtnfmmzZ2nuh0aApHNEALw_wcB");
                webView.setWebViewClient(new MyWebView());
            }
        });
        yatraImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.yatra.com/?utm_source=google&utm_medium=cpc&utm_campaign=&gclid=Cj0KCQiA5aWOBhDMARIsAIXLlkctIuum3gQ1l9eH9xLuxVGWAHzaTpSgf13gh2zpSuMtnfmmzZ2nuh0aApHNEALw_wcB");
                webView.setWebViewClient(new MyWebView());
            }
        });
        myTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.makemytrip.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        myTripImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Oyo for your safe Room", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.makemytrip.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
    }
}