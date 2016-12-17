package com.lakj.comspace.simpletextclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Dessert extends Activity {

    static int chocolate_ice_cream;
    static int vanilla_ice_cream;
    static int strawberry_ice_cream;
    static int falooda;
    static int brownie_fudge;
    static int alpine_chocolate;
    static int devils_delight;
    static int black_forest;
    static int chocolate_lava;
    static int dutch_almond;
    static int dessert_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        total_cal();
        orders_list_init();
    }

    @Override
    public void onBackPressed() {
        // do nothing.
    }

    public void chocolate_ice_cream_inc(View view) {
        chocolate_ice_cream = inc(chocolate_ice_cream);
        TextView tv = (TextView) findViewById(R.id.choco_ice_cream_order);
        tv.setText("" + chocolate_ice_cream);
        total_cal();
    }

    public void chocolate_ice_cream_dec(View view) {
        if (chocolate_ice_cream >= 0) {
            chocolate_ice_cream = dec(chocolate_ice_cream);
            TextView tv = (TextView) findViewById(R.id.choco_ice_cream_order);
            if (chocolate_ice_cream > 0) tv.setText("" + chocolate_ice_cream);
            else tv.setText("__");
            total_cal();
        }
    }

    public void vanilla_ice_cream_inc(View view) {
        vanilla_ice_cream = inc(vanilla_ice_cream);
        TextView tv = (TextView) findViewById(R.id.vannila_ice_cream_order);
        tv.setText("" + vanilla_ice_cream);
        total_cal();
    }

    public void vanilla_ice_cream_dec(View view) {
        if (vanilla_ice_cream >= 0) {
            vanilla_ice_cream = dec(vanilla_ice_cream);
            TextView tv = (TextView) findViewById(R.id.vannila_ice_cream_order);
            if (vanilla_ice_cream > 0) tv.setText("" + vanilla_ice_cream);
            else tv.setText("__");
            total_cal();
        }

    }

    public void strawberry_ice_cream_inc(View view) {
        strawberry_ice_cream = inc(strawberry_ice_cream);
        TextView tv = (TextView) findViewById(R.id.Strawberry_ice_cream_order);
        tv.setText("" + strawberry_ice_cream);
        total_cal();
    }

    public void strawberry_ice_cream_dec(View view) {
        if (strawberry_ice_cream >= 0) {
            strawberry_ice_cream = dec(strawberry_ice_cream);
            TextView tv = (TextView) findViewById(R.id.Strawberry_ice_cream_order);
            if (strawberry_ice_cream > 0) tv.setText("" + strawberry_ice_cream);
            else tv.setText("__");
            total_cal();
        }

    }

    public void falooda_inc(View view) {
        falooda = inc(falooda);
        TextView tv = (TextView) findViewById(R.id.falooda_order);
        tv.setText("" + falooda);
        total_cal();
    }

    public void falooda_dec(View view) {
        if (falooda >= 0) {
            falooda = dec(falooda);
            TextView tv = (TextView) findViewById(R.id.falooda_order);
            if (falooda > 0) tv.setText("" + falooda);
            else tv.setText("__");
            total_cal();

        }

    }

    public void brownie_fudge_inc(View view) {
        brownie_fudge = inc(brownie_fudge);
        TextView tv = (TextView) findViewById(R.id.brownie_fudge_order);
        tv.setText("" + brownie_fudge);
        total_cal();
    }

    public void brownie_fudge_dec(View view) {
        if (brownie_fudge >= 0) {
            brownie_fudge = dec(brownie_fudge);
            TextView tv = (TextView) findViewById(R.id.brownie_fudge_order);
            if (brownie_fudge > 0) tv.setText("" + brownie_fudge);
            else tv.setText("__");
            total_cal();
        }

    }

    public void alpine_chocolate_inc(View view) {
        alpine_chocolate = inc(alpine_chocolate);
        TextView tv = (TextView) findViewById(R.id.alpine_chocolate_order);
        tv.setText("" + alpine_chocolate);
        total_cal();
    }

    public void alpine_chocolate_dec(View view) {
        if (alpine_chocolate >= 0) {
            alpine_chocolate = dec(alpine_chocolate);
            TextView tv = (TextView) findViewById(R.id.alpine_chocolate_order);
            if (alpine_chocolate > 0) tv.setText("" + alpine_chocolate);
            else tv.setText("__");
            total_cal();
        }

    }

    public void devils_delight_inc(View view) {
        devils_delight = inc(devils_delight);
        TextView tv = (TextView) findViewById(R.id.devils_delite_order);
        tv.setText("" + devils_delight);
        total_cal();
    }

    public void devils_delight_dec(View view) {
        if (devils_delight >= 0) {
            devils_delight = dec(devils_delight);
            TextView tv = (TextView) findViewById(R.id.devils_delite_order);
            if (devils_delight > 0) tv.setText("" + devils_delight);
            else tv.setText("__");
            total_cal();
        }

    }

    public void black_forest_inc(View view) {
        black_forest = inc(black_forest);
        TextView tv = (TextView) findViewById(R.id.black_forest_order);
        tv.setText("" + black_forest);
        total_cal();
    }

    public void black_forest_dec(View view) {
        if (black_forest >= 0) {
            black_forest = dec(black_forest);
            TextView tv = (TextView) findViewById(R.id.black_forest_order);
            if (black_forest > 0) tv.setText("" + black_forest);
            else tv.setText("__");
            total_cal();
        }

    }

    public void chocolate_lava_inc(View view) {
        chocolate_lava = inc(chocolate_lava);
        TextView tv = (TextView) findViewById(R.id.choco_lava_order);
        tv.setText("" + chocolate_lava);
        total_cal();
    }

    public void chocolate_lava_dec(View view) {
        if (chocolate_lava >= 0) {
            chocolate_lava = dec(chocolate_lava);
            TextView tv = (TextView) findViewById(R.id.choco_lava_order);
            if (chocolate_lava > 0) tv.setText("" + chocolate_lava);
            else tv.setText("__");
            total_cal();

        }

    }

    public void dutch_almond_inc(View view) {
        dutch_almond = inc(dutch_almond);
        TextView tv = (TextView) findViewById(R.id.dutch_almond_order);
        tv.setText("" + dutch_almond);
        total_cal();
    }

    public void dutch_almond_dec(View view) {
        if (dutch_almond >= 0) {
            dutch_almond = dec(dutch_almond);
            TextView tv = (TextView) findViewById(R.id.dutch_almond_order);
            if (dutch_almond > 0) tv.setText("" + dutch_almond);
            else tv.setText("__");
            total_cal();
        }

    }


    public void total_cal() {
        dessert_total = chocolate_ice_cream * (80) + vanilla_ice_cream * (70) + strawberry_ice_cream * (75) + falooda * (150) + brownie_fudge * (120) + alpine_chocolate * (150) + devils_delight * (100) + black_forest * (80) + chocolate_lava * (180) + dutch_almond * (120);
        finalize_order.all_total = Starters.starters_total + Veg.total_veg + N_Veg.n_veg_total + Dessert.dessert_total;
        if (finalize_order.all_total > 0) {
        TextView tv = (TextView) findViewById(R.id.dessert_tot_id);
        tv.setText("" + "₹" + (finalize_order.all_total));

        }
        else{
            TextView tv = (TextView) findViewById(R.id.dessert_tot_id);
            tv.setText("");
        }
        orders_list_init();
    }


    public void main_menu(View view) {
        Intent goto_main_menu = new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }


    public int dec(int x) {
        if (x > 0) {
            x--;
            return x;
        } else return 0;
    }


    public int inc(int x) {
        x++;
        return (x);
    }

    public void orders_list_init() {



        if (chocolate_ice_cream > 0) {
                TextView tv = (TextView) findViewById(R.id.choco_ice_cream_order);
                tv.setText("" + chocolate_ice_cream);
        }
        if (vanilla_ice_cream > 0) {
            TextView tv = (TextView) findViewById(R.id.vannila_ice_cream_order);
            tv.setText("" + vanilla_ice_cream);
        }
        if (strawberry_ice_cream > 0) {
            TextView tv = (TextView) findViewById(R.id.Strawberry_ice_cream_order);
            tv.setText("" + strawberry_ice_cream);
        }

        if (falooda > 0) {
            TextView tv = (TextView) findViewById(R.id.falooda_order);
            tv.setText("" + falooda);
        }

        if (brownie_fudge > 0) {
            TextView tv = (TextView) findViewById(R.id.brownie_fudge_order);
            tv.setText("" + brownie_fudge);
        }

        if (alpine_chocolate > 0) {
            TextView tv = (TextView) findViewById(R.id.alpine_chocolate_order);
            tv.setText("" + alpine_chocolate);
        }
        if (devils_delight > 0) {
            TextView tv = (TextView) findViewById(R.id.devils_delite_order);
            tv.setText("" + devils_delight);
        }
        if (black_forest > 0) {
            TextView tv = (TextView) findViewById(R.id.black_forest_order);
            tv.setText("" + black_forest);
        }


        if (chocolate_lava > 0) {
            TextView tv = (TextView) findViewById(R.id.choco_lava_order);
            tv.setText("" + chocolate_lava);
        }

        if (dutch_almond > 0) {
            TextView tv = (TextView) findViewById(R.id.dutch_almond_order);
            tv.setText("" + dutch_almond);
        }
    }

    public void fin_ord(View view)
    {
        final Object o = this;
        if(finalize_order.all_total>0) {
            Intent fin = new Intent(this, finalize_order.class);
            startActivity(fin);
            overridePendingTransition(R.anim.fadin, R.anim.fadout);
        }
        else{

            if(finalize_order.next_ord_flag==1)
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you don't want to place another order?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Intent nextact = new Intent((Dessert) o, thankyou.class);
                                startActivity(nextact);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }

                else{
                Toast.makeText(getApplicationContext(),
                        "Please select your order", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
