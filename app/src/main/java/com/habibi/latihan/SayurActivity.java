package com.habibi.latihan;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SayurActivity extends AppCompatActivity {
    MediaPlayer audioAyah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayur);
        WebView vidioAyah = (WebView) findViewById(R.id.vidioAyah);
        WebSettings webSettings = vidioAyah.getSettings();
        webSettings.setJavaScriptEnabled(true);
        vidioAyah.loadUrl("file:///android_asset/kata_benda/makanan/sayur.html");
        audioAyah = MediaPlayer.create(SayurActivity.this,R.raw.ayah);
    }

    public void playIT(View v){
        audioAyah.start();
    }
}
