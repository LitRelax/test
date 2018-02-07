package com.example.korisnik.eatpizza;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Upgrades extends AppCompatActivity {

    double pizzas;
    double clickUpgrade = 1;
    double bakerUpgrade = 1;
    double ovenUpgrade = 1;
    Button upgradeClick1,upgradeClick2,upgradeClick3,upgradeClick4,upgradeClick5,upgradeClick6,upgradeClick7,upgradeClick8;
    Button upgradeBaker1,upgradeBaker2,upgradeBaker3,upgradeBaker4,upgradeBaker5,upgradeBaker6,upgradeBaker7,upgradeBaker8;
    Button upgradeOven1,upgradeOven2,upgradeOven3,upgradeOven4,upgradeOven5,upgradeOven6,upgradeOven7,upgradeOven8;
    TextView pShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        upgradeClick1 = (Button) findViewById(R.id.buttonUpgradeClick1k);
        upgradeClick2 = (Button) findViewById(R.id.buttonUpgradeClick25k);
        upgradeClick3 = (Button) findViewById(R.id.buttonUpgradeClick50k);
        upgradeClick4 = (Button) findViewById(R.id.buttonUpgradeClick100k);
        upgradeClick5 = (Button) findViewById(R.id.buttonUpgradeClick250k);
        upgradeClick6 = (Button) findViewById(R.id.buttonUpgradeClick500k);
        upgradeClick7 = (Button) findViewById(R.id.buttonUpgradeClick1M);
        upgradeClick8 = (Button) findViewById(R.id.buttonUpgradeClick5M);

        upgradeBaker1 = (Button) findViewById(R.id.buttonUpgradeBaker1k);
        upgradeBaker2 = (Button) findViewById(R.id.buttonUpgradeBaker25k);
        upgradeBaker3 = (Button) findViewById(R.id.buttonUpgradeBaker50k);
        upgradeBaker4 = (Button) findViewById(R.id.buttonUpgradeBaker100k);
        upgradeBaker5 = (Button) findViewById(R.id.buttonUpgradeBaker250k);
        upgradeBaker6 = (Button) findViewById(R.id.buttonUpgradeBaker500k);
        upgradeBaker7 = (Button) findViewById(R.id.buttonUpgradeBaker1M);
        upgradeBaker8 = (Button) findViewById(R.id.buttonUpgradeBaker5M);

        upgradeOven1 = (Button) findViewById(R.id.buttonUpgradeOven1k);
        upgradeOven2 = (Button) findViewById(R.id.buttonUpgradeOven25k);
        upgradeOven3 = (Button) findViewById(R.id.buttonUpgradeOven50k);
        upgradeOven4 = (Button) findViewById(R.id.buttonUpgradeOven100k);
        upgradeOven5 = (Button) findViewById(R.id.buttonUpgradeOven250k);
        upgradeOven6 = (Button) findViewById(R.id.buttonUpgradeOven500k);
        upgradeOven7 = (Button) findViewById(R.id.buttonUpgradeOven1M);
        upgradeOven8 = (Button) findViewById(R.id.buttonUpgradeOven5M);

        Button i[]  = {upgradeOven1,upgradeOven2,upgradeOven3,upgradeOven4,upgradeOven5,upgradeOven6,upgradeOven7,upgradeOven8};
        pShow = (TextView) findViewById(R.id.upgradeShopPizzasCounter);

        Intent intent = getIntent();
        pizzas = intent.getDoubleExtra("currentP", 0);

        upgradeClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000){
                    pizzas = pizzas - 1000;
                    upgradeClick();
                    upgradeClick1.setEnabled(false);
                    upgradeClick1.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 25000){
                    pizzas = pizzas - 25000;
                    upgradeClick();
                    upgradeClick2.setEnabled(false);
                    upgradeClick2.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 50000){
                    pizzas = pizzas - 50000;
                    upgradeClick();
                    upgradeClick3.setEnabled(false);
                    upgradeClick3.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 100000){
                    pizzas = pizzas - 100000;
                    upgradeClick();
                    upgradeClick4.setEnabled(false);
                    upgradeClick4.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 250000){
                    pizzas = pizzas - 250000;
                    upgradeClick();
                    upgradeClick5.setEnabled(false);
                    upgradeClick5.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 500000){
                    pizzas = pizzas - 500000;
                    upgradeClick();
                    upgradeClick6.setEnabled(false);
                    upgradeClick6.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000000){
                    pizzas = pizzas - 1000000;
                    upgradeClick();
                    upgradeClick7.setEnabled(false);
                    upgradeClick7.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeClick8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 5000000){
                    pizzas = pizzas - 5000000;
                    upgradeClick();
                    upgradeClick8.setEnabled(false);
                    upgradeClick8.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });


        upgradeBaker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000){
                    pizzas = pizzas - 1000;
                    upgradeBaker();
                    upgradeBaker1.setEnabled(false);
                    upgradeBaker1.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 25000){
                    pizzas = pizzas - 25000;
                    upgradeBaker();
                    upgradeBaker2.setEnabled(false);
                    upgradeBaker2.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 50000){
                    pizzas = pizzas - 50000;
                    upgradeBaker();
                    upgradeBaker3.setEnabled(false);
                    upgradeBaker3.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 100000){
                    pizzas = pizzas - 100000;
                    upgradeBaker();
                    upgradeBaker4.setEnabled(false);
                    upgradeBaker4.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 250000){
                    pizzas = pizzas - 250000;
                    upgradeBaker();
                    upgradeBaker5.setEnabled(false);
                    upgradeBaker5.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 500000){
                    pizzas = pizzas - 500000;
                    upgradeBaker();
                    upgradeBaker6.setEnabled(false);
                    upgradeBaker6.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000000){
                    pizzas = pizzas - 1000000;
                    upgradeBaker();
                    upgradeBaker7.setEnabled(false);
                    upgradeBaker7.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeBaker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 5000000){
                    pizzas = pizzas - 5000000;
                    upgradeBaker();
                    upgradeBaker8.setEnabled(false);
                    upgradeBaker8.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });

        upgradeOven1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000){
                    pizzas = pizzas - 1000;
                    upgradeOven();
                    upgradeOven1.setEnabled(false);
                    upgradeOven1.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 25000){
                    pizzas = pizzas - 25000;
                    upgradeOven();
                    upgradeOven2.setEnabled(false);
                    upgradeOven2.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 50000){
                    pizzas = pizzas - 50000;
                    upgradeOven();
                    upgradeOven3.setEnabled(false);
                    upgradeOven3.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 100000){
                    pizzas = pizzas - 100000;
                    upgradeOven();
                    upgradeOven4.setEnabled(false);
                    upgradeOven4.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 250000){
                    pizzas = pizzas - 250000;
                    upgradeOven();
                    upgradeOven5.setEnabled(false);
                    upgradeOven5.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 500000){
                    pizzas = pizzas - 500000;
                    upgradeOven();
                    upgradeOven6.setEnabled(false);
                    upgradeOven6.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 1000000){
                    pizzas = pizzas - 1000000;
                    upgradeOven();
                    upgradeOven7.setEnabled(false);
                    upgradeOven7.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
        upgradeOven8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pizzas >= 5000000){
                    pizzas = pizzas - 5000000;
                    upgradeOven();
                    upgradeOven8.setEnabled(false);
                    upgradeOven8.setBackgroundColor(Color.WHITE);
                    updatePizzas();
                }
                else {
                    text();
                }
            }
        });
    }

    void text(){
        Toast.makeText(getApplicationContext(), "You don't have enough pizzas collected!", Toast.LENGTH_LONG).show();
    }

    void updatePizzas(){
        Helper helper = new Helper();
        pShow.setText("Pizzas: "+helper.toHumanValue(pizzas));
    }

    void upgradeClick(){
        clickUpgrade = clickUpgrade*2;
    }
    void upgradeBaker(){
        bakerUpgrade = bakerUpgrade*2;
    }
    void upgradeOven(){
        ovenUpgrade = ovenUpgrade*2;
    }

}
