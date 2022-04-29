package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vse_nashli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vse_nashli);
    }
    public void btngovnut2(View v) {
        Intent intent = new Intent(this, vnut2.class);
        startActivity(intent);
    }
}