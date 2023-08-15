package com.example.intent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        String s1 = intent.getStringExtra(MainActivity.Efn);
        String s2 = intent.getStringExtra(MainActivity.Eus);
        String s3 = intent.getStringExtra(MainActivity.Ed);

        TextView t1 = (TextView) findViewById(R.id.nam);
        TextView t2 = (TextView) findViewById(R.id.us);
        TextView t3 = (TextView) findViewById(R.id.Dept);


        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);

    }

}
