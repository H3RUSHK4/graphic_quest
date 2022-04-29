package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fondva1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fondva1);
    }
    public void btnNext(View v){
        Intent intent = new Intent(this, les.class);
        startActivity(intent);
    }
    public void btnBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}