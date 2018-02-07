package com.example.korisnik.eatpizza;

import android.widget.Toast;

public class Helper{



        static String toHumanValue(double toHumanValue){

                if(toHumanValue < 1000){
                        return String.format("%.1f",toHumanValue);
                }
                else if(toHumanValue< 1000000){
                        return String.format("%.1f",toHumanValue/1000) +"k";
                }
                else if(toHumanValue< 1000000000){
                        return String.format("%.1f",toHumanValue/1000000) +"M";
                }
                        return String.valueOf(toHumanValue);
                }

        /*static void toastMsg(String s){
                Toast.makeText(getApplicationContext(), ""+s, Toast.LENGTH_LONG).show();
        }*/

}
