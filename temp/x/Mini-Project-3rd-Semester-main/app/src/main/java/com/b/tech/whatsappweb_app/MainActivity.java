package com.b.tech.whatsappweb_app;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String UrlValue;

Button shoppingText , cabText, hotelText, foodText;
ImageButton hotel ,  shopping , food , cab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        shoppingText = findViewById(R.id.shoppingText);
        cabText = findViewById(R.id.cabText);
        hotelText =  findViewById(R.id.hotelText);
        foodText =  findViewById(R.id.foodText);
        cab =  findViewById(R.id.cab);
        hotel =  findViewById(R.id.hotel);
        shopping =  findViewById(R.id.shopping);
        food =  findViewById(R.id.food);




        cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You will be directed to Cab Sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cabs.class);
                startActivity(intent);
            }
        });
        cabText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),     "You will be directed to Cab Sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cabs.class);
                startActivity(intent);

            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You will be directed to hotel sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hotels.class);
                startActivity(intent);
            }
        });
        hotelText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "You will be directed to hotel sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hotels.class);
                startActivity(intent);
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You will be directed to Shopping sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Shopping.class);
                startActivity(intent);

            }
        });
        shoppingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You will be directed to Shopping sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Shopping.class);
                startActivity(intent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You will be directed to Shopping sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Food.class);
                startActivity(intent);
            }
        });
        foodText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You will be directed to Shopping sites", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Food.class);
                startActivity(intent);
            }
        });





    }


}



///* imple mention of web view
//   webView = findViewById(R.id.webView);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://www.amazon.in/");
//        webView.setWebViewClient(new MyWebView());
// class  MyWebView extends WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//            view.loadUrl(request.getUrl().toString());
//            return super.shouldOverrideUrlLoading(view, request);
//        }
//    }
// */
