package com.habibi.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AnggotaTubuhActivity extends AppCompatActivity {
    CardView kepala,mata,hidung,mulut,telinga,tangan,kaki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_anggota_tubuh);
        kepala = (CardView) findViewById(R.id.kepala);
        mata = (CardView) findViewById(R.id.mata);
        hidung = (CardView) findViewById(R.id.hidung);
        mulut = (CardView) findViewById(R.id.mulut);
        telinga = (CardView) findViewById(R.id.telinga);
        tangan = (CardView) findViewById(R.id.tangan);
        kaki = (CardView) findViewById(R.id.kaki);

        kepala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,KepalaActivity.class);
                startActivity(intent);
            }
        });

        mata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,MataActivity.class);
                startActivity(intent);
            }
        });

        hidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,HidungActivity.class);
                startActivity(intent);
            }
        });

        mulut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,MulutActivity.class);
                startActivity(intent);
            }
        });

        telinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,TelingaActivity.class);
                startActivity(intent);
            }
        });

        tangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,TanganActivity.class);
                startActivity(intent);
            }
        });

        kaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnggotaTubuhActivity.this,KakiActivity.class);
                startActivity(intent);
            }
        });
    }

}
