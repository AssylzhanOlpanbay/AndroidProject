package com.kz.fourthproject.splashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.kz.fourthproject.authentification.LoginActivity;
import com.kz.fourthproject.R;

public class SplashScreen extends AppCompatActivity {
    Animation bounceAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = findViewById(R.id.image_view);
        bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        imageView.startAnimation(bounceAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            }
        }, 3000);
    }
}