package com.example.iDoC;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.nicksimard.idoc_mar_9_home.R;

public class MainActivity extends AppCompatActivity {
    private String serverResponse;

    private Results results;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResultClass();
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Font path
        String fontPath = "fonts/exol.otf";

        // text view label
        TextView txt1 = (TextView) findViewById(R.id.textpup);
        TextView txt2 = (TextView) findViewById(R.id.textsac);
        TextView txt3 = (TextView) findViewById(R.id.textasac);
        TextView txt4 = (TextView) findViewById(R.id.textkd);
        txt1.setTextSize(12);
        txt2.setTextSize(12);
        txt3.setTextSize(12);
        txt4.setTextSize(12);
        txt1.setPadding(0,10,0,0);
        txt2.setPadding(0,6,0,0);
        txt3.setPadding(0,30,0,0);
        txt4.setPadding(0,12,0,0);


        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txt1.setTypeface(tf);
        txt2.setTypeface(tf);
        txt3.setTypeface(tf);
        txt4.setTypeface(tf);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.pup) {
            Intent i = new Intent(MainActivity.this, Pupil.class);
            startActivity(i);
        }
    }

    public void onButtonClick2(View v) {
        if (v.getId() == R.id.sac) {

            Intent j = new Intent(MainActivity.this, Saccade.class);
            startActivity(j);


        }

    }

    public void onButtonClick3(View v) {
        if (v.getId() == R.id.asac) {
            Intent k = new Intent(MainActivity.this, Antisaccade.class);
            startActivity(k);
        }
    }

    public void onButtonClick4(View v) {
        if (v.getId() == R.id.kd) {
            Intent l = new Intent(MainActivity.this, Kingdevick.class);
            startActivity(l);
        }
    }

    public void onButtonClick5(View v) {
        if (v.getId() == R.id.results) {
            Intent m = new Intent(MainActivity.this, Results.class);
            startActivity(m);
        }


    }

    public void onButtonClick6(View v) {
        if (v.getId() == R.id.addinfo) {
            Intent n = new Intent(MainActivity.this, AdditionalInfo.class);
            startActivity(n);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setResultClass(){
        try {
            results = Results.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}