package com.example.iDoC;

import android.app.Activity;
import android.os.Bundle;

import com.example.nicksimard.idoc_mar_9_home.R;

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
