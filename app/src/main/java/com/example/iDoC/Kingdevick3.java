package com.example.iDoC;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nicksimard.idoc_mar_9_home.R;

/**
 * Created by nicksimard on 16-04-03.
 */
public class Kingdevick3 extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kingdevick3);

        String fontPath = "fonts/exol.otf";
        TextView kd3txt1c = (TextView) findViewById(R.id.num1c);
        TextView kd3txt2c = (TextView) findViewById(R.id.num2c);
        TextView kd3txt3c = (TextView) findViewById(R.id.num3c);
        TextView kd3txt4c = (TextView) findViewById(R.id.num4c);
        TextView kd3txt5c = (TextView) findViewById(R.id.num5c);
        TextView kd3txt6c = (TextView) findViewById(R.id.num6c);
        TextView kd3txt7c = (TextView) findViewById(R.id.num7c);
        TextView kd3txt8c = (TextView) findViewById(R.id.num8c);
        TextView kd3txt9c = (TextView) findViewById(R.id.num9c);
        TextView kd3txt10c = (TextView) findViewById(R.id.num10c);
        TextView kd3txt11c = (TextView) findViewById(R.id.num11c);
        TextView kd3txt12c = (TextView) findViewById(R.id.num12c);
        TextView kd3txt13c = (TextView) findViewById(R.id.num13c);
        TextView kd3txt14c = (TextView) findViewById(R.id.num14c);
        TextView kd3txt15c = (TextView) findViewById(R.id.num15c);
        TextView kd3txt16c = (TextView) findViewById(R.id.num16c);
        TextView kd3txt17c = (TextView) findViewById(R.id.num17c);
        TextView kd3txt18c = (TextView) findViewById(R.id.num18c);
        TextView kd3txt19c = (TextView) findViewById(R.id.num19c);
        TextView kd3txt20c = (TextView) findViewById(R.id.num20c);
        TextView kd3txt21c = (TextView) findViewById(R.id.num21c);
        TextView kd3txt22c = (TextView) findViewById(R.id.num22c);
        TextView kd3txt23c = (TextView) findViewById(R.id.num23c);
        TextView kd3txt24c = (TextView) findViewById(R.id.num24c);
        TextView kd3txt25c = (TextView) findViewById(R.id.num25c);

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        kd3txt1c.setTypeface(tf);
        kd3txt2c.setTypeface(tf);
        kd3txt3c.setTypeface(tf);
        kd3txt4c.setTypeface(tf);
        kd3txt5c.setTypeface(tf);
        kd3txt6c.setTypeface(tf);
        kd3txt7c.setTypeface(tf);
        kd3txt8c.setTypeface(tf);
        kd3txt9c.setTypeface(tf);
        kd3txt10c.setTypeface(tf);
        kd3txt11c.setTypeface(tf);
        kd3txt12c.setTypeface(tf);
        kd3txt13c.setTypeface(tf);
        kd3txt14c.setTypeface(tf);
        kd3txt15c.setTypeface(tf);
        kd3txt16c.setTypeface(tf);
        kd3txt17c.setTypeface(tf);
        kd3txt18c.setTypeface(tf);
        kd3txt19c.setTypeface(tf);
        kd3txt20c.setTypeface(tf);
        kd3txt21c.setTypeface(tf);
        kd3txt22c.setTypeface(tf);
        kd3txt23c.setTypeface(tf);
        kd3txt24c.setTypeface(tf);
        kd3txt25c.setTypeface(tf);

        final long startTimec = System.currentTimeMillis();

        final TextView text1c = (TextView) findViewById(R.id.num1c);
        final TextView text2c = (TextView) findViewById(R.id.num2c);
        final TextView text3c = (TextView) findViewById(R.id.num3c);
        final TextView text4c = (TextView) findViewById(R.id.num4c);
        final TextView text5c = (TextView) findViewById(R.id.num5c);
        final TextView text6c = (TextView) findViewById(R.id.num6c);
        final TextView text7c = (TextView) findViewById(R.id.num7c);
        final TextView text8c = (TextView) findViewById(R.id.num8c);
        final TextView text9c = (TextView) findViewById(R.id.num9c);
        final TextView text10c = (TextView) findViewById(R.id.num10c);
        final TextView text11c = (TextView) findViewById(R.id.num11c);
        final TextView text12c = (TextView) findViewById(R.id.num12c);
        final TextView text13c = (TextView) findViewById(R.id.num13c);
        final TextView text14c = (TextView) findViewById(R.id.num14c);
        final TextView text15c = (TextView) findViewById(R.id.num15c);
        final TextView text16c = (TextView) findViewById(R.id.num16c);
        final TextView text17c = (TextView) findViewById(R.id.num17c);
        final TextView text18c = (TextView) findViewById(R.id.num18c);
        final TextView text19c = (TextView) findViewById(R.id.num19c);
        final TextView text20c = (TextView) findViewById(R.id.num20c);
        final TextView text21c = (TextView) findViewById(R.id.num21c);
        final TextView text22c = (TextView) findViewById(R.id.num22c);
        final TextView text23c = (TextView) findViewById(R.id.num23c);
        final TextView text24c = (TextView) findViewById(R.id.num24c);
        final TextView text25c = (TextView) findViewById(R.id.num25c);

        //Button , start?

        final String[] possibles = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] randoc = new int[26];
        final String[] randoclettc = new String[26];

        for (int i = 0; i < 26; i++) {
            randoc[i] = (int) (Math.random() * 26);
        }

        for (int j =0; j < 26; j++){
            randoclettc[j] = possibles[randoc[j]];
        }

        randoclettc[0] = "-";
        text1c.setText(randoclettc[1]);
        text2c.setText(randoclettc[2]);
        text3c.setText(randoclettc[3]);
        text4c.setText(randoclettc[4]);
        text5c.setText(randoclettc[5]);
        text6c.setText(randoclettc[6]);
        text7c.setText(randoclettc[7]);
        text8c.setText(randoclettc[8]);
        text9c.setText(randoclettc[9]);
        text10c.setText(randoclettc[10]);
        text11c.setText(randoclettc[11]);
        text12c.setText(randoclettc[12]);
        text13c.setText(randoclettc[13]);
        text14c.setText(randoclettc[14]);
        text15c.setText(randoclettc[15]);
        text16c.setText(randoclettc[16]);
        text17c.setText(randoclettc[17]);
        text18c.setText(randoclettc[18]);
        text19c.setText(randoclettc[19]);
        text20c.setText(randoclettc[20]);
        text21c.setText(randoclettc[21]);
        text22c.setText(randoclettc[22]);
        text23c.setText(randoclettc[23]);
        text24c.setText(randoclettc[24]);
        text25c.setText(randoclettc[25]);


        final EditText editc =  (EditText) findViewById(R.id.keybokd3);


        editc.setOnEditorActionListener(new EditText.OnEditorActionListener(){
            @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
                final long endTimec = System.currentTimeMillis();
                final long Timeelapsed = endTimec - startTimec;
                System.out.println("time is " + Timeelapsed);

                if (actionId == EditorInfo.IME_ACTION_DONE){

                    final String editedkd3 = editc.getText().toString();
                    final String[] kd3 = editedkd3.split("");

                    int count = 0;

                    for (int k = 0; k<26;){
                        int res = kd3[k].compareTo(randoclettc[k]);
                        System.out.println("res is " + res);
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
                        Results.class.newInstance().setKd3result(count, Timeelapsed);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent();
                    i.setClass(Kingdevick3.this, Kingdevick.class);
                    startActivity(i);
                }
                return false;
            }
        });




    }



}