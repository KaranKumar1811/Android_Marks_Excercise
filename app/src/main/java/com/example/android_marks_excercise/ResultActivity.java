package com.example.android_marks_excercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class ResultActivity extends AppCompatActivity {

    Marks marks;
    Marks m ;
    TextView iosMarks,androidMarks,javaMarks,dbmsMarks,swiftMarks,showres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        iosMarks=findViewById(R.id.mIosView);
        androidMarks=findViewById(R.id.mAndroidView);
        javaMarks=findViewById(R.id.mJavaView);
        dbmsMarks=findViewById(R.id.mDbmsView);
        swiftMarks=findViewById(R.id.mSwiftView);
        showres=findViewById(R.id.calculationShow);
        
    m = (Marks) getIntent().getSerializableExtra("marks");

    iosMarks.setText("iOS : "+String.valueOf(m.getmIos()));
    androidMarks.setText("Android : "+String.valueOf(m.getmAndroid()));
    javaMarks.setText(String.valueOf("Java : "+m.getmJava()));
    swiftMarks.setText(String.valueOf("Swift : "+m.getmSwift()));
    dbmsMarks.setText(String.valueOf("DBMS : "+m.getmDBMS()));
    showres.setText("Max : "+ max()+" Min : "+min()+" Avg : "+avg());




    }

public int max(){
        int[] nums={m.getmSwift(),m.getmIos(),m.getmDBMS(),m.getmAndroid(),m.getmJava()};
    Arrays.sort(nums);
        return nums[0];
}

    public int min(){
        int[] num={m.getmSwift(),m.getmIos(),m.getmDBMS(),m.getmAndroid(),m.getmJava()};
        Arrays.sort(num);
        return num[num.length-1];
    }
    public int avg(){
        int[] num={m.getmSwift(),m.getmIos(),m.getmDBMS(),m.getmAndroid(),m.getmJava()};
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        return sum/num.length;
    }
}
