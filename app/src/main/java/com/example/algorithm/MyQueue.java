package com.example.algorithm;

import android.util.Log;

/**
 * 循环队列
 */
public class MyQueue {

    private  int front;
    private int rear;
    private int[] array;


    public MyQueue(int size){
        array=new int[size];
    }

    public void enQueue(int element) throws Exception {
        if ((rear+1)%array.length==front){
            throw  new Exception("队列已满");
        }
        array[rear]=element;
        rear=(rear+1)%array.length;
    }

    public int deQueue() throws Exception {
        if (rear==front){
            throw new Exception("队列已空");
        }

        int deQueue=array[front];
        front=(front+1)%array.length;
        return deQueue;
    }

    public void sysout(){
        for (int i = 0; i < array.length; i++) {
            Log.e("==========","array     "+array[i]);
        }
    }

}
