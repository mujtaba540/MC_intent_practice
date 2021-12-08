package com.example.intentpractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
   Button one,two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       one=findViewById(R.id.dialogue);
       two=findViewById(R.id.button2);

       String[] data={"Ali","aasd","asd"};
       one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               AlertDialog.Builder temp=new AlertDialog.Builder(MainActivity3.this);

               temp.setMessage("Hello");
               temp.setTitle("How are you");
               temp.setCancelable(false);
               temp.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(MainActivity3.this, "Good", Toast.LENGTH_SHORT).show();
                   }
               });
               temp.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(MainActivity3.this, "BAD", Toast.LENGTH_SHORT).show();
                   }
               });

               temp.create().show();

           }
       });

       two.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               AlertDialog.Builder temp=new AlertDialog.Builder(MainActivity3.this);

               temp.setItems(data, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(MainActivity3.this, data[which], Toast.LENGTH_SHORT).show();
                   }
               });
               temp.create().show();

           }
       });
    }
}