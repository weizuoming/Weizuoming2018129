package com.example.hello.weizuoming2018129;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private MyCalendar mMyCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyCalendar= findViewById(R.id.mycalendar);
        mMyCalendar.setOnCalendarClick(new MyCalendar.MyCalendarclickListener() {
            @Override
            public void onCalendarItemClick(Date date) {
                SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日");
                Toast.makeText(getApplicationContext(),"今天是"+format.format(date)+"签到成功",Toast.LENGTH_LONG).show();
            }

        });
    }
}
