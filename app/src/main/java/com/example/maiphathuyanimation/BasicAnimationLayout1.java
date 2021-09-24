package com.example.maiphathuyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BasicAnimationLayout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_animation_layout1);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                startActivity(new Intent(BasicAnimationLayout1.this,
                        BasicAnimationLayout2.class));

                overridePendingTransition(R.anim.enter_x, R.anim.exit_x);

            }
        });
    }
}