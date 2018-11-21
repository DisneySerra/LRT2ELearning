package com.example.disneys.lrt2elearning;

import android.content.Intent;
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

    public void displayQuestions(View v){
        String station = "no station";
        switch(v.getId()){
            case R.id.btnRecto:
                station = "Recto";
                break;
            case R.id.btnLegarda:
                station = "Legarda";
                break;
            case R.id.btnPureza:
                station = "Pureza";
                break;
            case R.id.btnVMapa:
                station = "V.Mapa";
                break;
            case R.id.btnJRuiz:
                station = "J.Ruiz";
                break;
            case R.id.btnGilmore:
                station = "Legarda";
                break;
            case R.id.btnBelmonte:
                station = "Belmonte";
                break;
            case R.id.btnCubao:
                station = "Cubao";
                break;
            case R.id.btnAnonas:
                station = "Anonas";
                break;
            case R.id.btnSantolan:
                station = "Santolan";
                break;
        }
        Intent i = new Intent(this,Questions.class);
        i.putExtra("station", station);
        startActivity(i);
    }
}
