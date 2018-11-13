package com.media.tecinfo.simulandochamada;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    SharedPreferences meusdados;
    public static final String mypreferences= "call";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        meusdados = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);
        final EditText email = findViewById(R.id.btn_log);
        final EditText senha = findViewById(R.id.btn_senha);
        final EditText senha2 = findViewById(R.id.btn_s2);
        Button home = (Button) findViewById(R.id.btn_home);
        Button cadastrar = (Button) findViewById(R.id.btn_cad);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Activity2.this,Activity3.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (senha.getText().toString().equals(senha2.getText().toString())){
                    SharedPreferences.Editor editor = meusdados.edit();
                    editor.putString("email",email.getText().toString());
                    editor.putString("senha", senha2.getText().toString());
                    editor.commit();
                    Intent intent = new Intent(Activity2.this, MainActivity.class);
                    startActivity(intent);
                    finish();


                }else{
                    Toast.makeText(getApplicationContext(),"as senhas não correspondem", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
