package com.example.iDoC;

import android.app.Activity;
import android.os.Bundle;

import com.example.nicksimard.idoc_mar_9_home.R;

/**
 * Created by nicksimard on 16-03-10.
 */
public class Saccade extends Activity{

    Camera2VideoSac c2v = Camera2VideoSac.newInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saccade);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, c2v)
                    .commit();
        }
    }

}
