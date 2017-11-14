package com.example.hiteshyadav.additionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1;

    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button);
        et1 = (EditText)findViewById(R.id.editText3);
        et2 = (EditText)findViewById(R.id.editText4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg1 = et1.getText().toString();
                String msg2 = et2.getText().toString();

                int msg11 = Integer.parseInt(msg1);
                int msg12 = Integer.parseInt(msg2);

                Intent intent1 = new Intent(getApplicationContext() , next.class);
                intent1.putExtra("num1" , msg11);
                intent1.putExtra("num2" , msg12);

                startActivity(intent1);

                finish();
            }
        });

    }
}
