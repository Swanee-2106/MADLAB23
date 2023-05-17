package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg = true;

    public void change(View view) {
        ImageView iv = (ImageView) view;
        if (isEgg) {
            iv.setImageResource(R.drawable.ic_launcher_background);
            isEgg = false;
        } else {
            iv.setImageResource(R.drawable.ic_launcher_foreground);
            isEgg = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}