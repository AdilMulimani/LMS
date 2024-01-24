package com.example.lms

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.example.lms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContentView(R.layout.activity_main)

        val lmsWebView :WebView = findViewById(R.id.lmsWebView)

        lmsWebView.webViewClient= WebViewClient()

        lmsWebView.settings.javaScriptEnabled = true

        lmsWebView.loadUrl("https://learn.kletech.ac.in/login/index.php")

    }
}