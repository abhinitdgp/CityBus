package com.example.citybus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Abhishek on 04-12-2016.
 */

public class home extends Activity implements View.OnClickListener {

    private Button b1, b2, b3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        b1 = (Button) findViewById(R.id.log);
        b2 = (Button) findViewById(R.id.reg);
        b3 = (Button) findViewById(R.id.gue);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.gue) {
            Intent i = new Intent("com.example.citybus.MainActivity");
            startActivity(i);
        }
        /*switch (v.getId()) {
            case R.id.log: {
                Intent i = new Intent("com.example.citybus.login");
                startActivity(i);

            }
            break;
            case R.id.reg: {
                Intent i = new Intent("com.example.citybus.register");
                startActivity(i);

            }
            break;
            case R.id.gue: {
                Intent i = new Intent("com.example.citybus.MainActivity");
                startActivity(i);

            }
            break;
        }*/
    }
}