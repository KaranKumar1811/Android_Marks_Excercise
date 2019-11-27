package com.example.android_marks_excercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Marks marks;
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

        iosMarks.setText(marks.getmIos());
        androidMarks.setText(marks.getmAndroid());
        javaMarks.setText(marks.getmJava());
        dbmsMarks.setText(marks.getmDBMS());
        swiftMarks.setText(marks.getmSwift());

    }
}
