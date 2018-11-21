package com.example.disneys.lrt2elearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {
    TextView tQuestion,tStation,tScore;
    Button bA, bB, bC, bD;
    question_answer_logic qal = new question_answer_logic();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Intent i = new Intent(this,myService.class);
        startService(i);
        tQuestion = findViewById(R.id.tvQuestion);
        tStation = findViewById(R.id.tvStation);
        tScore = findViewById(R.id.tvScore);
        bA = findViewById(R.id.btnA);
        bB = findViewById(R.id.btnB);
        bC = findViewById(R.id.btnC);
        bD = findViewById(R.id.btnD);
        Bundle extras = getIntent().getExtras();
        String value = null;
        if (extras != null) {
            value = extras.getString("station");
        }
        tStation.setText(value + " Station");
        String question = "error";
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        switch (value){
            case "Recto":
                question = qal.question1;
                a = qal.a1;
                b = qal.b1;
                c = qal.c1;
                d = qal.d1;
                break;
            case "Legarda":
                question = qal.question2;
                a = qal.a2;
                b = qal.b2;
                c = qal.c2;
                d = qal.d2;
                break;
            case "Pureza":
                question = qal.question3;
                a = qal.a3;
                b = qal.b3;
                c = qal.c3;
                d = qal.d3;
                break;
            case "V.Mapa":
                question = qal.question4;
                a = qal.a4;
                b = qal.b4;
                c = qal.c4;
                d = qal.d4;
                break;
            case "J.Ruiz":
                question = qal.question5;
                a = qal.a5;
                b = qal.b5;
                c = qal.c5;
                d = qal.d5;
                break;
            case "Gilmore":
                question = qal.question6;
                a = qal.a6;
                b = qal.b6;
                c = qal.c6;
                d = qal.d6;
                break;
            case "Belmonte":
                question = qal.question7;
                a = qal.a7;
                b = qal.b7;
                c = qal.c7;
                d = qal.d7;
                break;
            case "Cubao":
                question = qal.question8;
                a = qal.a8;
                b = qal.b8;
                c = qal.c8;
                d = qal.d8;
                break;
            case "Anonas":
                question = qal.question9;
                a = qal.a9;
                b = qal.b9;
                c = qal.c9;
                d = qal.d9;
                break;
            case "Katipunan":
                question = qal.question10;
                a = qal.a10;
                b = qal.b10;
                c = qal.c10;
                d = qal.d10;
                break;
            case "Santolan":
                question = qal.question11;
                a = qal.a11;
                b = qal.b11;
                c = qal.c11;
                d = qal.d11;
                break;
        }
        tQuestion.setText(question);
        tScore.setText("Your Score: " + qal.getPoints());
        bA.setText(a);
        bB.setText(b);
        bC.setText(c);
        bD.setText(d);
    }

    public void checkAnswers(View v){
        tScore = findViewById(R.id.tvScore);
        Button b = (Button) v;
        String btnText = b.getText().toString();
        Bundle extras = getIntent().getExtras();
        String value = null;
        if (extras != null) {
            value = extras.getString("station");
        }
        switch (value){
            case "Recto":
                if(btnText.equals(qal.answer1)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Legarda":
                if(btnText.equals(qal.answer2)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Pureza":
                if(btnText.equals(qal.answer3)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "V.Mapa":
                if(btnText.equals(qal.answer4)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "J.Ruiz":
                if(btnText.equals(qal.answer5)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Gilmore":
                if(btnText.equals(qal.answer6)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Belmonte":
                if(btnText.equals(qal.answer7)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Cubao":
                if(btnText.equals(qal.answer8)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Anonas":
                if(btnText.equals(qal.answer9)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Katipunan":
                if(btnText.equals(qal.answer10)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
            case "Santolan":
                if(btnText.equals(qal.answer11)) {
                    qal.points += 1;
                    qal.setPoints(qal.points);
                }else
                    qal.points -= 1;
                break;
        }
       tScore.setText("Your Points: " + qal.getPoints());
    }

    public void checkScore(View v){
        Toast.makeText(this, "Your score is: " + qal.points,Toast.LENGTH_LONG).show();
    }
}
