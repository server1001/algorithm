package com.example.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  /*  int[] array=new int[]{1,2,3,4};*/

    int array[]={0,1,2,3,4,5,6,7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayOption option=new ArrayOption(array,8);
        option.insert(0,89);
        option.insert(4,82);
        option.delete(2);
        option.systemOut();
    }
}
