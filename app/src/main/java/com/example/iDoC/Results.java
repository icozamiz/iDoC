package com.example.iDoC;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nicksimard.idoc_mar_9_home.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by nicksimard on 16-03-10.
 */
public class Results extends Activity {

    private static String pupresult;
    private static String sacresult;
    private static String asacresult;
    private static int kd1resultScore;
    private static long kd1resultTime;
    private static int kd2resultScore;
    private static long kd2resultTime;
    private static int kd3resultScore;
    private static long kd3resultTime;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        final TextView kd1score = (TextView) findViewById(R.id.scorekd1);
        final TextView kd2score = (TextView) findViewById(R.id.scorekd2);
        final TextView kd3score = (TextView) findViewById(R.id.scorekd3);
        final TextView kd1time = (TextView) findViewById(R.id.timekd1);
        final TextView kd2time = (TextView) findViewById(R.id.timekd2);
        final TextView kd3time = (TextView) findViewById(R.id.timekd3);

        kd1score.setText("Your score for King Devick 1 is: " + this.kd1resultScore);
        kd2score.setText("Your score for King Devick 2 is: " + this.kd2resultScore);
        kd3score.setText("Your score for King Devick 3 is: " + this.kd3resultScore);
        kd1time.setText("Your time for King Devick 1 is: " + (int) this.kd1resultTime);
        kd2time.setText("Your time for King Devick 2 is: " + (int) this.kd2resultTime);
        kd3time.setText("Your time for King Devick 3 is: " + (int) this.kd3resultTime);







/*        // CHECK IF seRVer iS RUNNING
        String response_serv_pup = checkServerpup();
        String response_serv_sac = checkServersac();
        String response_serv_asac = checkServerasac();
        Log.i("serverstuff", "SERVER STATUS IS :::::::::::::::::::::::" + response_serv_pup);
        Log.i("serverstuff", "SERVER STATUS IS :::::::::::::::::::::::" + response_serv_sac);
        Log.i("serverstuff", "SERVER STATUS IS :::::::::::::::::::::::" + response_serv_asac);*/

    }


/*    public String checkServerpup() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://idoc.iansinke.com/results/1" + Camera2VideoFragment.serverResponsePup)
                .build();

        try {
            Call call = client.newCall(request);
            Response response = call.execute();
            return pupresult = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("SERVER RESPONSE TO ME:::::::::::::::::::" + pupresult);
        return "";
    }

    public String checkServersac() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://idoc.iansinke.com/results/2" + Camera2VideoSac.serverResponseSac)
                .build();

        try {
            Call call = client.newCall(request);
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("SERVER RESPONSE TO ME:::::::::::::::::::" + sacresult);
        return "";
    }


    public String checkServerasac() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://idoc.iansinke.com/results/3" + Camera2VideoAntiSac.serverResponseAsac)
                .build();

        try {
            Call call = client.newCall(request);
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("SERVER RESPONSE TO ME:::::::::::::::::::" + asacresult);
        return "";
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    public String getPupResult(){
        return pupresult;
    }
    public void setPupResult(String pupResult){
        this.pupresult = pupResult;
    }

    public String getSacResult(){
        return sacresult;
    }
    public void setSacResult(String sacResult){
        this.sacresult = sacResult;
    }

    public String getAsacResult() {
        return asacresult;
    }
    public void setAsacResult(String asacResult){
        this.asacresult = asacResult;
    }


    public void setKd2result(int kd2Result, long time) {
        this.kd2resultScore = kd2Result;
        this.kd2resultTime = time;
    }

    public void setKd1result(int kd1Result, long time) {
        this.kd1resultScore = kd1Result;
        this.kd1resultTime = time;
    }

    public void setKd3result(int kd3Result, long time) {
        this.kd3resultScore = kd3Result;
        this.kd3resultTime = time;
    }

}