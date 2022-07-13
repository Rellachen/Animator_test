package com.example.animator_test;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animatorRun();
            }
        });

    }

    private void animatorRun() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.property_animator);
        animator.setTarget(findViewById(R.id.image));
        animator.start();
    }
}