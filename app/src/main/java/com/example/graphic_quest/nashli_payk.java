package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nashli_payk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nashli_payk);
    }
    public void btnNashlipayk(View v){
        Intent intent = new Intent(this, nashli_payk_mish.class);
        startActivity(intent);
    }
}