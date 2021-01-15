package com.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * WebView 配置
 */

public class WebActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    Button button;

    WebView webView;
    Integer a = 128;
    Integer b = 128;
    Integer c = 3;
    Integer d = 3;
    Integer e = 127;
    Integer f = 127;
    String url = "http://112.13.96.226:20081/dph5/?originalText=%E9%81%A5%E6%8E%A7%E5%99%A8%E6%97%A0%E6%B3%95%E4%BD%BF%E7%94%A8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyQueue myQueue=new MyQueue(8);
        try {
            myQueue.enQueue(5);
            myQueue.enQueue(1);
            myQueue.enQueue(3);
            myQueue.enQueue(2);

            myQueue.enQueue(15);
            myQueue.enQueue(98);
            myQueue.enQueue(1543);
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.enQueue(66878);
            myQueue.enQueue(865);
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.deQueue();
            myQueue.sysout();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

/*        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);*/
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // webView.loadUrl(url);
//                Log.e("============", getDeviceSN01());
//                Log.e("============get ", get(WebActivity.this,"persist.sys.sjos.serialno"));
//
//                shellExec();
//
//            }
//        });


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    public String getTime(long time) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");// HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());
        // time1.setText("Date获取当前日期时间"+simpleDateFormat.format(date));
        return simpleDateFormat.format(date);
    }


}
