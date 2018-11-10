package com.example.disneys.lrt2elearning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InitialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        Intent i = new Intent(this,myService.class);
        startService(i);
    }

    //choose location on google maps
    public void displayMap(View v){
        Intent i = null;
        if(v.getId()==R.id.chooseLocation){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:0,0?q=lrt2"));
            startActivity(i);
        }
    }
}
