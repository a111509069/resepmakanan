package com.example.heri.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Heri on 09/10/2017.
 */

public class Data extends AppCompatActivity {

    ImageView gambar;
    TextView bahan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Intent in = getIntent();

        gambar = (ImageView) findViewById(R.id.data_image);
        gambar.setImageResource(in.getIntExtra("gambar",0));

        bahan = (TextView) findViewById(R.id.bahan);
        bahan.setText(in.getStringExtra("bahan"));

        getSupportActionBar().setTitle(in.getStringExtra("judul"));
    }
}
