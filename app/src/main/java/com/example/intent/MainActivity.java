package com.example.intent;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
        public static final String Efn = "com.example.MyIndent.Efn";
        public static final String Eus = "com.example.MyIndent.Eus";
        public static final String Ed = "com.example.MyIndent.Ed";
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button button = (Button) findViewById(R.id.Btn);
            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view)
                {
                    DisActivity();

                }
            });
        }
    public void DisActivity() {
        EditText et1 = (EditText) findViewById(R.id.Name);
        EditText et2 = (EditText) findViewById(R.id.Usn);
        EditText et3 = (EditText) findViewById(R.id.Dep);

        String fn = et1.getText().toString();
        String usn = et2.getText().toString();
        String dept = et3.getText().toString();

        Intent intent = new Intent(this,DisplayActivity.class);
        intent.putExtra(Efn,fn);
        intent.putExtra(Eus,usn);
        intent.putExtra(Ed,dept);
        startActivity(intent);


    }
}