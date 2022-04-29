package com.example.graphic_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class reiting extends AppCompatActivity {
private RatingBar rating;
private TextView text_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reiting);

        rating = (RatingBar) findViewById(R.id.ratingBar);
        text_show = (TextView) findViewById(R.id.textView24);

        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void  onRatingChanged(RatingBar ratingBar,float rating, boolean fromUser){
                        text_show.setText("Оценка: "+String.valueOf(rating));
                    }
                }
        );
    }

        public void btnsreiting(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}