package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KendaraanActivity extends AppCompatActivity {

    CardView motor,mobil,sepeda,bus,pesawat,kereta,kapal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kendaraan);
        motor = (CardView) findViewById(R.id.motor);
        mobil = (CardView) findViewById(R.id.mobil);
        sepeda = (CardView) findViewById(R.id.sepeda);
        bus = (CardView) findViewById(R.id.bus);
        pesawat = (CardView) findViewById(R.id.pesawat);
        kereta = (CardView) findViewById(R.id.kereta);
        kapal = (CardView) findViewById(R.id.kapal);

        motor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,MotorActivity.class);
                startActivity(intent);
            }
        });

        mobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,MobilActivity.class);
                startActivity(intent);
            }
        });

        kereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,KeretaActivity.class);
                startActivity(intent);
            }
        });

        sepeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,SepedaActivity.class);
                startActivity(intent);
            }
        });

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,BusActivity.class);
                startActivity(intent);
            }
        });

        pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,PesawatActivity.class);
                startActivity(intent);
            }
        });

        kapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KendaraanActivity.this,KapalActivity.class);
                startActivity(intent);
            }
        });

    }
}
