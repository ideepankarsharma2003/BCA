package com.b.tech.whatsappweb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Shopping extends AppCompatActivity {
 ImageButton amazonImg , flipkartImg , ebayImg;
 Button amazonButton, flipkartButton , ebayButton;


    String getUrlNo() {
        return urlNo;
    }

    public String urlNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_shopping);

           amazonImg = findViewById(R.id.amazonImg);
           amazonButton  =findViewById(R.id.amazonButton);
           flipkartButton = findViewById(R.id.flipkartButton2);
           flipkartImg = findViewById(R.id.flipkartImg2);
        ebayImg = findViewById(R.id.ebayImg);
        ebayButton = findViewById(R.id.ebayButton);
            amazonImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext()  , "Opening amazon for your safe shopping", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_my_view);
                    WebView webView;
                    webView = findViewById(R.id.webView);
                    webView.getSettings().setJavaScriptEnabled(true);

                    webView.loadUrl("https://www.amazon.in/");
                    webView.setWebViewClient(new MyWebView());
                }
            });
        amazonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening amazon for your safe shopping", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;
                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.amazon.in/");
                webView.setWebViewClient(new MyWebView());

            }

        });
        flipkartImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Flipkart for your safe shopping", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;

                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.flipkart.com/");
                webView.setWebViewClient(new MyWebView());

            }
        });
        flipkartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Flipkart for your safe shopping", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;

                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.flipkart.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        ebayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening E-bay for your safe shopping", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;

                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.ebay.com/");
                webView.setWebViewClient(new MyWebView());
            }
        });
        ebayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening E-bay for your safe shopping", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_my_view);
                WebView webView;

                webView = findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl("https://www.ebay.com/");
                webView.setWebViewClient(new MyWebView());
            }

        });



    }
}class MyWebView extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return super.shouldOverrideUrlLoading(view, request);
    }
}
