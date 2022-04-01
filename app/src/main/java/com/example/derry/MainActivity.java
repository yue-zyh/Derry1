package com.example.derry;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView b1;
    private TextView b2;
    private TextView b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv_one = findViewById(R.id.tv_one);
//        tv_one.setText("兔宝");
//        tv_one.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
        b1 = (TextView) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);

        List<String>  datalist = new ArrayList<>();
        datalist.add("小白");
        datalist.add("大白");
        datalist.add("大大白");
        System.out.println("=================="+datalist.size());
        for (int i = 0; i < datalist.size(); i++) {
            System.out.println("=========="+datalist.get(i));

            String name  = datalist.get(i);


        }
        b1.setText(datalist.get(0));
        b2.setText(datalist.get(1));
        b3.setText(datalist.get(2));


    }
}