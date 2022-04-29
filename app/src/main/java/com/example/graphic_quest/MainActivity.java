package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startService(new Intent(MainActivity.this, Musik.class));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onDestroy() {
        //stop service and stop music
        stopService(new Intent(MainActivity.this, Musik.class));
        super.onDestroy();
    }
    public void onBackPressed() {
        stopService(new Intent(this, Musik.class));
        super.onBackPressed();
    }
    public void btnStart(View v){
        Intent intent = new Intent(this, fondva1.class);
        startActivity(intent);
    }
}