package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashli_red extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashli_red);
    }
    public void btnnashlifiored(View v) {
        Intent intent = new Intent(this, nashlifioired.class);
        startActivity(intent);
    }
}