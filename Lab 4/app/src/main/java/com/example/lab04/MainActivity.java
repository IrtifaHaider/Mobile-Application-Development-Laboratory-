package com.example.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView emailIcon, callIcon, whatsappIcon, facebookIcon, linkedinIcon, githubIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailIcon = findViewById(R.id.imageView5);
        callIcon = findViewById(R.id.imageView4);
        whatsappIcon = findViewById(R.id.imageView7);
        facebookIcon = findViewById(R.id.imageView6);
        linkedinIcon = findViewById(R.id.imageView8);
        githubIcon = findViewById(R.id.imageView9);

        emailIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EmailActivity.class);
            startActivity(intent);
        });

        callIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CallActivity.class);
            startActivity(intent);
        });

        whatsappIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WhatsAppActivity.class);
            startActivity(intent);
        });

        facebookIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
            startActivity(intent);
        });

        linkedinIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinkedInActivity.class);
            startActivity(intent);
        });

        githubIcon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GitHubActivity.class);
            startActivity(intent);
        });
    }
}




