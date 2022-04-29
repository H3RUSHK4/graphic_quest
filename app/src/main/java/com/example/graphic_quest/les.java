package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class les extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les);
    }
    public void btnkey(View v){
        Intent intent = new Intent(this, previewdialog.class);
        startActivity(intent);
    }
}