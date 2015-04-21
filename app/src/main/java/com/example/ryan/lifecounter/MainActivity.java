package com.example.ryan.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.app.Activity;

public class MainActivity extends Activity implements View.OnClickListener {

    private int p1 = 20;
    private int p2 = 20;
    private int p3 = 20;
    private int p4 = 20;
    private Boolean out[] = {false, false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonp1p5 = (Button) findViewById(R.id.p1p5); //player one buttons
        buttonp1p5.setOnClickListener(this);
        Button buttonp1p1 = (Button) findViewById(R.id.p1p1);
        buttonp1p1.setOnClickListener(this);
        Button buttonp1m1 = (Button) findViewById(R.id.p1m1);
        buttonp1m1.setOnClickListener(this);
        Button buttonp1m5 = (Button) findViewById(R.id.p1m5);
        buttonp1m5.setOnClickListener(this);
        Button buttonp2p5 = (Button) findViewById(R.id.p2p5); //player two buttons
        buttonp2p5.setOnClickListener(this);
        Button buttonp2p1 = (Button) findViewById(R.id.p2p1);
        buttonp2p1.setOnClickListener(this);
        Button buttonp2m1 = (Button) findViewById(R.id.p2m1);
        buttonp2m1.setOnClickListener(this);
        Button buttonp2m5 = (Button) findViewById(R.id.p2m5);
        buttonp2m5.setOnClickListener(this);
        Button buttonp3p5 = (Button) findViewById(R.id.p3p5); //player three buttons
        buttonp3p5.setOnClickListener(this);
        Button buttonp3p1 = (Button) findViewById(R.id.p3p1);
        buttonp3p1.setOnClickListener(this);
        Button buttonp3m1 = (Button) findViewById(R.id.p3m1);
        buttonp3m1.setOnClickListener(this);
        Button buttonp3m5 = (Button) findViewById(R.id.p3m5);
        buttonp3m5.setOnClickListener(this);
        Button buttonp4p5 = (Button) findViewById(R.id.p4p5); // player four buttons
        buttonp4p5.setOnClickListener(this);
        Button buttonp4p1 = (Button) findViewById(R.id.p4p1);
        buttonp4p1.setOnClickListener(this);
        Button buttonp4m1 = (Button) findViewById(R.id.p4m1);
        buttonp4m1.setOnClickListener(this);
        Button buttonp4m5 = (Button) findViewById(R.id.p4m5);
        buttonp4m5.setOnClickListener(this);
    }

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.p1p5: //player one buttons
                p1 += 5;
                break;
            case R.id.p1p1:
                p1 += 1;
                break;
            case R.id.p1m1:
                p1 -= 1;
                break;
            case R.id.p1m5:
                p1 -= 5;
                break;
            case R.id.p2p5: //player two buttons
                p2 += 5;
                break;
            case R.id.p2p1:
                p2 += 1;
                break;
            case R.id.p2m1:
                p2 -= 1;
                break;
            case R.id.p2m5:
                p2 -= 5;
                break;
            case R.id.p3p5: //player three buttons
                p3 += 5;
                break;
            case R.id.p3p1:
                p3 += 1;
                break;
            case R.id.p3m1:
                p3 -= 1;
                break;
            case R.id.p3m5:
                p3 -= 5;
                break;
            case R.id.p4p5: //player four buttons
                p4 += 5;
                break;
            case R.id.p4p1:
                p4 += 1;
                break;
            case R.id.p4m1:
                p4 -= 1;
                break;
            case R.id.p4m5:
                p4 -= 5;
                break;
        }
        TextView t = (TextView)findViewById(R.id.report);
        if (p1 == 0 && !out[0]) {
            t.setText("Player 1 LOSES!");
            out[0] = true;
            TextView p = (TextView)findViewById(R.id.textView);
            p.setTextColor(0xffff0000);
        } else if (p2 == 0 && !out[1]) {
            t.setText("Player 2 LOSES!");
            out[1] = true;
            TextView p = (TextView)findViewById(R.id.textView2);
            p.setTextColor(0xffff0000);
        } else if (p3 == 0 && !out[2]) {
            t.setText("Player 3 LOSES!");
            out[2] = true;
            TextView p = (TextView)findViewById(R.id.textView3);
            p.setTextColor(0xffff0000);
        } else if (p4 == 0 && !out[3]) {
            t.setText("Player 4 LOSES!");
            out[3] = true;
            TextView p = (TextView)findViewById(R.id.textView4);
            p.setTextColor(0xffff0000);
        }
        TextView text1 = (TextView) findViewById(R.id.textView);
        text1.setText("Lives left: " + String.valueOf(p1));
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setText("Lives left: " + String.valueOf(p2));
        TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setText("Lives left: " + String.valueOf(p3));
        TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setText("Lives left: " + String.valueOf(p4));
    }
}
