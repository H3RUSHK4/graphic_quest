package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perlesvod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perlesvod);
    }
    public void btnperlesvod(View v){
        Intent intent = new Intent(this, vodopad.class);
        startActivity(intent);
    }
}