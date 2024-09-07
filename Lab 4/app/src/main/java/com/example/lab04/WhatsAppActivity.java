package com.example.lab04;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class WhatsAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
        whatsappIntent.setData(Uri.parse("https://wa.me/+8801612161859"));
        startActivity(whatsappIntent);
    }
}
