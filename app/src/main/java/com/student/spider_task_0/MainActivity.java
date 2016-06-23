package com.student.spider_task_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Increment(View view) {
        counter++;
        TextView number = (TextView) findViewById(R.id.textView);
        number.setText(String.valueOf(counter));
    }

    public void Reset(View view) {
        counter = 0;
        TextView number = (TextView) findViewById(R.id.textView);
        number.setText(String.valueOf(counter));
    }
}
