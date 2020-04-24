package com.example.gsk31v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val BASE_URL = "https://front-scout.herokuapp.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        wv_main.webChromeClient = object : WebChromeClient(){
        }

        wv_main.webViewClient = object : WebViewClient(){

        }


        val settings = wv_main.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        wv_main.loadUrl(BASE_URL)
    }

    override fun onBackPressed() {
            if(wv_main.canGoBack()){
                wv_main.goBack()
            } else {
                super.onBackPressed()
            }
    }
}
