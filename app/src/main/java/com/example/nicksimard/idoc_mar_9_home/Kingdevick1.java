package com.example.nicksimard.idoc_mar_9_home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nicksimard on 16-04-03.
 */
public class Kingdevick1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kingdevick1);

        String fontPath = "fonts/exol.otf";
        TextView kd1txt1 = (TextView) findViewById(R.id.num1);
        TextView kd1txt2 = (TextView) findViewById(R.id.num2);
        TextView kd1txt3 = (TextView) findViewById(R.id.num3);
        TextView kd1txt4 = (TextView) findViewById(R.id.num4);
        TextView kd1txt5 = (TextView) findViewById(R.id.num5);
        TextView kd1txt6 = (TextView) findViewById(R.id.num6);
        TextView kd1txt7 = (TextView) findViewById(R.id.num7);
        TextView kd1txt8 = (TextView) findViewById(R.id.num8);
        TextView kd1txt9 = (TextView) findViewById(R.id.num9);
        TextView kd1txt10 = (TextView) findViewById(R.id.num10);
        TextView kd1txt11 = (TextView) findViewById(R.id.num11);
        TextView kd1txt12 = (TextView) findViewById(R.id.num12);
        TextView kd1txt13 = (TextView) findViewById(R.id.num13);
        TextView kd1txt14 = (TextView) findViewById(R.id.num14);
        TextView kd1txt15 = (TextView) findViewById(R.id.num15);
        TextView kd1txt16 = (TextView) findViewById(R.id.num16);
        TextView kd1txt17 = (TextView) findViewById(R.id.num17);
        TextView kd1txt18 = (TextView) findViewById(R.id.num18);
        TextView kd1txt19 = (TextView) findViewById(R.id.num19);
        TextView kd1txt20 = (TextView) findViewById(R.id.num20);
        TextView kd1txt21 = (TextView) findViewById(R.id.num21);
        TextView kd1txt22 = (TextView) findViewById(R.id.num22);
        TextView kd1txt23 = (TextView) findViewById(R.id.num23);
        TextView kd1txt24 = (TextView) findViewById(R.id.num24);
        TextView kd1txt25 = (TextView) findViewById(R.id.num25);


        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        kd1txt1.setTypeface(tf);
        kd1txt2.setTypeface(tf);
        kd1txt3.setTypeface(tf);
        kd1txt4.setTypeface(tf);
        kd1txt5.setTypeface(tf);
        kd1txt6.setTypeface(tf);
        kd1txt7.setTypeface(tf);
        kd1txt8.setTypeface(tf);
        kd1txt9.setTypeface(tf);
        kd1txt10.setTypeface(tf);
        kd1txt11.setTypeface(tf);
        kd1txt12.setTypeface(tf);
        kd1txt13.setTypeface(tf);
        kd1txt14.setTypeface(tf);
        kd1txt15.setTypeface(tf);
        kd1txt16.setTypeface(tf);
        kd1txt17.setTypeface(tf);
        kd1txt18.setTypeface(tf);
        kd1txt19.setTypeface(tf);
        kd1txt20.setTypeface(tf);
        kd1txt21.setTypeface(tf);
        kd1txt22.setTypeface(tf);
        kd1txt23.setTypeface(tf);
        kd1txt24.setTypeface(tf);
        kd1txt25.setTypeface(tf);





        final long startTimea = System.currentTimeMillis();

        final TextView text1a = (TextView) findViewById(R.id.num1);
        final TextView text2a = (TextView) findViewById(R.id.num2);
        final TextView text3a = (TextView) findViewById(R.id.num3);
        final TextView text4a = (TextView) findViewById(R.id.num4);
        final TextView text5a = (TextView) findViewById(R.id.num5);
        final TextView text6a = (TextView) findViewById(R.id.num6);
        final TextView text7a = (TextView) findViewById(R.id.num7);
        final TextView text8a = (TextView) findViewById(R.id.num8);
        final TextView text9a = (TextView) findViewById(R.id.num9);
        final TextView text10a = (TextView) findViewById(R.id.num10);
        final TextView text11a = (TextView) findViewById(R.id.num11);
        final TextView text12a = (TextView) findViewById(R.id.num12);
        final TextView text13a = (TextView) findViewById(R.id.num13);
        final TextView text14a = (TextView) findViewById(R.id.num14);
        final TextView text15a = (TextView) findViewById(R.id.num15);
        final TextView text16a = (TextView) findViewById(R.id.num16);
        final TextView text17a = (TextView) findViewById(R.id.num17);
        final TextView text18a = (TextView) findViewById(R.id.num18);
        final TextView text19a = (TextView) findViewById(R.id.num19);
        final TextView text20a = (TextView) findViewById(R.id.num20);
        final TextView text21a = (TextView) findViewById(R.id.num21);
        final TextView text22a = (TextView) findViewById(R.id.num22);
        final TextView text23a = (TextView) findViewById(R.id.num23);
        final TextView text24a = (TextView) findViewById(R.id.num24);
        final TextView text25a = (TextView) findViewById(R.id.num25);


        //Button , start?

        final String[] possibles = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] randoa = new int[26];
        final String[] randocletta = new String[26];

        for (int i = 0; i < 26; i++) {
            randoa[i] = (int) (Math.random() * 26);
        }

        for (int j =0; j < 26; j++){
            randocletta[j] = possibles[randoa[j]];
        }

        randocletta[0] = "-";
        text1a.setText(randocletta[1]);
        text2a.setText(randocletta[2]);
        text3a.setText(randocletta[3]);
        text4a.setText(randocletta[4]);
        text5a.setText(randocletta[5]);
        text6a.setText(randocletta[6]);
        text7a.setText(randocletta[7]);
        text8a.setText(randocletta[8]);
        text9a.setText(randocletta[9]);
        text10a.setText(randocletta[10]);
        text11a.setText(randocletta[11]);
        text12a.setText(randocletta[12]);
        text13a.setText(randocletta[13]);
        text14a.setText(randocletta[14]);
        text15a.setText(randocletta[15]);
        text16a.setText(randocletta[16]);
        text17a.setText(randocletta[17]);
        text18a.setText(randocletta[18]);
        text19a.setText(randocletta[19]);
        text20a.setText(randocletta[20]);
        text21a.setText(randocletta[21]);
        text22a.setText(randocletta[22]);
        text23a.setText(randocletta[23]);
        text24a.setText(randocletta[24]);
        text25a.setText(randocletta[25]);



        final EditText edita =  (EditText) findViewById(R.id.keybo);


        edita.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                final long endTimea = System.currentTimeMillis();
                final long Timeelapsed = endTimea - startTimea;
                System.out.println("time is " + Timeelapsed);

                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    final String editedkd1 = edita.getText().toString();
                    final String[] kd1 = editedkd1.split("");

                    int count = 0;

                    for (int k = 0; k < 26; ) {
                        int res = kd1[k].compareTo(randocletta[k]);
                        System.out.println("res is " + res);
                        if (res == 0) {
                            count++;
                            System.out.println("count is " + count);
                            k++;
                        } else if (res!=0) {
                            k++;
                        }
                    }

                    try {
                        Results.class.newInstance().setKd1result(count, Timeelapsed);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    Intent i = new Intent();
                    i.setClass(Kingdevick1.this, Kingdevick.class);
                    startActivity(i);
                }
                return false;
            }
        });

    }


}
