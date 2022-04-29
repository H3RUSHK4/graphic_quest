package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashlirediifio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashlirediifio);
    }
    public void btnNashlivse(View v){
        Intent intent = new Intent(this, vse_nashli.class);
        startActivity(intent);
    }
}