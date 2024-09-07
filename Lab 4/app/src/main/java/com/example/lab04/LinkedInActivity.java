package com.example.lab04;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LinkedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);
        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
        linkedinIntent.setData(Uri.parse("https://www.linkedin.com/in/irtifa-haider-ahona-1924821b0/"));
        startActivity(linkedinIntent);
    }
}
