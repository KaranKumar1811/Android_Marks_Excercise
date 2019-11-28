package com.example.android_marks_excercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Marks marks=new Marks();
    TextView iosMarks,androidMarks,javaMarks,dbmsMarks,swiftMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        iosMarks=findViewById(R.id.mIosView);
        androidMarks=findViewById(R.id.mAndroidView);
        javaMarks=findViewById(R.id.mJavaView);
        dbmsMarks=findViewById(R.id.mDbmsView);
        swiftMarks=findViewById(R.id.mSwiftView);



        Marks m = (Marks) getIntent().getSerializableExtra("marks");


    iosMarks.setText("iOS : "+String.valueOf(m.getmIos()));
    androidMarks.setText("Android : "+String.valueOf(m.getmAndroid()));
    javaMarks.setText(String.valueOf("Java : "+m.getmJava()));
    swiftMarks.setText(String.valueOf("Swift : "+m.getmSwift()));
    dbmsMarks.setText(String.valueOf("DBMS : "+m.getmDBMS()));


    }
}
