package com.rst.rishav.ganesh_loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_Ganesh extends AppCompatActivity {

    EditText user,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__ganesh);
        user= (EditText) findViewById(R.id.user);
        pass= (EditText) findViewById(R.id.passw);
        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=user.getText().toString();
                String s2 = pass.getText().toString();
                Intent i = new Intent(MainActivity_Ganesh.this,Result.class);
                i.putExtra("username",s1);
                i.putExtra("Password",s2);
                startActivity(i);

            }
        });

    }
}
