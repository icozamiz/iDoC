package com.example.nicksimard.idoc_mar_9_home;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by nicksimard on 16-03-10.
 */
public class Antisaccade extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antisaccade);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2VideoAntiSac.newInstance())
                    .commit();
        }

    }

}
