package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class podobralisferu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podobralisferu);
    }
    public void btnsfera(View v){
        Intent intent = new Intent(this, perlesvod.class);
        startActivity(intent);
    }
}