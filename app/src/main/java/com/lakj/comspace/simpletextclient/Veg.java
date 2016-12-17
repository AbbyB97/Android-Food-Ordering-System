package com.lakj.comspace.simpletextclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Veg extends Activity {

    static int roti;
    static int butter_roti;
    static int paneer_tikka;
    static int veg_pulao;
    static int mutter_paneer;
    static int veg_noodles;
    static int veg_fried_rice;
    static int veg_burger;
    static int veg_biryani;
    static int paneer_kofta;
    static int total_veg;
    static String order_veg;

    @Override
    public void onBackPressed() {
        // do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        total_cal();
        orders_list_init();
    }


    public void roti_inc(View view){
        roti=inc(roti);
        TextView tv = (TextView) findViewById(R.id.roti_order);
        tv.setText("" + roti);
        total_cal();
    }
    public void roti_dec(View view) {
        if (roti>= 0) {
            roti= dec(roti);
            TextView tv = (TextView) findViewById(R.id.roti_order);
            if(roti>0) tv.setText("" + roti);
            else tv.setText("__");
            total_cal();
        }
    }


    public void butter_roti_inc(View view){
        butter_roti=inc(butter_roti);
        TextView tv = (TextView) findViewById(R.id.butter_roti_order);
        tv.setText("" + butter_roti);
        total_cal();
    }
    public void butter_roti_dec(View view) {
        if (butter_roti>= 0) {
            butter_roti= dec(butter_roti);
            TextView tv = (TextView) findViewById(R.id.butter_roti_order);
            if(butter_roti>0) tv.setText("" + butter_roti);
            else tv.setText("__");

            total_cal();
        }
    }


    public void paneer_tikka_inc(View view){
        paneer_tikka=inc(paneer_tikka);
        TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
        tv.setText("" + paneer_tikka);
        total_cal();
    }
    public void paneer_tikka_dec(View view) {
        if (paneer_tikka>= 0) {
            paneer_tikka= dec(paneer_tikka);
            TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
            if(paneer_tikka>0) tv.setText("" + paneer_tikka);
            else tv.setText("__");

            total_cal();
        }
    }

    public void veg_pulao_inc(View view){
        veg_pulao=inc(veg_pulao);
        TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
        tv.setText("" + veg_pulao);
        total_cal();
    }
    public void veg_pulao_dec(View view) {
        if (veg_pulao>= 0) {
            veg_pulao= dec(veg_pulao);
            TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
            if(veg_pulao>0) tv.setText("" + veg_pulao);
            else tv.setText("__");

            total_cal();
        }
    }

    public void mutter_paneer_inc(View view){
        mutter_paneer=inc(mutter_paneer);
        TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
        tv.setText("" + mutter_paneer);

        total_cal();
    }
    public void mutter_paneer_dec(View view) {
        if (mutter_paneer>= 0) {
            mutter_paneer= dec(mutter_paneer);
            TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
            if(mutter_paneer>0) tv.setText("" + mutter_paneer);
            else tv.setText("__");

            total_cal();
        }
    }

    public void veg_noodles_inc(View view){
        veg_noodles=inc(veg_noodles);
        TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
        tv.setText("" + veg_noodles);

        total_cal();
    }
    public void veg_noodles_dec(View view) {
        if (veg_noodles>= 0) {
            veg_noodles= dec(veg_noodles);
            TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
            if(veg_noodles>0) tv.setText("" + veg_noodles);
            else tv.setText("__");

            total_cal();
        }
    }


    public void veg_fried_rice_inc(View view){
        veg_fried_rice=inc(veg_fried_rice);
        TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
        tv.setText("" + veg_fried_rice);
        total_cal();
    }
    public void veg_fried_rice_dec(View view) {
        if (veg_fried_rice>= 0) {
            veg_fried_rice= dec(veg_fried_rice);
            TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
            if(veg_fried_rice>0) tv.setText("" + veg_fried_rice);
            else tv.setText("__");

            total_cal();
        }
    }


    public void veg_burger_inc(View view){
        veg_burger=inc(veg_burger);
        TextView tv = (TextView) findViewById(R.id.veg_burger_order);
        tv.setText("" + veg_burger);

        total_cal();
    }
    public void veg_burger_dec(View view) {
        if (veg_burger>= 0) {
            veg_burger= dec(veg_burger);
            TextView tv = (TextView) findViewById(R.id.veg_burger_order);
            if(veg_burger>0) tv.setText("" + veg_burger);
            else tv.setText("__");

            total_cal();
        }
    }


    public void veg_biryani_inc(View view){
        veg_biryani=inc(veg_biryani);
        TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
        tv.setText("" + veg_biryani);

        total_cal();
    }
    public void veg_biryani_dec(View view) {
        if (veg_biryani>= 0) {
            veg_biryani= dec(veg_biryani);
            TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
            if(veg_biryani>0) tv.setText("" + veg_biryani);
            else tv.setText("__");

            total_cal();
            }
    }



    public void paneer_kofta_inc(View view){
        paneer_kofta=inc(paneer_kofta);
        TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
        tv.setText("" + paneer_kofta);

        total_cal();
    }
    public void paneer_kofta_dec(View view) {
        if (paneer_kofta>= 0) {
            paneer_kofta= dec(paneer_kofta);
            TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
            if(paneer_kofta>0) tv.setText("" + paneer_kofta);
            else tv.setText("__");

            total_cal();
        }
    }




    public void total_cal(){
        total_veg=roti*(20)+butter_roti*(25)+paneer_tikka*(180)+veg_pulao*(200)+mutter_paneer*(200)+veg_noodles*(100)+veg_fried_rice*(120)+veg_burger*(40)+veg_biryani*(150)+paneer_kofta*(150);
        finalize_order.all_total=Starters.starters_total+Veg.total_veg+N_Veg.n_veg_total+Dessert.dessert_total;

        if (finalize_order.all_total > 0) {
        TextView tv = (TextView) findViewById(R.id.veg_total_id);
        tv.setText(""+"₹"+ (finalize_order.all_total));
    }
    else{
            TextView tv = (TextView) findViewById(R.id.veg_total_id);
            tv.setText("");

        }
    }

    public void main_menu(View view){
        Intent goto_main_menu= new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }


    public int dec(int x) {
        if (x > 0) {
            x--;
            return x;
        }
        else return 0;
    }


    public int inc(int x)
    {
        x++;
        return (x);
    }

        public void orders_list_init(){
            if(roti>0) {
                TextView tv = (TextView) findViewById(R.id.roti_order);
                tv.setText("" + roti);
            }
            if(butter_roti>0) {
                TextView tv = (TextView) findViewById(R.id.butter_roti_order);
                tv.setText("" + butter_roti);
            }

            if(paneer_tikka>0) {
                TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
                tv.setText("" + paneer_tikka);
            }
            if(veg_pulao>0) {
                TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
                tv.setText("" + veg_pulao);
            }
            if(mutter_paneer>0) {
                TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
                tv.setText("" + mutter_paneer);
            }
            if(veg_noodles>0) {
                TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
                tv.setText("" + veg_noodles);
            }
            if(veg_fried_rice>0) {
                TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
                tv.setText("" + veg_fried_rice);
            }
            if(veg_burger>0) {
                TextView tv = (TextView) findViewById(R.id.veg_burger_order);
                tv.setText("" + veg_burger);
            }

            if(veg_biryani>0) {
                TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
                tv.setText("" + veg_biryani);
            }
            if(paneer_kofta>0) {
                TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
                tv.setText("" + paneer_kofta);
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

                                Intent nextact = new Intent((Veg) o, thankyou.class);
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
