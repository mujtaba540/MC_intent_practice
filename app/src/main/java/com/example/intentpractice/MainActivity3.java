package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView msg;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg=findViewById(R.id.result);
        back=findViewById(R.id.back);

        Intent i=getIntent();
        String temp=i.getStringExtra("name");
        if(temp!=null){
            String res="Welcome "+temp+" to second Activity";
            msg.setText(res);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity3.this,MainActivity.class);
                        startActivity(j);
            }
        });
    }
}