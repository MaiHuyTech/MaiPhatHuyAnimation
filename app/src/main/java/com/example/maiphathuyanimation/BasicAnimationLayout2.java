package com.example.maiphathuyanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class BasicAnimationLayout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_animation_layout2);
        //thêm hoạt ảnh mờ dần, giữa hai lần xem hình ảnh.
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        // thêm hoạt ảnh mờ dần để nhập quá trình chuyển đổi.
        getWindow().setEnterTransition(fade);

        //  thiết lập hoạt ảnh mờ dần cho quá trình chuyển đổi thoát.
        getWindow().setExitTransition(fade);
        final ImageView imageView1 = findViewById(R.id.imageClick1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicAnimationLayout2.this,
                        BasicAnimationLayout3.class);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                BasicAnimationLayout2.this, imageView1,
                                ViewCompat.getTransitionName(imageView1));
                startActivity(intent, options.toBundle());
            }
        });

        final ImageView imageView2 = findViewById(R.id.imageView5);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicAnimationLayout2.this,
                        BasicAnimationLayout4.class);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                BasicAnimationLayout2.this, imageView2,
                                ViewCompat.getTransitionName(imageView2));
                startActivity(intent, options.toBundle());
            }
        });

    }
}