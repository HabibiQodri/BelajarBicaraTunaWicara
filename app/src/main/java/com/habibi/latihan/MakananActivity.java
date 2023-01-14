package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MakananActivity extends AppCompatActivity {
    CardView nasi,sayur,mi,telur,permen,susu,biskuit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_makanan);
        nasi = (CardView) findViewById(R.id.nasi);
        sayur = (CardView) findViewById(R.id.sayur);
        mi = (CardView) findViewById(R.id.mi);
        telur = (CardView) findViewById(R.id.telur);
        permen = (CardView) findViewById(R.id.permen);
        susu = (CardView) findViewById(R.id.susu);
        biskuit = (CardView) findViewById(R.id.biskuit);

        nasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,NasiActivity.class);
                startActivity(intent);
            }
        });

        sayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,SayurActivity.class);
                startActivity(intent);
            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,MiActivity.class);
                startActivity(intent);
            }
        });

        telur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,TelurActivity.class);
                startActivity(intent);
            }
        });

        permen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,PermenActivity.class);
                startActivity(intent);
            }
        });

        susu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,SusuActivity.class);
                startActivity(intent);
            }
        });

        biskuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakananActivity.this,BiskuitActivity.class);
                startActivity(intent);
            }
        });
    }
}
