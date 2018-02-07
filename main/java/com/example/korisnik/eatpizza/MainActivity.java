package com.example.korisnik.eatpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView score, TapPS, PizPS;
    Button shop;
    ImageView click;
    double pizzas = 0;
    double tap = 100;
    double PizzasPerS = 0;
    double priceBaker = 100;
    double priceOven = 250;
    double priceEquipment = 750;
    double priceStuff = 1500;
    double priceClick = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        score = (TextView) findViewById(R.id.score);
        shop = (Button) findViewById(R.id.shop);
        click = (ImageView) findViewById(R.id.pizzaClick);
        TapPS = (TextView) findViewById(R.id.taps);
        PizPS = (TextView) findViewById(R.id.PizPerSec);

        Intent intent = getIntent();
        tap = intent.getDoubleExtra("t1", tap);
        pizzas = intent.getDoubleExtra("p2", 0);
        PizzasPerS = intent.getDoubleExtra("pps", 0);
        priceBaker = intent.getDoubleExtra("pB", priceBaker);
        priceOven = intent.getDoubleExtra("pO", priceOven);
        priceEquipment = intent.getDoubleExtra("pE", priceEquipment);
        priceStuff = intent.getDoubleExtra("pS", priceStuff);
        priceClick = intent.getDoubleExtra("pC", priceClick);

        updateScore();


        updatePPS();
        updateTap();
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizzas = pizzas + tap;
                updateScore();
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Shop.class);
                intent.putExtra("p1",pizzas);
                intent.putExtra("t1",tap);
                intent.putExtra("s1",PizzasPerS);
                intent.putExtra("pB",priceBaker);
                intent.putExtra("pO",priceOven);
                intent.putExtra("pE",priceEquipment);
                intent.putExtra("pS",priceStuff);
                intent.putExtra("pC",priceClick);
                startActivity(intent);
            }
        });
    }

    void updateScore() {
        Helper helper = new Helper();
        score.setText("Pizzas: "+ helper.toHumanValue(pizzas));
    }
    void updateTap() {
        Helper helper = new Helper();
        TapPS.setText("PizzasPerTap: "+ helper.toHumanValue(tap));

    }
    void updatePPS() {
        Helper helper = new Helper();
        PizPS.setText("PizzasPerSecond: "+ helper.toHumanValue(PizzasPerS));
    }
}