package com.example.korisnik.eatpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Shop extends AppCompatActivity {

    TextView    Pizzas, tapps;
    TextView    PizPS;
    Button      Baker, Oven, Equipment, Stuff, Click, Back, page2;

    double pizzas1;
    double PPS = 0;
    double priceBaker = 100;
    double priceOven = 1000;
    double priceEquipment = 7500;
    double priceStuff = 25000;
    double priceClick = 100;
    double mul1 = 1.2;
    double mulClick = 8;
    double tapMul = 2;
    double cBaker = 5;
    double cOven = 15;
    double cEquipment = 25;
    double cStuff = 45;

    double tap = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Pizzas = (TextView) findViewById(R.id.ShopSpend);
        PizPS = (TextView) findViewById(R.id.ShopPizPerSec);
        Baker = (Button) findViewById(R.id.baker);
        Oven = (Button) findViewById(R.id.oven);
        Equipment = (Button) findViewById(R.id.equiment);
        Stuff = (Button) findViewById(R.id.stuff);
        Click = (Button) findViewById(R.id.click);
        Back = (Button) findViewById(R.id.back);
        tapps = (TextView) findViewById(R.id.PizPerTap);
        page2 = (Button) findViewById(R.id.page2);

        Helper helper = new Helper();
        Intent intent = getIntent();
        tap = intent.getDoubleExtra("t1", 0);
        PPS = intent.getDoubleExtra("s1", 0);
        pizzas1 = intent.getDoubleExtra("p1", 0);
        priceBaker = intent.getDoubleExtra("pB", priceBaker);
        priceOven = intent.getDoubleExtra("pO", priceOven);
        priceEquipment = intent.getDoubleExtra("pE", priceEquipment);
        priceStuff = intent.getDoubleExtra("pS", priceStuff);
        priceClick = intent.getDoubleExtra("pC", priceClick);

        tapps.setText("PizzasPerTap: "+helper.toHumanValue(tap));
        updatePrices();
        updatePPS();
        updatePizza();

        Click.setOnClickListener(new View.OnClickListener() {   //postavljanje shopa za Baker
            @Override
            public void onClick(View view) {
                if (pizzas1 >= priceClick){
                    Helper helper = new Helper();
                    pizzas1 = pizzas1 - priceClick;
                    priceClick = priceClick*mulClick;
                    tap = tap*tapMul;
                    updatePizza();
                    Click.setText("Upgrade click: "+helper.toHumanValue(priceClick) + " P");
                    tapps.setText("PizzasPerTap: "+helper.toHumanValue(tap));
                }
                else {
                    toast();
                }
            }
        });

        Baker.setOnClickListener(new View.OnClickListener() {   //postavljanje shopa za Baker
            @Override
            public void onClick(View view) {
                if (pizzas1 >= priceBaker){
                    Helper helper = new Helper();
                    pizzas1 = pizzas1 - priceBaker;
                    priceBaker = priceBaker*mul1;
                    PPS = PPS + cBaker;
                    updatePPS();
                    updatePizza();
                    Baker.setText("Baker: "+helper.toHumanValue(priceBaker) + " P");
                }
                else {
                    toast();
                }
            }
        });

        Oven.setOnClickListener(new View.OnClickListener() {   //postavljanje shopa za Oven
            @Override
            public void onClick(View view) {
                if (pizzas1 >= priceOven){
                    Helper helper = new Helper();
                    pizzas1 = pizzas1 - priceOven;
                    priceOven = priceOven*mul1;
                    PPS = PPS + cOven;
                    updatePPS();
                    updatePizza();
                    Oven.setText("Oven: "+helper.toHumanValue(priceOven)+" P");
                }
                else {
                    toast();
                }
            }
        });

        Equipment.setOnClickListener(new View.OnClickListener() {   //postavljanje shopa za Equimpent
            @Override
            public void onClick(View view) {
                if (pizzas1 >= priceEquipment){
                    Helper helper = new Helper();
                    pizzas1 = pizzas1 - priceEquipment;
                    priceEquipment = priceEquipment * mul1;
                    PPS = PPS + cEquipment;
                    updatePPS();
                    updatePizza();
                    Equipment.setText("Equipment: " + helper.toHumanValue(priceEquipment) + " P");
                }
                else {
                    toast();
                }
            }
        });

        Stuff.setOnClickListener(new View.OnClickListener() {   //postavljanje shopa za Stuff
            @Override
            public void onClick(View view) {
                if (pizzas1 >= priceStuff){
                    Helper helper = new Helper();
                    pizzas1 = pizzas1 - priceStuff;
                    priceStuff = priceStuff*mul1;
                    PPS = PPS + cStuff;
                    updatePPS();
                    updatePizza();
                    Stuff.setText("Stuff: "+ helper.toHumanValue(priceStuff) + " P");
                }
                else {
                    toast();
                }
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Shop.this,MainActivity.class);
                intent1.putExtra("t1",tap);
                intent1.putExtra("p2",pizzas1);
                intent1.putExtra("pB",priceBaker);
                intent1.putExtra("pO",priceOven);
                intent1.putExtra("pE",priceEquipment);
                intent1.putExtra("pS",priceStuff);
                intent1.putExtra("pC",priceClick);
                intent1.putExtra("pps",PPS);
                startActivity(intent1);
            }
        });

        /*page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (Shop.this, Upgrades.class);
                //intent.putExtra("currentP", pizzas1);
                startActivity(intent2);
            }
        });*/



    }

    void updatePizza(){
        Helper helper = new Helper();
        Pizzas.setText("Pizzas: "+helper.toHumanValue(pizzas1));
    }

    void updatePPS(){
        Helper helper = new Helper();
        PizPS.setText("PizzasPerSecond: "+helper.toHumanValue(PPS));
    }
    void toast(){
        Toast.makeText(getApplicationContext(), "You don't have enough pizzas collected!", Toast.LENGTH_LONG).show();
    }
    void updatePrices(){
        Helper helper = new Helper();
        Baker.setText("Baker: " + helper.toHumanValue(priceBaker) + " P");
        Oven.setText("Oven: " + helper.toHumanValue(priceOven) + " P");
        Equipment.setText("Equipment: " + helper.toHumanValue(priceEquipment) + " P");
        Stuff.setText("Stuff: " + helper.toHumanValue(priceStuff) + " P");
        Click.setText("Upgrade click: " + helper.toHumanValue(priceClick) + " P");
    }
}

