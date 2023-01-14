package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KataBendaActivity extends AppCompatActivity {

    CardView keluarga,anggotaTubuh,buahBuahan,binatang,kendaraan,makanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kata_benda);
        keluarga = (CardView) findViewById(R.id.keluarga);
        anggotaTubuh = (CardView) findViewById(R.id.anggotaTubuh);
        buahBuahan = (CardView) findViewById(R.id.buahBuahan);
        binatang = (CardView) findViewById(R.id.binatang);
        kendaraan = (CardView) findViewById(R.id.kendaraan);
        makanan = (CardView) findViewById(R.id.makanan);

        keluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,KeluargaActivity.class);
                startActivity(intent);
            }
        });

        anggotaTubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,AnggotaTubuhActivity.class);
                startActivity(intent);
            }
        });

        buahBuahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,BuahBuahanActivity.class);
                startActivity(intent);
            }
        });

        binatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,BinatangActivity.class);
                startActivity(intent);
            }
        });

        kendaraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,KendaraanActivity.class);
                startActivity(intent);
            }
        });

        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KataBendaActivity.this,KendaraanActivity.class);
                startActivity(intent);
            }
        });
    }
}
