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
public class Kingdevick2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kingdevick2);

        String fontPath = "fonts/exol.otf";
        TextView kd2txt1b = (TextView) findViewById(R.id.num1b);
        TextView kd2txt2b = (TextView) findViewById(R.id.num2b);
        TextView kd2txt3b = (TextView) findViewById(R.id.num3b);
        TextView kd2txt4b = (TextView) findViewById(R.id.num4b);
        TextView kd2txt5b = (TextView) findViewById(R.id.num5b);
        TextView kd2txt6b = (TextView) findViewById(R.id.num6b);
        TextView kd2txt7b = (TextView) findViewById(R.id.num7b);
        TextView kd2txt8b = (TextView) findViewById(R.id.num8b);
        TextView kd2txt9b = (TextView) findViewById(R.id.num9b);
        TextView kd2txt10b = (TextView) findViewById(R.id.num10b);
        TextView kd2txt11b = (TextView) findViewById(R.id.num11b);
        TextView kd2txt12b = (TextView) findViewById(R.id.num12b);
        TextView kd2txt13b = (TextView) findViewById(R.id.num13b);
        TextView kd2txt14b = (TextView) findViewById(R.id.num14b);
        TextView kd2txt15b = (TextView) findViewById(R.id.num15b);
        TextView kd2txt16b = (TextView) findViewById(R.id.num16b);
        TextView kd2txt17b = (TextView) findViewById(R.id.num17b);
        TextView kd2txt18b = (TextView) findViewById(R.id.num18b);
        TextView kd2txt19b = (TextView) findViewById(R.id.num19b);
        TextView kd2txt20b = (TextView) findViewById(R.id.num20b);
        TextView kd2txt21b = (TextView) findViewById(R.id.num21b);
        TextView kd2txt22b = (TextView) findViewById(R.id.num22b);
        TextView kd2txt23b = (TextView) findViewById(R.id.num23b);
        TextView kd2txt24b = (TextView) findViewById(R.id.num24b);
        TextView kd2txt25b = (TextView) findViewById(R.id.num25b);

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        kd2txt1b.setTypeface(tf);
        kd2txt2b.setTypeface(tf);
        kd2txt3b.setTypeface(tf);
        kd2txt4b.setTypeface(tf);
        kd2txt5b.setTypeface(tf);
        kd2txt6b.setTypeface(tf);
        kd2txt7b.setTypeface(tf);
        kd2txt8b.setTypeface(tf);
        kd2txt9b.setTypeface(tf);
        kd2txt10b.setTypeface(tf);
        kd2txt11b.setTypeface(tf);
        kd2txt12b.setTypeface(tf);
        kd2txt13b.setTypeface(tf);
        kd2txt14b.setTypeface(tf);
        kd2txt15b.setTypeface(tf);
        kd2txt16b.setTypeface(tf);
        kd2txt17b.setTypeface(tf);
        kd2txt18b.setTypeface(tf);
        kd2txt19b.setTypeface(tf);
        kd2txt20b.setTypeface(tf);
        kd2txt21b.setTypeface(tf);
        kd2txt22b.setTypeface(tf);
        kd2txt23b.setTypeface(tf);
        kd2txt24b.setTypeface(tf);
        kd2txt25b.setTypeface(tf);

        final long startTimeb = System.currentTimeMillis();


        final TextView text1b = (TextView) findViewById(R.id.num1b);
        final TextView text2b = (TextView) findViewById(R.id.num2b);
        final TextView text3b = (TextView) findViewById(R.id.num3b);
        final TextView text4b = (TextView) findViewById(R.id.num4b);
        final TextView text5b = (TextView) findViewById(R.id.num5b);
        final TextView text6b = (TextView) findViewById(R.id.num6b);
        final TextView text7b = (TextView) findViewById(R.id.num7b);
        final TextView text8b = (TextView) findViewById(R.id.num8b);
        final TextView text9b = (TextView) findViewById(R.id.num9b);
        final TextView text10b = (TextView) findViewById(R.id.num10b);
        final TextView text11b = (TextView) findViewById(R.id.num11b);
        final TextView text12b = (TextView) findViewById(R.id.num12b);
        final TextView text13b = (TextView) findViewById(R.id.num13b);
        final TextView text14b = (TextView) findViewById(R.id.num14b);
        final TextView text15b = (TextView) findViewById(R.id.num15b);
        final TextView text16b = (TextView) findViewById(R.id.num16b);
        final TextView text17b = (TextView) findViewById(R.id.num17b);
        final TextView text18b = (TextView) findViewById(R.id.num18b);
        final TextView text19b = (TextView) findViewById(R.id.num19b);
        final TextView text20b = (TextView) findViewById(R.id.num20b);
        final TextView text21b = (TextView) findViewById(R.id.num21b);
        final TextView text22b = (TextView) findViewById(R.id.num22b);
        final TextView text23b = (TextView) findViewById(R.id.num23b);
        final TextView text24b = (TextView) findViewById(R.id.num24b);
        final TextView text25b = (TextView) findViewById(R.id.num25b);


        //Button , start?

        final String[] possibles = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] randob = new int[26];
        final String[] randoclettb = new String[26];

        for (int i = 0; i < 26; i++) {
            randob[i] = (int) (Math.random() * 26);
        }

        for (int j =0; j < 26; j++){
            randoclettb[j] = possibles[randob[j]];
        }

        randoclettb[0] = "-";
        text1b.setText(randoclettb[1]);
        text2b.setText(randoclettb[2]);
        text3b.setText(randoclettb[3]);
        text4b.setText(randoclettb[4]);
        text5b.setText(randoclettb[5]);
        text6b.setText(randoclettb[6]);
        text7b.setText(randoclettb[7]);
        text8b.setText(randoclettb[8]);
        text9b.setText(randoclettb[9]);
        text10b.setText(randoclettb[10]);
        text11b.setText(randoclettb[11]);
        text12b.setText(randoclettb[12]);
        text13b.setText(randoclettb[13]);
        text14b.setText(randoclettb[14]);
        text15b.setText(randoclettb[15]);
        text16b.setText(randoclettb[16]);
        text17b.setText(randoclettb[17]);
        text18b.setText(randoclettb[18]);
        text19b.setText(randoclettb[19]);
        text20b.setText(randoclettb[20]);
        text21b.setText(randoclettb[21]);
        text22b.setText(randoclettb[22]);
        text23b.setText(randoclettb[23]);
        text24b.setText(randoclettb[24]);
        text25b.setText(randoclettb[25]);

        final EditText editb =  (EditText) findViewById(R.id.keybokd2);


        editb.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                final long endTimeb = System.currentTimeMillis();
                final long Timeelapsed = endTimeb - startTimeb;
                System.out.println("time is " + Timeelapsed);

                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    final String editedkd2 = editb.getText().toString();
                    final String[] kd2 = editedkd2.split("");

                    int count = 0;

                    for (int k = 0; k<26;){
                        int res = kd2[k].compareTo(randoclettb[k]);
                        if (res==0){
                            count++;
                            System.out.println("count is " + count);
                            k++;
                        }
                        else if(res!=0){
                            k++;
                        }
                    }
                    try {
                        Results.class.newInstance().setKd2result(count, Timeelapsed);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent();
                    i.setClass(Kingdevick2.this, Kingdevick.class);
                    startActivity(i);
                }
                return false;
            }
        });


    }

}
