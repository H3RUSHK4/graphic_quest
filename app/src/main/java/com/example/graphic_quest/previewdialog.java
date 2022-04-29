package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class previewdialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previewdialog);
    }
    public void btnVoitiVDom(View v){
        Intent intent = new Intent(this, vnut1.class);
        startActivity(intent);
    }
}