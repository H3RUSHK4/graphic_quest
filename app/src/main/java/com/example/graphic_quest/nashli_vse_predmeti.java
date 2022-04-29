package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashli_vse_predmeti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashli_vse_predmeti);
    }
    public void btnVsePredmeti(View v){
        Intent intent = new Intent(this, idem1.class);
        startActivity(intent);
    }
}