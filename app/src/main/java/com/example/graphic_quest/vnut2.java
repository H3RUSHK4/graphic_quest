package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vnut2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnut2);
    }
    public void btnNashliMish(View v){
        Intent intent = new Intent(this, nashli_mish.class);
        startActivity(intent);
    }
    public void btnNashlivPayk(View v){
        Intent intent = new Intent(this, nashli_payk.class);
        startActivity(intent);
    }
}