package com.habibi.latihan;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class BusActivity extends AppCompatActivity {
    MediaPlayer audioAyah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        WebView vidioAyah = (WebView) findViewById(R.id.vidioAyah);
        WebSettings webSettings = vidioAyah.getSettings();
        webSettings.setJavaScriptEnabled(true);
        vidioAyah.loadUrl("file:///android_asset/kata_benda/kendaraan/bus.html");
        audioAyah = MediaPlayer.create(BusActivity.this,R.raw.ayah);
    }

    public void playIT(View v){
        audioAyah.start();
    }
}
