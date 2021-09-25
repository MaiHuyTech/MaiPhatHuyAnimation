package com.example.maiphathuyanimation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class RecyclerViewAnimationLayout3 extends Fragment {
    ImageView img_taylor, img_music;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_recycler_view_animation_layout3, container, false);

        img_music = view.findViewById(R.id.img_music2);
        img_taylor = view.findViewById(R.id.img_taylor);

        Animation animation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anirotate);
        Animation animation1 = AnimationUtils.loadAnimation(view.getContext(), R.anim.aniblink);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);

        return view;
    }
}