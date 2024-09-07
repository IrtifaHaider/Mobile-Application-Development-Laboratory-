package com.example.lab04;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class GitHubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
        Intent githubIntent = new Intent(Intent.ACTION_VIEW);
        githubIntent.setData(Uri.parse("https://github.com/IrtifaHaider"));
        startActivity(githubIntent);
    }
}
