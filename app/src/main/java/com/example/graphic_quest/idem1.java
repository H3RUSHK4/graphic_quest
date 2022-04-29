package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class idem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idem1);
    }
    public void btnidem1(View v) {
        Intent intent = new Intent(this, idem2.class);
        startActivity(intent);
    }
}