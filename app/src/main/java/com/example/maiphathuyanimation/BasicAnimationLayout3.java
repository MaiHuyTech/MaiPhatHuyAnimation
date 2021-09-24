package com.example.maiphathuyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class BasicAnimationLayout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_animation_layout3);
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }
}