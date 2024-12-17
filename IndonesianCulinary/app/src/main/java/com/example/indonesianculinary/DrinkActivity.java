package com.example.indonesianculinary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DrinkActivity extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6;
    private ImageView ivFood, ivDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_drink);

        card1 = findViewById(R.id.imagepisangijo);
        card2 = findViewById(R.id.imageesbuah);
        card3 = findViewById(R.id.imageescendol);
        card4 = findViewById(R.id.imageesdawet);
        card5 = findViewById(R.id.imagesarabba);
        card6 = findViewById(R.id.imagewedangronde);
        ivFood = findViewById(R.id.nav_food);
        ivDrink = findViewById(R.id.nav_drink);

        card1.setOnClickListener(v ->{
            Intent intent = new Intent(DrinkActivity.this, Drink1.class);
            startActivity(intent);
        });

        card2.setOnClickListener(v ->{
            Intent intent2 = new Intent(DrinkActivity.this, Drink2.class);
            startActivity(intent2);
        });

        card3.setOnClickListener(v ->{
            Intent intent3 = new Intent(DrinkActivity.this, Drink3.class);
            startActivity(intent3);
        });

        card4.setOnClickListener(v ->{
            Intent intent4 = new Intent(DrinkActivity.this, Drink4.class);
            startActivity(intent4);
        });

        card5.setOnClickListener(v ->{
            Intent intent5 = new Intent(DrinkActivity.this, Drink5.class);
            startActivity(intent5);
        });

        card6.setOnClickListener(v ->{
            Intent intent6 = new Intent(DrinkActivity.this, Drink6.class);
            startActivity(intent6);
        });

        ivFood.setOnClickListener(v -> {
            Intent intentFood =  new Intent(DrinkActivity.this, FoodActivity.class);
            startActivity(intentFood);
        });

        ivDrink.setOnClickListener(v -> {
            Intent intentDrink =  new Intent(DrinkActivity.this, DrinkActivity.class);
            startActivity(intentDrink);
        });

    }
}