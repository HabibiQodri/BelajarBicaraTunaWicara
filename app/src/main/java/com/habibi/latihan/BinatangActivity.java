package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BinatangActivity extends AppCompatActivity {
    CardView ikan,ayam,kucing,burung,monyet,harimau,gajah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_binatang);
        ikan = (CardView) findViewById(R.id.ikan);
        ayam = (CardView) findViewById(R.id.ayam);
        kucing = (CardView) findViewById(R.id.kucing);
        burung = (CardView) findViewById(R.id.burung);
        monyet = (CardView) findViewById(R.id.monyet);
        harimau = (CardView) findViewById(R.id.harimau);
        gajah = (CardView) findViewById(R.id.gajah);

        ikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,IkanActivity.class);
                startActivity(intent);
            }
        });

        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,AyamActivity.class);
                startActivity(intent);
            }
        });

        kucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,KucingActivity.class);
                startActivity(intent);
            }
        });

        burung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,BurungAcivity.class);
                startActivity(intent);
            }
        });

        monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,MonyetActivity.class);
                startActivity(intent);
            }
        });

        harimau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,HarimauActivity.class);
                startActivity(intent);
            }
        });

        gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this,GajahActivity.class);
                startActivity(intent);
            }
        });
    }
}
