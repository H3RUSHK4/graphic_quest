package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashli_fio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashli_fio);
    }
    public void btnnashliredfio(View v) {
        Intent intent = new Intent(this, nashlirediifio.class);
        startActivity(intent);
    }
}