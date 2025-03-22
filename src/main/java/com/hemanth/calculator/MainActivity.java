package com.hemanth.calculator;

import com.hemanth.calculator.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setSupportZoom(false); // Disable zoom controls
        webSettings.setBuiltInZoomControls(false);
        webSettings.setUseWideViewPort(true); // Enables responsive layout
        webSettings.setLoadWithOverviewMode(true); // Ensures content fits screen
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/main.html"); // Load HTML file
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}