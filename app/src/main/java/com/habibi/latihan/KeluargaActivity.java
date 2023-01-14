package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KeluargaActivity extends AppCompatActivity {

    CardView ayah,ibu,adik,kakak,nenek,kakek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_keluarga);
        ayah = (CardView) findViewById(R.id.ayah);
        ibu = (CardView) findViewById(R.id.ibu);
        adik = (CardView) findViewById(R.id.adik);
        kakak = (CardView) findViewById(R.id.kakak);
        kakek = (CardView) findViewById(R.id.kakek);
        nenek = (CardView) findViewById(R.id.nenek);

        ayah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,AyahActivity.class);
                startActivity(intent);
            }
        });

        ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,IbuActivity.class);
                startActivity(intent);
            }
        });

        adik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,AdikActivity.class);
                startActivity(intent);
            }
        });

        kakak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,KakakActivity.class);
                startActivity(intent);
            }
        });

        kakek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,KakekActivity.class);
                startActivity(intent);
            }
        });

        nenek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeluargaActivity.this,NenekActivity.class);
                startActivity(intent);
            }
        });

    }
}
