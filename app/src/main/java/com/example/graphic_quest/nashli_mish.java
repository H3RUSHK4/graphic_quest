package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashli_mish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashli_mish);
    }
    public void btnNashlivMishPayk(View v){
        Intent intent = new Intent(this, nashli_mish_payk.class);
        startActivity(intent);
    }
}