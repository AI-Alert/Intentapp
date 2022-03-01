package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button web_button;
    Button call_button;
    Button map_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web_button = (Button) findViewById(R.id.web_btn);
        web_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://iuca.kg/ru/"));
                startActivity(intent);

            }
        });
        call_button = (Button) findViewById(R.id.call_btn);
        call_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+996555120656"));
                startActivity(intent);
            }

        });

        map_button = (Button) findViewById(R.id.map_btn);
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/place/Международный+Университет+в+Центральной+Азии/@42.830279,75.2888197,14.08z/data=!4m15!1m9!4m8!1m3!2m2!1d17.5!2d57.2!1m3!2m2!1d29.9!2d2.21!3m4!1s0x389c0a8794a1bdff:0x64e4881b5011b5bf!8m2!3d42.8222582!4d75.3037028"));
                startActivity(intent);
            }
        });

    }
}