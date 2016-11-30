package com.example.zjt.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zjt.viewdemo.bean.PieData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyView myview = (MyView) findViewById(R.id.myview);

        ArrayList<PieData> list = new ArrayList<>();
        //list.add();
        //myview.setPieDatas(null);
    }

}