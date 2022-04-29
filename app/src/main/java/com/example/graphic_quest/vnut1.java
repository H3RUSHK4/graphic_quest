package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class vnut1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnut1);

    }
    public void btnfio(View v) {
        Intent intent = new Intent(this, nashli_fio.class);
        startActivity(intent);
    }
    public void btnred(View v) {
        Intent intent = new Intent(this, nashli_red.class);
        startActivity(intent);
    }
}