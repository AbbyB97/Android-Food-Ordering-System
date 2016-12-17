package com.lakj.comspace.simpletextclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Starters extends Activity {
    static int veg_crispy;
    static int chicken_crispy;
    static int paneer_chilly;
    static int masala_papad;
    static int veg_soup;
    static int chicken_soup;
    static int tomato_soup;
    static int cheese_pakoda;
    static int paneer_pakoda;
    static int chicken_chilly;
    static int starters_total;

    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        total_cal();
        orders_list_init();
    }
    public void veg_crispy_inc(View view) {
        veg_crispy = inc(veg_crispy);
        TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
        tv.setText("" + veg_crispy);
        total_cal();
    }

    public void veg_crispy_dec(View view) {
        if (veg_crispy >= 0) {
            veg_crispy = dec(veg_crispy);
            TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
            if (veg_crispy > 0) tv.setText("" + veg_crispy);
            else tv.setText("__");
            total_cal();
        }
    }

    public void chicken_crispy_inc(View view) {
        chicken_crispy = inc(chicken_crispy);
        TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
        tv.setText("" + chicken_crispy);
        total_cal();
    }

    public void chicken_crispy_dec(View view) {
        if (chicken_crispy >= 0) {
            chicken_crispy = dec(chicken_crispy);
            TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
            if (chicken_crispy > 0) tv.setText("" + chicken_crispy);
            else tv.setText("__");
            total_cal();
        }
    }

    public void paneer_chilly_inc(View view) {
        paneer_chilly = inc(paneer_chilly);
        TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
        tv.setText("" + paneer_chilly);
        total_cal();
    }

    public void paneer_chilly_dec(View view) {
        if (paneer_chilly >= 0) {
            paneer_chilly = dec(paneer_chilly);
            TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
            if (paneer_chilly > 0) tv.setText("" + paneer_chilly);
            else tv.setText("__");
            total_cal();
        }
    }
    public void masala_papad_inc(View view) {
        masala_papad = inc(masala_papad);
        TextView tv = (TextView) findViewById(R.id.masala_papad_order);
        tv.setText("" + masala_papad);
        total_cal();
    }

    public void masala_papad_dec(View view) {
        if (masala_papad >= 0) {
            masala_papad = dec(masala_papad);
            TextView tv = (TextView) findViewById(R.id.masala_papad_order);
            if (masala_papad > 0) tv.setText("" + masala_papad);
            else tv.setText("__");
            total_cal();
        }
    }
    public void veg_soup_inc(View view) {
        veg_soup = inc(veg_soup);
        TextView tv = (TextView) findViewById(R.id.veg_soup_order);
        tv.setText("" + veg_soup);
        total_cal();
    }

    public void veg_soup_dec(View view) {
        if (veg_soup >= 0) {
            veg_soup = dec(veg_soup);
            TextView tv = (TextView) findViewById(R.id.veg_soup_order);
            if (veg_soup > 0) tv.setText("" + veg_soup);
            else tv.setText("__");
            total_cal();

        }
    }
    public void chicken_soup_inc(View view) {
        chicken_soup = inc(chicken_soup);
        TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
        tv.setText("" + chicken_soup);
        total_cal();
    }

    public void chicken_soup_dec(View view) {
        if (chicken_soup >= 0) {
            chicken_soup = dec(chicken_soup);
            TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
            if (chicken_soup > 0) tv.setText("" + chicken_soup);
            else tv.setText("__");
            total_cal();

        }
    }
    public void tomato_soup_inc(View view) {
        tomato_soup = inc(tomato_soup);
        TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
        tv.setText("" + tomato_soup);
        total_cal();
    }

    public void tomato_soup_dec(View view) {
        if (tomato_soup >= 0) {
            tomato_soup = dec(tomato_soup);
            TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
            if (tomato_soup > 0) tv.setText("" + tomato_soup);
            else tv.setText("__");

            total_cal();
        }
    }
    public void cheese_pakoda_inc(View view) {
        cheese_pakoda = inc(cheese_pakoda);
        TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
        tv.setText("" + cheese_pakoda);

        total_cal();
    }

    public void cheese_pakoda_dec(View view) {
        if (cheese_pakoda >= 0) {
            cheese_pakoda = dec(cheese_pakoda);
            TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
            if (cheese_pakoda > 0) tv.setText("" + cheese_pakoda);
            else tv.setText("__");

            total_cal();
        }
    }
    public void paneer_pakoda_inc(View view) {
        paneer_pakoda = inc(paneer_pakoda);
        TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
        tv.setText("" + paneer_pakoda);

        total_cal();
    }

    public void paneer_pakoda_dec(View view) {
        if (paneer_pakoda >= 0) {
            paneer_pakoda = dec(paneer_pakoda);
            TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
            if (paneer_pakoda > 0) tv.setText("" + paneer_pakoda);
            else tv.setText("__");

            total_cal();
        }
    }
    public void chicken_chilly_inc(View view) {
        chicken_chilly = inc(chicken_chilly);
        TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
        tv.setText("" + chicken_chilly);

        total_cal();
    }

    public void chicken_chilly_dec(View view) {
        if (chicken_chilly >= 0) {
            chicken_chilly = dec(chicken_chilly);
            TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
            if (chicken_chilly > 0) tv.setText("" + chicken_chilly);
            else tv.setText("__");

            total_cal();
        }
    }





    public void total_cal()
    {
        starters_total=veg_crispy*(150)+chicken_crispy*(170)+paneer_chilly*(120)+masala_papad*(30)+veg_soup*(80)+chicken_soup*(80)+tomato_soup*(100)+cheese_pakoda*(130)+paneer_pakoda*(140)+chicken_chilly*(120);
        finalize_order.all_total=Starters.starters_total+Veg.total_veg+N_Veg.n_veg_total+Dessert.dessert_total;

        if (finalize_order.all_total > 0) {
        TextView tv = (TextView) findViewById(R.id.starters_tot_id);
        tv.setText(""+"₹"+(finalize_order.all_total));
            }
    else
        {
            TextView tv = (TextView) findViewById(R.id.starters_tot_id);
            tv.setText("");

        }

        orders_list_init();
    }




    public void main_menu(View view){
        Intent goto_main_menu= new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);overridePendingTransition(R.anim.fadin, R.anim.fadout);
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

    public void orders_list_init(){
        if(veg_crispy>0) {
            TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
            tv.setText("" + veg_crispy);
        }
        if(chicken_crispy>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
            tv.setText("" + chicken_crispy);
        }

        if(paneer_chilly>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
            tv.setText("" + paneer_chilly);
        }

        if(masala_papad>0) {
            TextView tv = (TextView) findViewById(R.id.masala_papad_order);
            tv.setText("" + masala_papad);
        }


        if(veg_soup>0) {
            TextView tv = (TextView) findViewById(R.id.veg_soup_order);
            tv.setText("" + veg_soup);
        }

        if(chicken_soup>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
            tv.setText("" + chicken_soup);
        }


        if(tomato_soup>0) {
            TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
            tv.setText("" + tomato_soup);
        }

        if(cheese_pakoda>0) {
            TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
            tv.setText("" + cheese_pakoda);
        }

        if(paneer_pakoda>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
            tv.setText("" + paneer_pakoda);
        }

        if(chicken_chilly>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
            tv.setText("" + chicken_chilly);
        }

    }

    public void fin_ord(View view)
    {
        final Object o= this;
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

                                Intent nextact = new Intent((Starters) o, thankyou.class);
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

