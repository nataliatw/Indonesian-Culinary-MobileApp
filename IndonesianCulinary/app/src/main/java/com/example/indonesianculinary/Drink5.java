package com.example.indonesianculinary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Drink5 extends AppCompatActivity {

    private TextView link;
    private ImageView back1, save1, save2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout_carddrink5);

        link = findViewById(R.id.linkdrink5);
        back1 = findViewById(R.id.backdrink5);
        save1 = findViewById(R.id.savedrink9);
        save2 = findViewById(R.id.savedrink10);

        link.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cookpad.com/id/resep/17212636-saraba-khas-makasar?ref=search&search_term=sarabba%20khas%20makassar"));
            startActivity(intent);
        });

        back1.setOnClickListener(v -> {
            finish();
        });

        save1.setOnClickListener(v -> {
            save1.setVisibility(View.GONE);
            save2.setVisibility(View.VISIBLE);
        });

        save2.setOnClickListener(v -> {
            save2.setVisibility(View.GONE);
            save1.setVisibility(View.VISIBLE);
        });
    }
}