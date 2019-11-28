package com.example.android_marks_excercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Marks m;
    EditText ios,swift,java,android,dbms;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ios=findViewById(R.id.iosEditTxt);
        swift=findViewById(R.id.swiftEditTxt);
        java= findViewById(R.id.javaEditTxt);
        android=findViewById(R.id.androidEditTxt);
        dbms=findViewById(R.id.dbmsEditTxt);
        cal=findViewById(R.id.calculateBtn);



        cal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view)
           {
               Intent i = new Intent(MainActivity.this,ResultActivity.class);
               m = new Marks();

               m.setmAndroid(Integer.parseInt(android.getText().toString()));
               m.setmDBMS(Integer.parseInt(dbms.getText().toString()));
               m.setmIos(Integer.parseInt(ios.getText().toString()));
               m.setmJava(Integer.parseInt(java.getText().toString()));
               m.setmSwift(Integer.parseInt(swift.getText().toString()));

               i.putExtra("marks", m);

               startActivity(i);

           }
       });

    }




}
