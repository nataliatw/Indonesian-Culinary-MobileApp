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

public class Food1 extends AppCompatActivity {

    private TextView link;
    private ImageView back1, save1, save2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout_cardfood1);

        link = findViewById(R.id.linkfood1);
        back1 = findViewById(R.id.backfood1);
        save1 = findViewById(R.id.savefood1);
        save2 = findViewById(R.id.savefood2);

        link.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cookpad.com/id/resep/17187438-soto-lamongan?ref=search&search_term=soto%20lamongan"));
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