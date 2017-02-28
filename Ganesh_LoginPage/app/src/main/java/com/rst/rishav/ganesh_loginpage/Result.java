package com.rst.rishav.ganesh_loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t= (TextView) findViewById(R.id.result);
        Intent i1 = new Intent();
        String s3 = i1.getStringExtra("username");
        String s4 = i1.getStringExtra("Password");
        String s5 = s3+s4;
        t.setText(s5);


    }
}
