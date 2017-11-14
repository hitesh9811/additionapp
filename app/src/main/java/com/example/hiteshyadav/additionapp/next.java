package com.example.hiteshyadav.additionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class next extends AppCompatActivity {

    TextView t1;
    TextView t2;
    int num11 , num12 , sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        t1 = (TextView)findViewById(R.id.textView2);
        t2 = (TextView)findViewById(R.id.textView);

        Intent intent1 = getIntent();
        Intent intent2 = getIntent();

        num11 = intent1.getIntExtra("num1" , num11);
        num12 = intent1.getIntExtra("num2" , num12);

        sum += (num11 + num12);

        String result = String.valueOf(sum);

        t2.setText(result);






    }
}
