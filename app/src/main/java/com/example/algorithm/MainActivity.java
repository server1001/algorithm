package com.example.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.io.File;
import java.util.Arrays;

import dalvik.system.DexClassLoader;

public class MainActivity extends AppCompatActivity {

    /*  int[] array=new int[]{1,2,3,4};*/
    String TAG = "MainActivity";
    int array[] = {0, 1, 2, 3, 4, 5, 6, 7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayOption option = new ArrayOption(array, 8);
        option.insert(0, 89);
        option.insert(4, 82);
        option.delete(2);
        option.systemOut();

        int a = (11 - 2) / 2;
        Log.e(TAG, "    输出值    " + a);
        //测试提交
  /*      File file=this.getDir("dex",0);
        String path=file.getAbsolutePath();
        DexClassLoader dexClassLoader=new DexClassLoader("dsd",path,null,getClassLoader());
        try {
            dexClassLoader.loadClass("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/





        array = new int[]{7, 8, 9, 4, 2, 6, 10, 1, 5};
        BinaryHeapOption.structrueHeap(array);
        Log.e(TAG, "structrueHeap: "+ Arrays.toString(array));
        array = new int[]{1, 2, 6, 4, 7, 9, 10, 8, 5,3};
        BinaryHeapOption.upHeap(array);
        Log.e(TAG, "upHeap: "+ Arrays.toString(array));

    }
}
