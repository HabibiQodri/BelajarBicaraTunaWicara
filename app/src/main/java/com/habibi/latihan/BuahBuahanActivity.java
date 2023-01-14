package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BuahBuahanActivity extends AppCompatActivity {
    CardView anggur,apel,mangga,durian,jeruk,nanas,pisang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buah_buahan);
        anggur = (CardView) findViewById(R.id.anggur);
        apel = (CardView) findViewById(R.id.apel);
        mangga = (CardView) findViewById(R.id.mangga);
        durian = (CardView) findViewById(R.id.durian);
        jeruk = (CardView) findViewById(R.id.jeruk);
        nanas = (CardView) findViewById(R.id.nanas);
        pisang = (CardView) findViewById(R.id.pisang);

        anggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,AnggurActivity.class);
                startActivity(intent);
            }
        });

        apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,ApelActivity.class);
                startActivity(intent);
            }
        });

        mangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,ManggaActivity.class);
                startActivity(intent);
            }
        });

        durian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,DurianActivity.class);
                startActivity(intent);
            }
        });

        jeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,JerukActivity.class);
                startActivity(intent);
            }
        });

        nanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,NanasActivity.class);
                startActivity(intent);
            }
        });

        pisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuahBuahanActivity.this,PisangActivity.class);
                startActivity(intent);
            }
        });
    }
}
