package com.media.tecinfo.simulandochamada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button home = (Button) findViewById(R.id.btn_home);

        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnhash = (Button) findViewById(R.id.btn_hash);
        final Button ligar = (Button) findViewById(R.id.btn_ligar);
        final Button del = (Button) findViewById(R.id.btn_C);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }
}
