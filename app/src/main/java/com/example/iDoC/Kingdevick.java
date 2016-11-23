package com.example.iDoC;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.nicksimard.idoc_mar_9_home.R;

/**
 * Created by nicksimard on 16-03-10.
 */
public class Kingdevick extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kingdevick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onButtonClickkd1(View v)
    {
        if(v.getId() == R.id.kd1)
        {
            Intent j = new Intent(Kingdevick.this, Kingdevick1.class);
            startActivity(j);
        }

    }

    public void onButtonClickkd2(View v)
    {
        if(v.getId() == R.id.kd2)
        {
            Intent k = new Intent(Kingdevick.this, Kingdevick2.class);
            startActivity(k);
        }

    }

    public void onButtonClickkd3(View v)
    {
        if(v.getId() == R.id.kd3)
        {
            Intent l = new Intent(Kingdevick.this, Kingdevick3.class);
            startActivity(l);
        }

    }

    public void onButtonClickhome(View v)
    {
        if(v.getId() == R.id.home)
        {
            Intent l = new Intent(Kingdevick.this, MainActivity.class);
            startActivity(l);
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



}




