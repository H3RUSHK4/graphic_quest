package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onli_fio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onli_fio);
    }
    public void btngonashfio(View v) {
        Intent intent = new Intent(this, nashli_fio.class);
        startActivity(intent);
    }
}