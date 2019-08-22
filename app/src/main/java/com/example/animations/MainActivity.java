package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Bart image clicked.");

        ImageView bartImageView = findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        if (bartIsShowing) {
            //fading out
            bartImageView.animate().alpha(0).setDuration(2000);
            //fading in
            homerImageView.animate().alpha(1).setDuration(2000);

            bartIsShowing = false;
        }
        else {
            //fading out
            homerImageView.animate().alpha(0).setDuration(2000);
            //fading in
            bartImageView.animate().alpha(1).setDuration(2000);

            bartIsShowing = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
